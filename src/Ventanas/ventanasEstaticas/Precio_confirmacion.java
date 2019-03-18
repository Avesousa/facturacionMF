
package Ventanas.ventanasEstaticas;

import Clases.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Precio_confirmacion extends javax.swing.JDialog {
    Usuario u;
    Facturar_admin vf;
    Buscador_producto vpro;
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
    }
    public double costo;
    public int codigo;
    public String categoria;
    public int stock;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-peq.png"))); // NOI18N
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        titulo_producto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_producto.setText("PRODUCTO");
        jPanel2.add(titulo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        producto.setEditable(false);
        producto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
        jPanel2.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 190, 40));

        und.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        und.setText("1");
        jPanel2.add(und, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 60, 40));

        titulo_und.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_und.setText("UND");
        jPanel2.add(titulo_und, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        titulo_descuento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_descuento.setText("DESCUENTO");
        jPanel2.add(titulo_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        descuento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descuento.setText("0");
        jPanel2.add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 60, 40));

        agregarproducto_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        agregarproducto_facturar.setText(" Agregar producto");
        agregarproducto_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProducto(evt);
            }
        });
        jPanel2.add(agregarproducto_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 290, 50));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProducto
        int can = Integer.parseInt(this.und.getText());
        int pre = Integer.parseInt(this.precio.getText());
        double tot = Double.parseDouble(vf.total_facturar.getText());
        if(can < stock){
            if(can >= 0){
                CalculosMatematicos calcular = new CalculosMatematicos();
                String total = String.valueOf(calcular.sacarSuma(tot,(calcular.sacarTotal(can,pre))));
                vf.total_facturar.setText(total);
                agregarFila(can,tot);
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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Precio_confirmacion dialog = new Precio_confirmacion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarproducto_facturar;
    public javax.swing.JTextField descuento;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel linea_titulo;
    private javax.swing.JLabel logo;
    public javax.swing.JTextField precio;
    public javax.swing.JTextField producto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo_descuento;
    private javax.swing.JLabel titulo_precio;
    private javax.swing.JLabel titulo_producto;
    private javax.swing.JLabel titulo_und;
    public javax.swing.JTextField und;
    // End of variables declaration//GEN-END:variables
}
