package ProyectoPrueba;

import java.util.ArrayList;
import objetos.TipoPro;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import objetos.cliente;
import objetos.idventa;
import objetos.precio;
import objetos.producto;
import objetos.proveedor;
import objetos.ventas;

public class Modelo {
    public ArrayList<TipoPro> getTipo(){
        Connection con = conexion.conexion;
        Statement stmt;
        ResultSet rs;
        ArrayList<TipoPro> listatipo = new ArrayList<>();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM tipproducto");
            while(rs.next()){
                TipoPro pais = new TipoPro();
                pais.setId(rs.getInt("id"));
                pais.setNombre(rs.getString("nombre"));
                listatipo.add(pais);
                
            }
            
        }catch(Exception ex){
        
        }
        return listatipo;
        
    }
    public ArrayList<proveedor> getProveedor(){
       Connection con = conexion.conexion;
       Statement stmt;
       ResultSet rs;
       ArrayList<proveedor>listaProveedor = new ArrayList<>();
       try{
           stmt = con.createStatement();
           rs = stmt.executeQuery("SELECT * FROM preventistas");
           while (rs.next()){
               proveedor proveedor = new proveedor();
               proveedor.setIdpreventista(rs.getInt("idpreventista"));
               proveedor.setNombre(rs.getString("nombre"));
               listaProveedor.add(proveedor);
           }
       }catch (Exception er){
           
       }
       return listaProveedor;
    }
    public ArrayList<cliente> getCliente(){
        Connection con = conexion.conexion;
        Statement stmt;
        ResultSet rs;
        ArrayList<cliente>listaCliente = new ArrayList<>();
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM clientes");
            while(rs.next()){
                cliente cli = new cliente();
                cli.setId(rs.getInt("id"));
                cli.setDni(rs.getString("dni"));
                cli.setNombre(rs.getString("nombre"));
                listaCliente.add(cli);
            }
        }catch(Exception ez){
            
        }
        return listaCliente;
    }
    public ArrayList<producto> getProducto(){
        Connection con = conexion.conexion;
        Statement stmt;
        ResultSet rs;
        ArrayList<producto> listaProducto = new ArrayList<>();
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT id,nombre FROM producto");
            while(rs.next()){
                producto pro = new producto();
                pro.setId(rs.getInt("id"));
                pro.setNombre(rs.getString("nombre"));
                listaProducto.add(pro);
            }
        }catch(Exception er){
            
        }
        return listaProducto;
    }
    public ArrayList<precio> getPrecio(){
         Connection con = conexion.conexion;
        Statement stmt;
        ResultSet rs;
        ArrayList<precio> listaPrecio = new ArrayList<>();
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT id,nombre,precioventa FROM producto");
            while(rs.next()){
                precio pre = new precio();
                pre.setId(rs.getInt("id"));
                pre.setNombre(rs.getString("nombre"));
                pre.setPrecio(rs.getFloat("precioventa"));
                listaPrecio.add(pre);
            }
        }catch(Exception er){
            
        }
        return listaPrecio;
    }
    public ArrayList<idventa> getIdventa(){
        Connection con = conexion.conexion;
        Statement stmt;
        ResultSet rs;
        ArrayList<idventa> listaIdventa = new ArrayList<>();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT id,idventa FROM maestro");
            while(rs.next()){
                idventa idve = new idventa();
                idve.setId(rs.getInt("id"));
                idve.setIdventa(rs.getString("idventa"));
                listaIdventa.add(idve);
            }
        } catch (Exception e) {
        }
        return listaIdventa;
    }
    
    
}
