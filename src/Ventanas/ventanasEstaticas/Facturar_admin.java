
package Ventanas.ventanasEstaticas;
import Clases.Usuario;
import Ventanas.ventanasEstaticas.Buscador_cliente;
import java.awt.Color;

public class Facturar_admin extends javax.swing.JFrame {
    Usuario u;
    public Facturar_admin(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        u = user;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscar_facturar = new javax.swing.JButton();
        razonsocial_titulo_facturar = new javax.swing.JLabel();
        documento_facturar = new javax.swing.JTextField();
        razonsocial_titulo_facturar1 = new javax.swing.JLabel();
        razonsocial_facturar = new javax.swing.JTextField();
        telefono_facturar = new javax.swing.JTextField();
        telefono_titulo_facturar = new javax.swing.JLabel();
        direccion_facturar = new javax.swing.JTextField();
        direccion_titulo_facturar = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        agregarproducto_facturar = new javax.swing.JButton();
        eliminarproducto_facturar = new javax.swing.JButton();
        facturar_facturar = new javax.swing.JButton();
        total_facturar = new javax.swing.JTextField();
        titulototal_facturar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproducto_facturar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturar - El Gran Mercado");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar_facturar.setBackground(new java.awt.Color(153, 153, 153));
        buscar_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        buscar_facturar.setText(" Buscar cliente");
        buscar_facturar.setToolTipText("");
        buscar_facturar.setBorder(null);
        buscar_facturar.setBorderPainted(false);
        buscar_facturar.setPreferredSize(new java.awt.Dimension(210, 50));
        buscar_facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_facturarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_facturarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscar_facturarMousePressed(evt);
            }
        });
        buscar_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_facturarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 220, 40));

        razonsocial_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar.setText("DOCUMENTO");
        jPanel1.add(razonsocial_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        documento_facturar.setEditable(false);
        documento_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        documento_facturar.setFocusCycleRoot(true);
        jPanel1.add(documento_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 180, 40));

        razonsocial_titulo_facturar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar1.setText("RAZON SOCIAL");
        jPanel1.add(razonsocial_titulo_facturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        razonsocial_facturar.setEditable(false);
        razonsocial_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(razonsocial_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 280, 40));

        telefono_facturar.setEditable(false);
        telefono_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(telefono_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 280, 40));

        telefono_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefono_titulo_facturar.setText("TELEFONO");
        jPanel1.add(telefono_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        direccion_facturar.setEditable(false);
        direccion_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(direccion_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 410, 40));

        direccion_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        direccion_titulo_facturar.setText("DIRECCIÓN");
        jPanel1.add(direccion_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-peq.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 150));

        agregarproducto_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        agregarproducto_facturar.setText(" Agregar producto");
        agregarproducto_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProducto(evt);
            }
        });
        jPanel1.add(agregarproducto_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 160, 50));

        eliminarproducto_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        eliminarproducto_facturar.setText(" Eliminar producto");
        jPanel1.add(eliminarproducto_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, 50));

        facturar_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cash.png"))); // NOI18N
        facturar_facturar.setText(" Emitir boleta");
        jPanel1.add(facturar_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 240, 50));

        total_facturar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        total_facturar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_facturar.setText("0.0");
        jPanel1.add(total_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 230, 50));

        titulototal_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulototal_facturar.setText("TOTAL:");
        jPanel1.add(titulototal_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        tablaproducto_facturar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Und", "Descripción del producto", "Precio unitario", "Precio total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaproducto_facturar);
        if (tablaproducto_facturar.getColumnModel().getColumnCount() > 0) {
            tablaproducto_facturar.getColumnModel().getColumn(0).setMinWidth(100);
            tablaproducto_facturar.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablaproducto_facturar.getColumnModel().getColumn(0).setMaxWidth(100);
            tablaproducto_facturar.getColumnModel().getColumn(1).setMinWidth(60);
            tablaproducto_facturar.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablaproducto_facturar.getColumnModel().getColumn(1).setMaxWidth(60);
            tablaproducto_facturar.getColumnModel().getColumn(3).setMinWidth(100);
            tablaproducto_facturar.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaproducto_facturar.getColumnModel().getColumn(3).setMaxWidth(100);
            tablaproducto_facturar.getColumnModel().getColumn(4).setMinWidth(100);
            tablaproducto_facturar.getColumnModel().getColumn(4).setPreferredWidth(100);
            tablaproducto_facturar.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 860, 290));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_facturarActionPerformed
        Buscador_cliente buscador = new Buscador_cliente(this);
        buscador.setVisible(true);
    }//GEN-LAST:event_buscar_facturarActionPerformed

    private void buscar_facturarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_facturarMouseEntered
        this.buscar_facturar.setBorderPainted(false);
    }//GEN-LAST:event_buscar_facturarMouseEntered

    private void buscar_facturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_facturarMouseClicked
        this.buscar_facturar.setBorderPainted(false);
    }//GEN-LAST:event_buscar_facturarMouseClicked

    private void buscar_facturarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_facturarMousePressed
        this.buscar_facturar.setBorderPainted(false);
        this.buscar_facturar.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_buscar_facturarMousePressed

    private void agregarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProducto
        Buscador_producto vbp = new Buscador_producto(this, u);
        vbp.setVisible(true);
    }//GEN-LAST:event_agregarProducto

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarproducto_facturar;
    private javax.swing.JButton buscar_facturar;
    public javax.swing.JTextField direccion_facturar;
    private javax.swing.JLabel direccion_titulo_facturar;
    public javax.swing.JTextField documento_facturar;
    private javax.swing.JButton eliminarproducto_facturar;
    private javax.swing.JButton facturar_facturar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    public javax.swing.JTextField razonsocial_facturar;
    private javax.swing.JLabel razonsocial_titulo_facturar;
    private javax.swing.JLabel razonsocial_titulo_facturar1;
    public javax.swing.JTable tablaproducto_facturar;
    public javax.swing.JTextField telefono_facturar;
    private javax.swing.JLabel telefono_titulo_facturar;
    private javax.swing.JLabel titulototal_facturar;
    public javax.swing.JTextField total_facturar;
    // End of variables declaration//GEN-END:variables
}
