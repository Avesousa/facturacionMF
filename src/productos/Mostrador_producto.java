
package productos;

import Ventanas.ventanasEstaticas.*;
import Clases.Conexion;
import Clases.Usuario;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Mostrador_producto extends javax.swing.JFrame {
    Facturar_admin v;
    Usuario u;
    DefaultTableModel tabla;
    public String cod;
    public String nom;
    public String pre;
    public String cate;
    public String stock;
    public Mostrador_producto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.traerProductos();
        this.tabla_buscador.requestFocus();
    }
    public void traerProductos(){
        tabla = (DefaultTableModel) this.tabla_buscador.getModel();
        Conexion conectador = new Conexion();
        conectador.traer_productos(tabla,2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar_buscador = new javax.swing.JButton();
        razonsocial_buscador = new javax.swing.JTextField();
        razonsocial_titulo_facturar1 = new javax.swing.JLabel();
        scroll_buscador = new javax.swing.JScrollPane();
        tabla_buscador = new javax.swing.JTable();
        editarI = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(935, 509));
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
                "CÓDIGO", "CATEGORIA", "DESCRIPCIÓN", "UND", "COSTO"
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

        editarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventory.png"))); // NOI18N
        editarI.setText("Editar Stock (I)");
        editarI.setToolTipText("");
        editarI.setPreferredSize(new java.awt.Dimension(210, 50));
        editarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarInventario(evt);
            }
        });
        editarI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        getContentPane().add(editarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 160, 50));

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        agregar.setText("Agregar (N)");
        agregar.setToolTipText("");
        agregar.setPreferredSize(new java.awt.Dimension(210, 50));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProducto(evt);
            }
        });
        agregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 160, 50));

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list.png"))); // NOI18N
        editar.setText("Editar (E)");
        editar.setToolTipText("");
        editar.setPreferredSize(new java.awt.Dimension(210, 50));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar(evt);
            }
        });
        editar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 160, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void buscar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar
        filtro(this.razonsocial_buscador.getText().toUpperCase());
    }//GEN-LAST:event_buscar
    private void teclar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclar
        int t = evt.getKeyCode();
        switch (t) {
            case 27:
                this.dispose();
                break;
            case 101:
            case 69:
                this.editar.doClick();
                break;
            case 110:
            case 78:
                this.agregar.doClick();
                break;
            case 105:
            case 73:
                this.editarI.doClick();
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_teclar

    private void editarInventario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarInventario
        int fila = this.tabla_buscador.getSelectedRow();
        if(fila != -1){
            cod = tabla_buscador.getValueAt(fila, 0).toString();
            nom = tabla_buscador.getValueAt(fila, 2).toString();
            pre = tabla_buscador.getValueAt(fila, 4).toString();
            cate = tabla_buscador.getValueAt(fila,1).toString();
            stock = tabla_buscador.getValueAt(fila, 3).toString();
            Formulario_producto fp = new Formulario_producto(this,true,u,this);
            fp.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "No haz seleccionado ningún producto");
        }
    }//GEN-LAST:event_editarInventario

    private void editar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar
        // TODO add your handling code here:
    }//GEN-LAST:event_editar

    private void agregarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProducto
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarProducto
    private void filtro(String consulta){
        tabla = (DefaultTableModel) this.tabla_buscador.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(tabla);
        this.tabla_buscador.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar_buscador;
    private javax.swing.JButton editar;
    private javax.swing.JButton editarI;
    private javax.swing.JTextField razonsocial_buscador;
    private javax.swing.JLabel razonsocial_titulo_facturar1;
    private javax.swing.JScrollPane scroll_buscador;
    private javax.swing.JTable tabla_buscador;
    // End of variables declaration//GEN-END:variables
}
