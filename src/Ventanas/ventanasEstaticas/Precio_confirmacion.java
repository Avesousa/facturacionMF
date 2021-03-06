
package Ventanas.ventanasEstaticas;

import Clases.*;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Precio_confirmacion extends javax.swing.JDialog {
    Usuario u;
    Facturar_admin vf;
    Buscador_producto vpro;
    CalculosMatematicos calcular = new CalculosMatematicos();
    public Precio_confirmacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public Precio_confirmacion(java.awt.Frame parent, boolean modal,Facturar_admin ven, Usuario user, Buscador_producto venPro) {
        super(parent, modal);
        initComponents();
        u = user;
        vf = ven;
        vpro = venPro;
        this.und.requestFocus();
    }
    public double costo;
    public int codigo;
    public String categoria;
    public int stock;
    public int porcentaje;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo_producto = new javax.swing.JLabel();
        producto = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        linea_titulo = new javax.swing.JLabel();
        titulo_precio = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        und = new javax.swing.JTextField();
        titulo_und = new javax.swing.JLabel();
        titulo_descuento = new javax.swing.JLabel();
        descuento = new javax.swing.JTextField();
        agregarproducto_facturar = new javax.swing.JButton();
        precio_final = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(680, 370));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-peq.png"))); // NOI18N
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        titulo_producto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_producto.setText("PRODUCTO");
        jPanel2.add(titulo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        producto.setEditable(false);
        producto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel2.add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 510, 40));

        titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(30, 55, 94));
        titulo.setText("DETALLE DEL PRODUCTO");
        jPanel2.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        linea_titulo.setText("______________________________________________________");
        jPanel2.add(linea_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, 20));

        titulo_precio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_precio.setText("PRECIO");
        jPanel2.add(titulo_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        precio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcularMonto(evt);
            }
        });
        jPanel2.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 190, 40));

        und.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        und.setText("1");
        und.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcularMonto(evt);
            }
        });
        jPanel2.add(und, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 60, 40));

        titulo_und.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_und.setText("UND");
        jPanel2.add(titulo_und, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        titulo_descuento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_descuento.setText("DESCUENTO");
        jPanel2.add(titulo_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        descuento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descuento.setText("0");
        descuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
                calcularPorcentaje(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcularPorcentaje(evt);
                calcularMonto(evt);
            }
        });
        jPanel2.add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 60, 40));

        agregarproducto_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        agregarproducto_facturar.setText(" Agregar producto (ENTER)");
        agregarproducto_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProducto(evt);
            }
        });
        agregarproducto_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel2.add(agregarproducto_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 290, 50));

        precio_final.setEditable(false);
        precio_final.setBackground(new java.awt.Color(255, 255, 255));
        precio_final.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        precio_final.setForeground(new java.awt.Color(0, 204, 102));
        precio_final.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_final.setText("0.0");
        jPanel2.add(precio_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 100, 40));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProducto
        int can = Integer.parseInt(this.und.getText());
        double pre = Double.parseDouble(this.precio.getText());
        if(can <= stock){
            if(can >= 0){
                    double preTotal = calcular.sacarTotal(can,pre);
                    calcular.esperar(1);
                    vf.c.sumarTotal(preTotal);
                    agregarFila(can,preTotal);
                    Conexion con = new Conexion();
                    con.tocarStock(this.codigo,(stock-can));
                    this.dispose();
                    vpro.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "No haz ingresado cantidad");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay disponible en inventario,"+ 
            "la cantidad solicitada");
        }
    }//GEN-LAST:event_agregarProducto

    private void teclar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclar
       char t = evt.getKeyChar();
       switch(t){
           case KeyEvent.VK_ENTER:
               this.agregarproducto_facturar.doClick();
               break;
           case KeyEvent.VK_ESCAPE:
               this.dispose();
               break;
       }
    }//GEN-LAST:event_teclar

    private void calcularPorcentaje(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcularPorcentaje
    int por = Integer.parseInt(this.descuento.getText());
        if(por <= porcentaje){
            int porF = porcentaje - por;
            double costoN = calcular.sacarCosto(codigo);
            System.out.println(por);
            System.out.println(porcentaje);
            System.out.println("----");
            System.out.println(porF);
            System.out.println("====");
            System.out.println(costoN);
            System.out.println("----FINAL----");
            double precioN = calcular.sacarPrecio(costoN, porF);
            this.precio.setText(String.valueOf(precioN));
        } else{
            JOptionPane.showMessageDialog(null, "¡El descuento agregado, no está permitido!");
            this.descuento.setText("0");
        }        
    }//GEN-LAST:event_calcularPorcentaje

    private void calcularMonto(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcularMonto
        int can = Integer.parseInt(this.und.getText());
        double pre = Double.parseDouble(this.precio.getText());
        double preTotal = calcular.sacarTotal(can,pre);
        calcular.esperar(0.5);
        this.precio_final.setText(String.valueOf(preTotal));
    }//GEN-LAST:event_calcularMonto
    
    public void agregarFila(int can, double total){
        DefaultTableModel tabla = (DefaultTableModel) vf.tablaproducto_facturar.getModel();
        Object [] fila = new Object[5];
        fila[0] = String.valueOf(this.codigo);
        fila[1] = String.valueOf(can);
        fila[2] = String.valueOf(this.producto.getText());
        fila[3] = String.valueOf(this.precio.getText());
        fila[4] = String.valueOf(total);
        tabla.addRow(fila);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarproducto_facturar;
    public javax.swing.JTextField descuento;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel linea_titulo;
    private javax.swing.JLabel logo;
    public javax.swing.JTextField precio;
    public javax.swing.JTextField precio_final;
    public javax.swing.JTextField producto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo_descuento;
    private javax.swing.JLabel titulo_precio;
    private javax.swing.JLabel titulo_producto;
    private javax.swing.JLabel titulo_und;
    public javax.swing.JTextField und;
    // End of variables declaration//GEN-END:variables
}
