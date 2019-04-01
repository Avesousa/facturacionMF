
package productos;
import Clases.*;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Formulario_producto extends javax.swing.JDialog {
    Usuario u;
    CalculosMatematicos calcular = new CalculosMatematicos();
    Mostrador_producto mp;
    Conexion con;
    public Formulario_producto(java.awt.Frame parent, boolean modal, Usuario us, Mostrador_producto mpr) {
        super(parent, modal);
        u = us;
        mp = mpr;
        initComponents();
        colocarDatos();
        traerCategorias();
        this.editarproducto.setVisible(true);
        this.agregarproducto.setVisible(false);
    }
    
    public Formulario_producto(java.awt.Frame parent, boolean modal, Usuario us) {
        super(parent, modal);
        u = us;
        initComponents();
        this.editarproducto.setVisible(false);
        this.agregarproducto.setVisible(true);
    }
    
    public void traerCategorias(){
        con = new Conexion();
        con.traerCategorias(this.categorias);
    }
    
    public void colocarDatos(){
        this.cod_producto.setText(mp.cod);
        this.precio.setText(mp.pre);
        this.und.setText(mp.stock);
        boolean bandera = true;
        int i = 0;
        while(this.categorias.getItemCount() > i && bandera){
            if(this.categorias.getItemAt(i).equals(mp.cate)){
                this.categorias.setSelectedIndex(i);
                bandera = false;
            }
            i++;
        }
        this.producto.setText(mp.nom);
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
        titulo = new javax.swing.JLabel();
        linea_titulo = new javax.swing.JLabel();
        titulo_precio = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        und = new javax.swing.JTextField();
        titulo_und = new javax.swing.JLabel();
        agregarproducto = new javax.swing.JButton();
        editarproducto = new javax.swing.JButton();
        producto = new javax.swing.JTextField();
        titulo_producto1 = new javax.swing.JLabel();
        categorias = new javax.swing.JComboBox<>();
        cod_producto = new javax.swing.JLabel();
        titulo_und1 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(680, 370));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-peq.png"))); // NOI18N
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        titulo_producto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_producto.setText("CATEGORIA");
        jPanel2.add(titulo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(30, 55, 94));
        titulo.setText("DETALLE DEL PRODUCTO");
        jPanel2.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        linea_titulo.setText("______________________________________________________");
        jPanel2.add(linea_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, 20));

        titulo_precio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_precio.setText("COSTO");
        jPanel2.add(titulo_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        precio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel2.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, 40));

        und.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        und.setText("1");
        und.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel2.add(und, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 110, 40));

        titulo_und.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_und.setText("UNIDADES");
        jPanel2.add(titulo_und, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        agregarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list.png"))); // NOI18N
        agregarproducto.setText(" Editar producto (ENTER)");
        agregarproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel2.add(agregarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 290, 50));

        editarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        editarproducto.setText(" E (ENTER)");
        editarproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editarproductoteclar(evt);
            }
        });
        jPanel2.add(editarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 290, 50));

        producto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 420, 40));

        titulo_producto1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_producto1.setText("PRODUCTO");
        jPanel2.add(titulo_producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        categorias.setEditable(true);
        jPanel2.add(categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 420, 40));

        cod_producto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cod_producto.setForeground(new java.awt.Color(204, 0, 0));
        cod_producto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cod_producto.setText("000000");
        jPanel2.add(cod_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 70, 40));

        titulo_und1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titulo_und1.setText("PRECIO");
        jPanel2.add(titulo_und1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        total.setEditable(false);
        total.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(0, 102, 51));
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("1");
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclar(evt);
            }
        });
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 110, 40));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teclar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclar
       char t = evt.getKeyChar();
       switch(t){
           case KeyEvent.VK_ENTER:
               this.agregarproducto.doClick();
               break;
           case KeyEvent.VK_ESCAPE:
               this.dispose();
               break;
       }
    }//GEN-LAST:event_teclar

    private void editarproductoteclar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editarproductoteclar
        // TODO add your handling code here:
    }//GEN-LAST:event_editarproductoteclar
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarproducto;
    private javax.swing.JComboBox<String> categorias;
    private javax.swing.JLabel cod_producto;
    private javax.swing.JButton editarproducto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel linea_titulo;
    private javax.swing.JLabel logo;
    public javax.swing.JTextField precio;
    public javax.swing.JTextField producto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo_precio;
    private javax.swing.JLabel titulo_producto;
    private javax.swing.JLabel titulo_producto1;
    private javax.swing.JLabel titulo_und;
    private javax.swing.JLabel titulo_und1;
    public javax.swing.JTextField total;
    public javax.swing.JTextField und;
    // End of variables declaration//GEN-END:variables
}
