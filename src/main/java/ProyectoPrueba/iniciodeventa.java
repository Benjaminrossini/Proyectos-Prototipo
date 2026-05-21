package ProyectoPrueba;

import static ProyectoPrueba.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static javax.management.Query.or;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.cliente;
import objetos.precio;
import objetos.ventas;
public class iniciodeventa extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<ventas> listaVentas = new ArrayList<ventas>();

    public iniciodeventa() {
        initComponents();
        llenarCliente();
        llenarProductoPrecio();
        this.jLabel7.setText(obtenerFecha());
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Total");
        refrescarTabla();
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jComboBox2.setVisible(false);
        this.jTextField1.setVisible(false);
        this.jButton2.setVisible(false);
    }
    public void refrescarTabla(){
       while (modelo.getRowCount()>0){
           modelo.removeRow(0);
       } 
       for(ventas ventas : listaVentas){
           Object a[]=new Object[5];
           a[0]=ventas.getPrducto();
           a[1]=ventas.getCantidad();
           a[2]=ventas.getPrecio();
           a[3]=ventas.getPreciototal();
           modelo.addRow(a);
       }
       this.jTable1.setModel(modelo);
    } 
    private void llenarCliente(){
        Modelo mod = new Modelo();
        ArrayList<cliente> listaCliente = mod.getCliente();
        jComboBox1.removeAll();
        for(int i = 0;i<listaCliente.size();i++){
            jComboBox1.addItem(new cliente(listaCliente.get(i).getId(),listaCliente.get(i).getDni(),listaCliente.get(i).getNombre()));
        }
    }
    private void llenarProductoPrecio(){
        Modelo mod = new Modelo();
        ArrayList<precio> listaPrecio = mod.getPrecio();
        jComboBox2.removeAll();
        for(int i = 0;i<listaPrecio.size();i++){
            jComboBox2.addItem(new precio(listaPrecio.get(i).getId(),listaPrecio.get(i).getNombre(),listaPrecio.get(i).getPrecio()));
            
        }
    }
    public static String obtenerFecha(){
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
        return formato.format(fecha);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Venta en proceso");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("DNI Cliente");

        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Producto");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Agregar Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar Producto ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Finalizar Compra");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(300, 300, 300)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public float precioT;
    public float total2;
    public String total3;
    public int cantfinal;
    public int contador3;
    public int cant3;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            PreparedStatement st = null;
            ResultSet rs = null;
            float cant36 = 0;
            float contador36 = 0;
            try {                   
                        st = conexion.prepareStatement("SELECT * FROM producto WHERE nombre = ?");
                        st.setString(1, this.jComboBox2.getItemAt(jComboBox2.getSelectedIndex()).getNombre());
                        rs = st.executeQuery();
                        if(rs.next()){
                        String cantidad = rs.getString("cantidad");
                        cant36 = Float.parseFloat(cantidad);
                        }
                        String contador2 = this.jTextField1.getText();
                        contador36 = Float.parseFloat(contador2);
                        if(contador36>0){
                            if(cant36<contador36){
                            JOptionPane.showMessageDialog(null, "No hay suficiente Stock.Stock actual " + cant36);
                            }else{
                        ventas ventas = new ventas();
                        ventas.setPrducto(this.jComboBox2.getItemAt(jComboBox2.getSelectedIndex()).getNombre());
                        float cant2 = Float.parseFloat(this.jTextField1.getText());
                        ventas.setCantidad( cant2);
                        ventas.setPrecio(this.jComboBox2.getItemAt(jComboBox2.getSelectedIndex()).getPrecio());
                        float prec = this.jComboBox2.getItemAt(jComboBox2.getSelectedIndex()).getPrecio();
                        precioT = cant2 * prec;
                        ventas.setPreciototal(precioT);
                        listaVentas.add(ventas);
                        refrescarTabla();
                        total2 = total2 + precioT;
                        total3 = Float.toString(total2);
                        this.jLabel5.setText("Total = " + total3);                   
                        }
                        }else{
                            JOptionPane.showMessageDialog(null, "Debe agregar al menos 1 unidad");
                        }
                } catch (Exception e) {
                }
        
        }catch(Exception ez){
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    String ultimoValor3 = null;
    String dni;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dni = this.jComboBox1.getItemAt(this.jComboBox1.getSelectedIndex()).getDni();
        this.jLabel3.setVisible(true);
        this.jLabel4.setVisible(true);
        this.jComboBox2.setVisible(true);
        this.jTextField1.setVisible(true);
        this.jButton2.setVisible(true);
        this.jButton1.setVisible(false);
        this.jComboBox1.setVisible(false);
        this.jLabel2.setVisible(false);
        try{
            String ultimoValor = null;
            int ultimoValor2 = 0;
            String sql = "select * from maestro order by id desc";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                ultimoValor = rs.getString("idventa");
                ultimoValor2 = Integer.parseInt(ultimoValor);
            }
            ultimoValor2 = ultimoValor2 + 1;
            ultimoValor3 = String.valueOf(ultimoValor2);
            this.jLabel6.setText("Venta Numero " + ultimoValor2);
        }catch(Exception ee){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if (this.jTable1.getSelectedRow()== -1){
            return;
        }else{
            String precio = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String canti = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            float precio2 = Float.parseFloat(precio);
            float canti2 = Float.parseFloat(canti);
            float canti3 = canti2 * precio2;
            total2= total2-canti3;
            total3 = String.valueOf(total2);
            this.jLabel5.setText("Total = " + total3);
            listaVentas.remove(jTable1.getSelectedRow());
            refrescarTabla();                       
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      conexion con1 = new conexion();
        PreparedStatement st = null;
        ResultSet rs = null;
        try { 
            for (int i = 0; i < this.jTable1.getRowCount(); i++) {
                String sql1 = "insert into listacom (idventa,producto,cantidad,precio,preciototal,fecha,dni) values ('"
                                +ultimoValor3+"','"
                                +jTable1.getValueAt(i, 0)+"','"
                                +jTable1.getValueAt(i, 1)+"','"
                                +jTable1.getValueAt(i, 2)+"','"
                                +jTable1.getValueAt(i, 3)+"','"
                                +this.jLabel7.getText() + "','"
                                + dni +"')";
                                Connection con = (Connection) con1.getCon();
                                st = conexion.prepareStatement(sql1);
                                st.executeUpdate();
            }
            //JOptionPane.showMessageDialog(null, "Registro  Guardado...");
        } catch (Exception e) {
        }
        try {
            int resultado = 0;
            PreparedStatement insertarPlaneta = null;
            try {
                String sql2 ="insert into maestro " +
                            "(idventa,dni,totalventa,fecha) " +
                            "VALUES ( '" 
                            +  ultimoValor3 + "','" 
                            +  dni + "','" 
                            + total2 + "','"  
                            +this.jLabel7.getText() +"'); ";
            
                            insertarPlaneta = conexion.prepareStatement(sql2);
           
                            resultado = insertarPlaneta.executeUpdate();
                //JOptionPane.showMessageDialog(null, "Compra  Guardada...");
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        try {
            st = null;
            rs = null;
                try {
                    for (int i = 0; i < jTable1.getRowCount(); i++) {
                        st = conexion.prepareStatement("SELECT * FROM producto WHERE nombre = ?");
                        st.setString(1, this.jComboBox2.getItemAt(jComboBox2.getSelectedIndex()).getNombre());
                        rs = st.executeQuery();
                        float cant34 = 0;
                        String nombre = null;
                        if(rs.next()){
                        String cantidad = rs.getString("cantidad");
                        nombre = rs.getString("nombre");
                        cant34 = Float.parseFloat(cantidad);
                        }
                        String cantfinal1 = jTable1.getValueAt(i, 1).toString();
                        float contador34 = Float.parseFloat(cantfinal1);
                        float cantfinal34 = cant34-contador34;
                        String Final = String.valueOf(cantfinal34);
                        float Final2 = Float.parseFloat(Final);
                        String sql4 = "UPDATE producto SET cantidad ='" + Final2 + "' WHERE nombre='"+ nombre + "';";
                        st = conexion.prepareStatement(sql4);
                        st.execute();
                    }
                    JOptionPane.showMessageDialog(null, "Registro Actualizado...");
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        total2 = 0;
        total3 = Float.toString(total2);
        this.jLabel5.setText("Total = " + total3);
        dni = null;
        listaVentas.removeAll(listaVentas);
        refrescarTabla();
        this.jComboBox1.setVisible(true);
        this.jButton1.setVisible(true);
        this.jLabel2.setVisible(true);  
    }//GEN-LAST:event_jButton4ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciodeventa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<cliente> jComboBox1;
    private javax.swing.JComboBox<precio> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
