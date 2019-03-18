
package Ventanas.ventanasEstaticas;

import Clases.*;
import Ventanas.ventanasEstaticas.Buscador_cliente;

public class Formulario_cliente extends javax.swing.JFrame {
    Buscador_cliente v;
    Facturar_admin vf;
    public int almacenDeDocumento;
    public Formulario_cliente(Buscador_cliente ventana, Facturar_admin vfacturar) {
        initComponents();
        this.setLocationRelativeTo(null);
        v = ventana;
        vf = vfacturar;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        razonsocial_cliente = new javax.swing.JTextField();
        documento_cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boton_editar_cliente = new javax.swing.JButton();
        boton_crear_cliente = new javax.swing.JButton();
        telefono_cliente = new javax.swing.JTextField();
        direccion_cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario de cliente - El Gran Mercado");
        setMinimumSize(new java.awt.Dimension(435, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(435, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(435, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(razonsocial_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 320, 30));
        jPanel1.add(documento_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 320, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Razón social:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Documento: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-peq.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        boton_editar_cliente.setBackground(new java.awt.Color(30, 45, 59));
        boton_editar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        boton_editar_cliente.setText("EDITAR USUARIO");
        boton_editar_cliente.setBorder(null);
        boton_editar_cliente.setBorderPainted(false);
        boton_editar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCliente(evt);
            }
        });
        jPanel1.add(boton_editar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 170, 40));

        boton_crear_cliente.setBackground(new java.awt.Color(30, 45, 59));
        boton_crear_cliente.setForeground(new java.awt.Color(255, 255, 255));
        boton_crear_cliente.setText("CREAR USUARIO");
        boton_crear_cliente.setBorder(null);
        boton_crear_cliente.setBorderPainted(false);
        boton_crear_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCliente(evt);
            }
        });
        jPanel1.add(boton_crear_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 170, 40));
        jPanel1.add(telefono_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 320, 30));
        jPanel1.add(direccion_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 320, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Télefono: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCliente
        Conexion con = new Conexion();
        con.editar_clientes(this, vf,v);
    }//GEN-LAST:event_editarCliente

    private void crearCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCliente
        Conexion con = new Conexion();
        con.crear_clientes(this, vf, v);
    }//GEN-LAST:event_crearCliente


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton boton_crear_cliente;
    public javax.swing.JButton boton_editar_cliente;
    public javax.swing.JTextField direccion_cliente;
    public javax.swing.JTextField documento_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField razonsocial_cliente;
    public javax.swing.JTextField telefono_cliente;
    // End of variables declaration//GEN-END:variables
}
