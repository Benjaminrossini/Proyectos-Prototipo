package ProyectoPrueba;

import static ProyectoPrueba.conexion.conexion;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import objetos.cliente;
import objetos.idventa;
public class buscarventa extends javax.swing.JFrame {


    public buscarventa() {
        initComponents();
        llenarCliente();
        llenarIdventa();
    }
    private void llenarCliente(){
        Modelo mod = new Modelo();
        ArrayList<cliente> listaCliente = mod.getCliente();
        jComboBox1.removeAll();
        for(int i = 0;i<listaCliente.size();i++){
            jComboBox1.addItem(new cliente(listaCliente.get(i).getId(),listaCliente.get(i).getDni(),listaCliente.get(i).getNombre()));
        }
    }
    private void llenarIdventa(){
        Modelo mod = new Modelo();
        ArrayList<idventa> listaIdventa = mod.getIdventa();
        jComboBox2.removeAll();
        for (int i = 0; i < listaIdventa.size(); i++) {
            jComboBox2.addItem(new idventa(listaIdventa.get(i).getId(),listaIdventa.get(i).getIdventa()));
            
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Venta a buscar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("DNI Cliente");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Buscar Ventas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton2.setText("Buscar Detalle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Statement instruccion = null;
        ResultSet conjuntoResultados = null;
        try {
            instruccion = conexion.createStatement();
            String sql = "SELECT * FROM maestro WHERE dni = '"+ this.jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).getDni() +"'";  
            conjuntoResultados = instruccion.executeQuery(sql);
            ResultSetMetaData metaDatos = conjuntoResultados.getMetaData();
            
            int numeroDeColumnas = metaDatos.getColumnCount();
            this.jTextArea1.setText("Ventas encontrados.\n");
            for ( int i = 1; i <= numeroDeColumnas; i++ ) {
              
                //this.jTextArea3.setText(jTextArea3.getText());
                jTextArea1.setText(jTextArea1.getText() + "\t" + metaDatos.getColumnName( i ) );
            }      
            jTextArea1.setText(jTextArea1.getText()+ "\n");
            while(conjuntoResultados.next()) {
              for ( int i = 1; i <= numeroDeColumnas; i++ ) {
                this.jTextArea1.setText(this.jTextArea1.getText() + "\t" + conjuntoResultados.getObject(i));
              }      
              
            this.jTextArea1.setText(this.jTextArea1.getText() + "\n");
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Statement instruccion = null;
        ResultSet conjuntoResultados = null;
        try {
            String idventa = this.jComboBox2.getItemAt(jComboBox2.getSelectedIndex()).getIdventa();
            String dni = this.jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).getDni();
            instruccion = conexion.createStatement();
            String sql = "SELECT * FROM listacom WHERE dni = '"+ dni + "'and idventa = " + idventa;  
            conjuntoResultados = instruccion.executeQuery(sql);
            ResultSetMetaData metaDatos = conjuntoResultados.getMetaData();
            
            int numeroDeColumnas = metaDatos.getColumnCount();
            this.jTextArea2.setText("Ventas encontrados.\n");
            for ( int i = 1; i <= numeroDeColumnas; i++ ) {
              
                //this.jTextArea3.setText(jTextArea3.getText());
                jTextArea2.setText(jTextArea2.getText() + "\t" + metaDatos.getColumnName( i ) );
            }      
            jTextArea2.setText(jTextArea2.getText()+ "\n");
            while(conjuntoResultados.next()) {
              for ( int i = 1; i <= numeroDeColumnas; i++ ) {
                this.jTextArea2.setText(this.jTextArea2.getText() + "\t" + conjuntoResultados.getObject(i));
              }      
              
            this.jTextArea2.setText(this.jTextArea2.getText() + "\n");
            }
            
        } catch (Exception e) {
        }  
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarventa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<cliente> jComboBox1;
    private javax.swing.JComboBox<idventa> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
