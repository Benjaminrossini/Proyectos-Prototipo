package ProyectoPrueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class conexion {
    String ip = null;
    String puerto = null;
    String bd = null;
    String usuario = null;
    String clave = null;
    
    private String controlador = "com.mysql.cj.jdbc.Driver";//"com.mysql.jdbc.Driver"; 
    private String url = null; 
    private String salida = null;
    
    public static Connection conexion = null;
    
    private Statement instruccion = null;
    private ResultSet conjuntoResultados = null;
    
    public conexion() {
        super();
    }
    public void getconexion() {
       try {
          if(conexion == null) {
            url = "jdbc:mysql://" + ip + ":" + puerto +"/" + bd;
            Class.forName(controlador);
            conexion = DriverManager.getConnection(url, usuario, clave);
          }else{
              JOptionPane.showMessageDialog(null, "Ya existe una conexi�n a MySQL");  
          }
          instruccion = conexion.createStatement();
           
          String sql = "select * from producto;"; 
          conjuntoResultados = instruccion.executeQuery(sql);
          
          ResultSetMetaData metaDatos = conjuntoResultados.getMetaData();
          int numeroDeColumnas = metaDatos.getColumnCount();
          
           salida = "Informaci�n del sistema:\n";
          

           for ( int i = 1; i <= numeroDeColumnas; i++ ) {
             salida = salida + "\t" +  metaDatos.getColumnName( i );
             System.out.printf("\n");   
            
           }
           salida = salida + "\n";
            //System.out.println();

            while ( conjuntoResultados.next() )             {
                for ( int i = 1; i <= numeroDeColumnas; i++ )
                salida = salida + "\t" + conjuntoResultados.getObject( i );
                salida = salida + "\n";
            } // fin de while           
            
        }catch(Exception er) {
            salida = "Error 3:" + er.getMessage() + "\n";  conexion = null;
            
         }
       /*
       catch(SQLException er) {
           salida = "Error 1:" + er.getMessage() + "\n"; conexion = null;
           //JOptionPane.showMessageDialog(null, "Error 1:" + er.getMessage());
        }catch(ClassNotFoundException er) {
            salida = "Error 2:" + er.getMessage() + "\n"; conexion = null;
            //JOptionPane.showMessageDialog(null, "Error 2:"  + er.getMessage());
        }
        */
       //finally{
        //   salida = salida + "\n" + "Conexi�n exitosa";       
       //  }

       // return conexion;
    }
    public void setDatos(String ip, String puerto, String bd,
                         String usuario, String clave) {
        this.ip = ip;
        this.puerto = puerto;
        this.bd = bd;
        this.usuario = usuario;
        this.clave = clave;
    }
    public String getSalida() {
        return salida;
    }
    public Connection getCon(){
     return conexion;   
    }
}
