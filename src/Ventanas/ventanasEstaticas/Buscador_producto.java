
package Ventanas.ventanasEstaticas;

import Clases.Conexion;
import Clases.Usuario;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Buscador_producto extends javax.swing.JFrame {
    Facturar_admin v;
    Usuario u;
    DefaultTableModel tabla;
    
    public Buscador_producto(Facturar_admin ventana, Usuario user) {
        System.out.println("Buscar cliente");
        initComponents();
        this.setLocationRelativeTo(null);
        this.traerProductos();
        u = user;
        v = ventana;
        this.tabla_buscador.requestFocus();
    }
   
    public void traerProductos(){
        tabla = (DefaultTableModel) this.tabla_buscador.getModel();
        Conexion conectador = new Conexion();
        conectador.traer_productos(tabla);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar_buscador = new javax.swing.JButton();
        razonsocial_buscador = new javax.swing.JTextField();
        razonsocial_titulo_facturar1 = new javax.swing.JLabel();
        scroll_buscador = new javax.swing.JScrollPane();
        tabla_buscador = new javax.swing.JTable();
        seleccionar_buscador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(935, 509));
        setPreferredSize(new java.awt.Dimension(935, 509));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        buscar_buscador.setText(" BUSCAR PRODUCTO");
        buscar_buscador.setToolTipText("");
        buscar_buscador.setPreferredSize(new java.awt.Dimension(210, 50));
        buscar_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        getContentPane().add(buscar_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 210, 50));

        razonsocial_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscar(evt);
                teclar(evt);
            }
        });
        getContentPane().add(razonsocial_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 650, 50));

        razonsocial_titulo_facturar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar1.setText("PRODUCTO, CATEGORIA O CÓDIGO");
        getContentPane().add(razonsocial_titulo_facturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        tabla_buscador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabla_buscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "CATEGORIA", "DESCRIPCIÓN", "UND", "PRECIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        scroll_buscador.setViewportView(tabla_buscador);
        if (tabla_buscador.getColumnModel().getColumnCount() > 0) {
            tabla_buscador.getColumnModel().getColumn(0).setMinWidth(80);
            tabla_buscador.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabla_buscador.getColumnModel().getColumn(0).setMaxWidth(80);
            tabla_buscador.getColumnModel().getColumn(1).setMinWidth(100);
            tabla_buscador.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla_buscador.getColumnModel().getColumn(1).setMaxWidth(100);
            tabla_buscador.getColumnModel().getColumn(3).setMinWidth(60);
            tabla_buscador.getColumnModel().getColumn(3).setPreferredWidth(60);
            tabla_buscador.getColumnModel().getColumn(3).setMaxWidth(60);
            tabla_buscador.getColumnModel().getColumn(4).setMinWidth(100);
            tabla_buscador.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabla_buscador.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        getContentPane().add(scroll_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 860, 300));

        seleccionar_buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        seleccionar_buscador.setText(" Seleccionar producto (ENTER)");
        seleccionar_buscador.setToolTipText("");
        seleccionar_buscador.setPreferredSize(new java.awt.Dimension(210, 50));
        seleccionar_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarProducto(evt);
            }
        });
        seleccionar_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        getContentPane().add(seleccionar_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 250, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar
        filtro(this.razonsocial_buscador.getText().toUpperCase());
    }//GEN-LAST:event_buscar

    private void seleccionarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarProducto
        int fila = this.tabla_buscador.getSelectedRow();
        if(fila != -1){
            if(Integer.parseInt(this.tabla_buscador.getValueAt(fila, 3).toString()) > 0){
                Precio_confirmacion pc = new Precio_confirmacion(this,true,v,u,this);
                pc.setLocationRelativeTo(null);
                pc.producto.setText(this.tabla_buscador.getValueAt(fila,2).toString());
                pc.precio.setText(this.tabla_buscador.getValueAt(fila,4).toString());
                pc.codigo = Integer.parseInt(this.tabla_buscador.getValueAt(fila,0).toString());
                pc.categoria = this.tabla_buscador.getValueAt(fila,1).toString();
                pc.stock = Integer.parseInt(this.tabla_buscador.getValueAt(fila,3).toString());
                pc.setVisible(true);
            }else{
            JOptionPane.showMessageDialog(null, "No hay disponible en inventario");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "No haz seleccionado ningún producto");
        }
    }//GEN-LAST:event_seleccionarProducto

    private void teclar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclar
        char t = evt.getKeyChar();
        if(t==KeyEvent.VK_ENTER){
            this.seleccionar_buscador.doClick();
        }
    }//GEN-LAST:event_teclar
  
    private void filtro(String consulta){
        tabla = (DefaultTableModel) this.tabla_buscador.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tabla);
        this.tabla_buscador.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_buscador;
    private javax.swing.JTextField razonsocial_buscador;
    private javax.swing.JLabel razonsocial_titulo_facturar1;
    private javax.swing.JScrollPane scroll_buscador;
    private javax.swing.JButton seleccionar_buscador;
    private javax.swing.JTable tabla_buscador;
    // End of variables declaration//GEN-END:variables
}
