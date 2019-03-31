
package Ventanas.ventanasEstaticas;
import Clases.CalculosMatematicos;
import Clases.Cliente;
import Clases.Conexion;
import Clases.DatosDeFactura;
import Clases.ListaDeDatos;
import Clases.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import javax.servlet.ServletOutputStream;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class Facturar_admin extends javax.swing.JFrame {
    Usuario u;
    Cliente c;
    DefaultTableModel tabla;
    CalculosMatematicos ma = new CalculosMatematicos();
    public Facturar_admin(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        u = user;
        this.buscar_facturar.requestFocus();
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaproducto_facturar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Facturar - El Gran Mercado");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(912, 580));
        setPreferredSize(new java.awt.Dimension(912, 580));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar_facturar.setBackground(new java.awt.Color(153, 153, 153));
        buscar_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        buscar_facturar.setText(" Buscar cliente (C)");
        buscar_facturar.setToolTipText("");
        buscar_facturar.setBorder(null);
        buscar_facturar.setBorderPainted(false);
        buscar_facturar.setFocusPainted(false);
        buscar_facturar.setFocusable(false);
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
        buscar_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel1.add(buscar_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 220, 40));

        razonsocial_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar.setText("DOCUMENTO");
        jPanel1.add(razonsocial_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        documento_facturar.setEditable(false);
        documento_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        documento_facturar.setFocusCycleRoot(true);
        documento_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel1.add(documento_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 180, 40));

        razonsocial_titulo_facturar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_titulo_facturar1.setText("RAZON SOCIAL");
        jPanel1.add(razonsocial_titulo_facturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        razonsocial_facturar.setEditable(false);
        razonsocial_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        razonsocial_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel1.add(razonsocial_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 280, 40));

        telefono_facturar.setEditable(false);
        telefono_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefono_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel1.add(telefono_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 280, 40));

        telefono_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefono_titulo_facturar.setText("TELEFONO");
        jPanel1.add(telefono_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        direccion_facturar.setEditable(false);
        direccion_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        direccion_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel1.add(direccion_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 410, 40));

        direccion_titulo_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        direccion_titulo_facturar.setText("DIRECCIÓN");
        jPanel1.add(direccion_titulo_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-peq.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 150));

        agregarproducto_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        agregarproducto_facturar.setText(" Agregar producto (N)");
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
        jPanel1.add(agregarproducto_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 190, 50));

        eliminarproducto_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        eliminarproducto_facturar.setText(" Eliminar producto (E)");
        eliminarproducto_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarproducto_facturarActionPerformed(evt);
            }
        });
        eliminarproducto_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel1.add(eliminarproducto_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, 50));

        facturar_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cash.png"))); // NOI18N
        facturar_facturar.setText("Imprimir (F)");
        facturar_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturar_facturarActionPerformed(evt);
            }
        });
        facturar_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel1.add(facturar_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 160, 50));

        total_facturar.setEditable(false);
        total_facturar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        total_facturar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_facturar.setText("0.0");
        total_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel1.add(total_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 230, 50));

        titulototal_facturar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulototal_facturar.setText("TOTAL:");
        jPanel1.add(titulototal_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        tablaproducto_facturar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "UND", "DESCRIPCIÓN", "PRECIO UNT", "PRECIO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaproducto_facturar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jScrollPane2.setViewportView(tablaproducto_facturar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 860, 290));

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

    private void eliminarproducto_facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarproducto_facturarActionPerformed
        int rep = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el producto?", "Eliminar producto", JOptionPane.YES_NO_OPTION);
        tabla = (DefaultTableModel) this.tablaproducto_facturar.getModel();
        int fila = this.tablaproducto_facturar.getSelectedRow();
        if(fila != -1){
            if(rep == 0){ 
                this.c.restarTotal(Double.parseDouble(this.total_facturar.getText()));
                tabla.removeRow(this.tablaproducto_facturar.getSelectedRow());
            }
        }else{
            JOptionPane.showMessageDialog(null, "No haz seleccionado ningún producto");
        }

        
    }//GEN-LAST:event_eliminarproducto_facturarActionPerformed

    private void facturar_facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturar_facturarActionPerformed
        reporte();
        enviarReporte();
        limpieza();
    }//GEN-LAST:event_facturar_facturarActionPerformed
    
    private void reporte(){
        try {
            ListaDeDatos lista = new ListaDeDatos();
            for(int i = 0; i<this.tablaproducto_facturar.getRowCount();i++){
                DatosDeFactura datos = new DatosDeFactura(
                        this.tablaproducto_facturar.getValueAt(i, 0).toString(),
                        this.tablaproducto_facturar.getValueAt(i, 1).toString(),
                        this.tablaproducto_facturar.getValueAt(i, 2).toString(),
                        this.tablaproducto_facturar.getValueAt(i, 3).toString(),
                        this.tablaproducto_facturar.getValueAt(i, 4).toString());
                lista.agregar(datos);
            }
            //Selección de los datos del cliente
            Map parametro = new HashMap();
            parametro.put("totalfactura", this.total_facturar.getText());
            parametro.put("nombre", c.razon);
            parametro.put("documento",String.valueOf(c.documento));
            parametro.put("direccion",c.direccion);
            parametro.put("telefono",String.valueOf(c.telefono));
            //Relacionado a la vista previa
            JasperReport reporte = (JasperReport) JRLoader.loadObject("factura.jasper");
            JasperPrint imprimir = JasperFillManager.fillReport(reporte,parametro,lista);
            JasperViewer.viewReport(imprimir, false);
        } catch (JRException ex) {
            Logger.getLogger(Facturar_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void enviarReporte(){
        Conexion con = new Conexion();
        con.enviarDetalle(u, c, this);
    }
    
    private void limpieza(){
        c.borrarCliente();
    }
    
    private void teclar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclar
        int t = evt.getKeyCode();
        switch (t) {
            case 27:
                this.dispose();
                break;
            case 100:
            case 78:
                this.agregarproducto_facturar.doClick();
                break;
            case 102:
            case 70:
                this.facturar_facturar.doClick();
                break;
            case 101:
            case 69:
                this.eliminarproducto_facturar.doClick();
                break;
            case 99:
            case 67:
                this.buscar_facturar.doClick();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_teclar
    
    public void crearCliente(Cliente cl){
        c = cl;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarproducto_facturar;
    private javax.swing.JButton buscar_facturar;
    public javax.swing.JTextField direccion_facturar;
    private javax.swing.JLabel direccion_titulo_facturar;
    public javax.swing.JTextField documento_facturar;
    private javax.swing.JButton eliminarproducto_facturar;
    private javax.swing.JButton facturar_facturar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
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
