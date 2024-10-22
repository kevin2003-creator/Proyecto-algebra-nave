
package p2a;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;


public class Menuu extends javax.swing.JFrame {

    public Menuu() {
        initComponents();
        inicializarTablaConCeros(); // Llamamos al método que inicializa la tabla
        
    }
    
    
    // Método para configurar el filtro numérico en el JTextField
    private void configurarFiltroNumerico(JTextField txtX) {
        ((AbstractDocument) txtX.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("[0-9]+")) { // Solo permitir números
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text.matches("[0-9]+")) { // Solo permitir números
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            @Override
            public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
                super.remove(fb, offset, length); // Permitir borrar
            }
        });
    }
    
        // Este método inicializa la tabla con ceros
    private void inicializarTablaConCeros() {
        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tbl_stock.getModel();
        
        // Iterar sobre las filas y columnas para establecer el valor 0 excepto en la primera columna
        int filas = model.getRowCount();
        int columnas = model.getColumnCount();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 1; j < columnas; j++) { // Empezamos desde la columna 1 (segunda columna)
                model.setValueAt(0, i, j); // Establecer el valor 0 en cada celda, excepto en la columna 0
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_stock = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtY = new java.awt.TextField();
        txtX = new java.awt.TextField();
        txtZ = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btn_finalizar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        lbl_avion_1_2 = new javax.swing.JLabel();
        lbl_avion_1_3 = new javax.swing.JLabel();
        lbl_avion_1_4 = new javax.swing.JLabel();
        lbl_avion_1_5 = new javax.swing.JLabel();
        lblDistancias = new javax.swing.JLabel();
        lbl_avion_2_5 = new javax.swing.JLabel();
        lbl_avion_2_4 = new javax.swing.JLabel();
        lbl_avion_2_3 = new javax.swing.JLabel();
        lbl_avion_2_1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbl_avion_3_5 = new javax.swing.JLabel();
        lbl_avion_3_4 = new javax.swing.JLabel();
        lbl_avion_3_2 = new javax.swing.JLabel();
        lbl_avion_3_1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lbl_avion_4_1 = new javax.swing.JLabel();
        lbl_avion_4_2 = new javax.swing.JLabel();
        lbl_avion_4_3 = new javax.swing.JLabel();
        lbl_avion_4_5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lbl_avion_5_1 = new javax.swing.JLabel();
        lbl_avion_5_2 = new javax.swing.JLabel();
        lbl_avion_5_3 = new javax.swing.JLabel();
        lbl_avion_5_4 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("Aviones");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cool Text - Aero Vanguard 468663801526197.png"))); // NOI18N

        tbl_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nave 1", null, null, null},
                {"Nave 2", null, null, null},
                {"Nave 3", null, null, null},
                {"Nave 4", null, null, null},
                {"Nave 5", null, null, null}
            },
            new String [] {
                "Aero Nave", "Eje X", "Eje Y", "Eje Z"
            }
        ));
        tbl_stock.setFocusable(false);
        tbl_stock.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tbl_stockComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_stock);

        jLabel3.setText("Ingrese las coordenadas de los aviones ");

        txtX.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Y");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Z");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modo-avion.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modo-avion.png"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modo-avion.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modo-avion.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modo-avion.png"))); // NOI18N

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Avión 1");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Avión 2");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Avión 3");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Avión 4");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Avión 5");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marca-x.png"))); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btn_finalizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_finalizar.setForeground(new java.awt.Color(102, 255, 51));
        btn_finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cheque.png"))); // NOI18N
        btn_finalizar.setText("Finalizar");
        btn_finalizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_finalizar.setContentAreaFilled(false);
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cross_14875490 (1).png"))); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        lbl_avion_1_2.setText("Avion 2:");

        lbl_avion_1_3.setText("Avion 3:");

        lbl_avion_1_4.setText("Avion 4:");

        lbl_avion_1_5.setText("Avion 5:");

        lblDistancias.setText("Distancias:");

        lbl_avion_2_5.setText("Avion 5:");

        lbl_avion_2_4.setText("Avion 4:");

        lbl_avion_2_3.setText("Avion 3:");

        lbl_avion_2_1.setText("Avion 1:");

        jLabel26.setText("Distancias:");

        lbl_avion_3_5.setText("Avion 5:");

        lbl_avion_3_4.setText("Avion 4:");

        lbl_avion_3_2.setText("Avion 2:");

        lbl_avion_3_1.setText("Avion 1:");

        jLabel31.setText("Distancias:");

        jLabel32.setText("Distancias:");

        lbl_avion_4_1.setText("Avion 1:");

        lbl_avion_4_2.setText("Avion 2:");

        lbl_avion_4_3.setText("Avion 3:");

        lbl_avion_4_5.setText("Avion 5:");

        jLabel37.setText("Distancias:");

        lbl_avion_5_1.setText("Avion 1:");

        lbl_avion_5_2.setText("Avion 2:");

        lbl_avion_5_3.setText("Avion 3:");

        lbl_avion_5_4.setText("Avion 4:");

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(288, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)
                        .addComponent(btn_cerrar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDistancias)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(121, 121, 121)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_avion_4_1)
                                                    .addComponent(lbl_avion_4_3)
                                                    .addComponent(lbl_avion_4_2)
                                                    .addComponent(lbl_avion_4_5))))
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel37)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_avion_5_1)
                                                    .addComponent(lbl_avion_5_3)
                                                    .addComponent(lbl_avion_5_2)
                                                    .addComponent(lbl_avion_5_4)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Calcular))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_avion_1_2)
                                            .addComponent(lbl_avion_1_4)
                                            .addComponent(lbl_avion_1_3)
                                            .addComponent(lbl_avion_1_5))
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(lbl_avion_2_1)
                                            .addComponent(lbl_avion_2_3)
                                            .addComponent(lbl_avion_2_4)
                                            .addComponent(lbl_avion_2_5)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(lbl_avion_3_1)
                            .addComponent(lbl_avion_3_2)
                            .addComponent(lbl_avion_3_4)
                            .addComponent(lbl_avion_3_5))
                        .addGap(140, 140, 140)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)))
                                .addComponent(txtZ, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(926, Short.MAX_VALUE)
                    .addComponent(btn_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cerrar)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calcular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_limpiar)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(lblDistancias))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lbl_avion_1_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_avion_1_3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_avion_1_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_avion_1_5)
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(8, 8, 8))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel14))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(lbl_avion_2_1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_avion_2_3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_avion_2_4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_avion_2_5))
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_avion_3_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_avion_3_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_avion_3_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_avion_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel37)
                                                .addComponent(jLabel16))
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel32))
                                        .addGap(100, 100, 100))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbl_avion_4_1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_avion_4_2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_avion_4_3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_avion_4_5))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(lbl_avion_5_1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_avion_5_2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_avion_5_3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_avion_5_4)))))
                                .addGap(44, 44, 44))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btn_ingresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(128, 128, 128))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(414, Short.MAX_VALUE)
                    .addComponent(btn_finalizar)
                    .addGap(217, 217, 217)))
        );

        jTabbedPane4.addTab("Aviones", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Pilotos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Horarios", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        int filaSeleccionada = tbl_stock.getSelectedRow();
        
        
        

        if (filaSeleccionada != -1) { // Verificar que se haya seleccionado una fila
            // Obtener valores de los textfields
            String x = txtX.getText();
            String y = txtY.getText();
            String z = txtZ.getText();

            // Verificar que no estén vacíos
            if (!x.isEmpty() && !y.isEmpty() && !z.isEmpty() ) {
                
try{
                // Actualizar valores en la fila seleccionada
                tbl_stock.setValueAt(x, filaSeleccionada, 1);
                tbl_stock.setValueAt(y, filaSeleccionada, 2);
                tbl_stock.setValueAt(z, filaSeleccionada, 3);
                
                // Limpiar campos después de actualizar
                txtX.setText("");
                txtY.setText("");
                txtZ.setText("");}

                catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Por favor ingrese solo valores numericos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese los valores para X, Y, Z");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para actualizar.");
        }   
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
               User frm = new User(); 
            frm.setVisible(true);          
            this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
   
    }//GEN-LAST:event_btncalcularActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
                //Recolectamos los valores de la tabla y las asignamos en variables 
try {
    // Cambia los índices según tu tabla
    int nave1x = Integer.parseInt(tbl_stock.getValueAt(0, 1).toString());  // Eje x de Nave 1
    int nave1y = Integer.parseInt(tbl_stock.getValueAt(0, 2).toString());  // Eje y de Nave 1
    int nave1z = Integer.parseInt(tbl_stock.getValueAt(0, 3).toString());  // Eje z de Nave 1

    int nave2x = Integer.parseInt(tbl_stock.getValueAt(1, 1).toString());  // Eje x de Nave 2
    int nave2y = Integer.parseInt(tbl_stock.getValueAt(1, 2).toString());  // Eje y de Nave 2
    int nave2z = Integer.parseInt(tbl_stock.getValueAt(1, 3).toString());  // Eje z de Nave 2

    int nave3x = Integer.parseInt(tbl_stock.getValueAt(2, 1).toString());  // Eje x de Nave 3
    int nave3y = Integer.parseInt(tbl_stock.getValueAt(2, 2).toString());  // Eje y de Nave 3
    int nave3z = Integer.parseInt(tbl_stock.getValueAt(2, 3).toString());  // Eje z de Nave 3

    int nave4x = Integer.parseInt(tbl_stock.getValueAt(3, 1).toString());  // Eje x de Nave 4
    int nave4y = Integer.parseInt(tbl_stock.getValueAt(3, 2).toString());  // Eje y de Nave 4
    int nave4z = Integer.parseInt(tbl_stock.getValueAt(3, 3).toString());  // Eje z de Nave 4

    int nave5x = Integer.parseInt(tbl_stock.getValueAt(4, 1).toString());  // Eje x de Nave 5
    int nave5y = Integer.parseInt(tbl_stock.getValueAt(4, 2).toString());  // Eje y de Nave 5
    int nave5z = Integer.parseInt(tbl_stock.getValueAt(4, 3).toString());  // Eje z de Nave 5

    // Realizamos las operaciones matemáticas
    double x1 = nave1x;
    double y1 = nave1y;
    double z1 = nave1z;

    double x2 = nave2x;
    double y2 = nave2y;
    double z2 = nave2z;

    double x3 = nave3x;
    double y3 = nave3y;
    double z3 = nave3z;

    double x4 = nave4x;
    double y4 = nave4y;
    double z4 = nave4z;

    double x5 = nave5x;
    double y5 = nave5y;
    double z5 = nave5z;

    //-----------------------------------------------------------------------------------------------------------------------------
    //Calculo del primer avion 
    int distancia_nave1_nave2 = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));

    lbl_avion_1_2.setText("Avión 2: " + distancia_nave1_nave2 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave1_nave2 <= 9) {
        lbl_avion_1_2.setBackground(Color.RED); // Peligro
    } else if (distancia_nave1_nave2 <= 15) {
        lbl_avion_1_2.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_1_2.setBackground(Color.GREEN); // Normal
    }
    // Asegurarse de que el JLabel tenga un fondo visible
    lbl_avion_1_2.setOpaque(true);

    int distancia_nave1_nave3 = (int) Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2) + Math.pow(z3 - z1, 2));
    lbl_avion_1_3.setText("Avión 3: " + distancia_nave1_nave3 + " km");
    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave1_nave3 <= 9) {
        lbl_avion_1_3.setBackground(Color.RED); // Peligro
    } else if (distancia_nave1_nave2 <= 15) {
        lbl_avion_1_3.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_1_3.setBackground(Color.GREEN); // Normal
    }

    lbl_avion_1_3.setOpaque(true);

    int distancia_nave1_nave4 = (int) Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2) + Math.pow(z4 - z1, 2));
    lbl_avion_1_4.setText("Avión 4: " + distancia_nave1_nave4 + " km");

// Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave1_nave4 <= 9) {
        lbl_avion_1_4.setBackground(Color.RED); // Peligro
    } else if (distancia_nave1_nave2 <= 15) {
        lbl_avion_1_4.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_1_4.setBackground(Color.GREEN); // Normal
    }

    lbl_avion_1_4.setOpaque(true);

    int distancia_nave1_nave5 = (int) Math.sqrt(Math.pow(x5 - x1, 2) + Math.pow(y5 - y1, 2) + Math.pow(z5 - z1, 2));

    lbl_avion_1_5.setText("Avión 5: " + distancia_nave1_nave5 + " km");
    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave1_nave5 <= 9) {
        lbl_avion_1_5.setBackground(Color.RED); // Peligro
    } else if (distancia_nave1_nave2 <= 15) {
        lbl_avion_1_5.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_1_5.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_1_5.setOpaque(true);

    //-----------------------------------------------------------------------------------------------------------------------------
    //Calculo del segundo avion 
    int distancia_nave2_nave1 = (int) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));

    lbl_avion_2_1.setText("Avión 1: " + distancia_nave2_nave1 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave2_nave1 <= 9) {
        lbl_avion_2_1.setBackground(Color.RED); // Peligro
    } else if (distancia_nave2_nave1 <= 15) {
        lbl_avion_2_1.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_2_1.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_2_1.setOpaque(true);

    int distancia_nave2_nave3 = (int) Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2) + Math.pow(z3 - z2, 2));

    lbl_avion_2_3.setText("Avión 3: " + distancia_nave2_nave3 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave2_nave3 <= 9) {
        lbl_avion_2_3.setBackground(Color.RED); // Peligro
    } else if (distancia_nave2_nave3 <= 15) {
        lbl_avion_2_3.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_2_3.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_2_3.setOpaque(true);

    int distancia_nave2_nave4 = (int) Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2) + Math.pow(z4 - z2, 2));

    lbl_avion_2_4.setText("Avión 4: " + distancia_nave2_nave4 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave2_nave4 <= 9) {
        lbl_avion_2_4.setBackground(Color.RED); // Peligro
    } else if (distancia_nave2_nave4 <= 15) {
        lbl_avion_2_4.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_2_4.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_2_4.setOpaque(true);

    int distancia_nave2_nave5 = (int) Math.sqrt(Math.pow(x5 - x2, 2) + Math.pow(y5 - y2, 2) + Math.pow(z5 - z2, 2));

    lbl_avion_2_5.setText("Avión 5: " + distancia_nave2_nave5 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave2_nave5 <= 9) {
        lbl_avion_2_5.setBackground(Color.RED); // Peligro
    } else if (distancia_nave2_nave5 <= 15) {
        lbl_avion_2_5.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_2_5.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_2_5.setOpaque(true);

    //-----------------------------------------------------------------------------------------------------------------------------
    //Calculo del tercer avion 
    int distancia_nave3_nave1 = (int) Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2) + Math.pow(z1 - z3, 2));

    lbl_avion_3_1.setText("Avión 1: " + distancia_nave3_nave1 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave3_nave1 <= 9) {
        lbl_avion_3_1.setBackground(Color.RED); // Peligro
    } else if (distancia_nave3_nave1 <= 15) {
        lbl_avion_3_1.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_3_1.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_3_1.setOpaque(true);

    int distancia_nave3_nave2 = (int) Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2) + Math.pow(z2 - z3, 2));

    lbl_avion_3_2.setText("Avión 2: " + distancia_nave3_nave2 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave3_nave2 <= 9) {
        lbl_avion_3_2.setBackground(Color.RED); // Peligro
    } else if (distancia_nave3_nave2 <= 15) {
        lbl_avion_3_2.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_3_2.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_3_2.setOpaque(true);

    int distancia_nave3_nave4 = (int) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) + Math.pow(z4 - z3, 2));

    lbl_avion_3_4.setText("Avión 4: " + distancia_nave3_nave4 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave3_nave4 <= 9) {
        lbl_avion_3_4.setBackground(Color.RED); // Peligro
    } else if (distancia_nave3_nave4 <= 15) {
        lbl_avion_3_4.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_3_4.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_3_4.setOpaque(true);

    int distancia_nave3_nave5 = (int) Math.sqrt(Math.pow(x5 - x3, 2) + Math.pow(y5 - y3, 2) + Math.pow(z5 - z3, 2));

    lbl_avion_3_5.setText("Avión 5: " + distancia_nave3_nave5 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave3_nave5 <= 9) {
        lbl_avion_3_5.setBackground(Color.RED); // Peligro
    } else if (distancia_nave3_nave5 <= 15) {
        lbl_avion_3_5.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_3_5.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_3_5.setOpaque(true);

    //-----------------------------------------------------------------------------------------------------------------------------
    //Calculo del cuarto avion 
    int distancia_nave4_nave1 = (int) Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2) + Math.pow(z1 - z4, 2));

    lbl_avion_4_1.setText("Avión 1: " + distancia_nave4_nave1 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave4_nave1 <= 9) {
        lbl_avion_4_1.setBackground(Color.RED); // Peligro
    } else if (distancia_nave4_nave1 <= 15) {
        lbl_avion_4_1.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_4_1.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_4_1.setOpaque(true);

    int distancia_nave4_nave2 = (int) Math.sqrt(Math.pow(x2 - x4, 2) + Math.pow(y2 - y3, 2) + Math.pow(z2 - z4, 2));

    lbl_avion_4_2.setText("Avión 2: " + distancia_nave4_nave2 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave4_nave2 <= 9) {
        lbl_avion_4_2.setBackground(Color.RED); // Peligro
    } else if (distancia_nave4_nave2 <= 15) {
        lbl_avion_4_2.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_4_2.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_4_2.setOpaque(true);

    int distancia_nave4_nave3 = (int) Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2) + Math.pow(z3 - z4, 2));

    lbl_avion_4_3.setText("Avión 3: " + distancia_nave4_nave3 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave4_nave3 <= 9) {
        lbl_avion_4_3.setBackground(Color.RED); // Peligro
    } else if (distancia_nave4_nave3 <= 15) {
        lbl_avion_4_3.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_4_3.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_4_3.setOpaque(true);

    int distancia_nave4_nave5 = (int) Math.sqrt(Math.pow(x5 - x4, 2) + Math.pow(y5 - y4, 2) + Math.pow(z5 - z4, 2));

    lbl_avion_4_5.setText("Avión 5: " + distancia_nave4_nave5 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave4_nave5 <= 9) {
        lbl_avion_4_5.setBackground(Color.RED); // Peligro
    } else if (distancia_nave4_nave5 <= 15) {
        lbl_avion_4_5.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_4_5.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_4_5.setOpaque(true);

    //-----------------------------------------------------------------------------------------------------------------------------
    //Calculo del quinto avion 
    int distancia_nave5_nave1 = (int) Math.sqrt(Math.pow(x1 - x5, 2) + Math.pow(y1 - y5, 2) + Math.pow(z1 - z5, 2));

    lbl_avion_5_1.setText("Avión 1: " + distancia_nave5_nave1 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave5_nave1 <= 9) {
        lbl_avion_5_1.setBackground(Color.RED); // Peligro
    } else if (distancia_nave5_nave1 <= 15) {
        lbl_avion_5_1.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_5_1.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_5_1.setOpaque(true);

    int distancia_nave5_nave2 = (int) Math.sqrt(Math.pow(x2 - x5, 2) + Math.pow(y2 - y5, 2) + Math.pow(z2 - z5, 2));

    lbl_avion_5_2.setText("Avión 2: " + distancia_nave5_nave2 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave5_nave2 <= 9) {
        lbl_avion_5_2.setBackground(Color.RED); // Peligro
    } else if (distancia_nave5_nave2 <= 15) {
        lbl_avion_5_2.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_5_2.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_5_2.setOpaque(true);

    int distancia_nave5_nave3 = (int) Math.sqrt(Math.pow(x3 - x5, 2) + Math.pow(y3 - y5, 2) + Math.pow(z3 - z5, 2));

    lbl_avion_5_3.setText("Avión 3: " + distancia_nave5_nave3 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave5_nave3 <= 9) {
        lbl_avion_5_3.setBackground(Color.RED); // Peligro
    } else if (distancia_nave5_nave3 <= 15) {
        lbl_avion_5_3.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_5_3.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_5_3.setOpaque(true);

    int distancia_nave5_nave4 = (int) Math.sqrt(Math.pow(x4 - x5, 2) + Math.pow(y4 - y5, 2) + Math.pow(z4 - z5, 2));

    lbl_avion_5_4.setText("Avión 4: " + distancia_nave5_nave4 + " km");

    // Cambiar el color de fondo del JLabel basado en la distancia
    if (distancia_nave5_nave4 <= 9) {
        lbl_avion_5_4.setBackground(Color.RED); // Peligro
    } else if (distancia_nave5_nave4 <= 15) {
        lbl_avion_5_4.setBackground(Color.YELLOW); // Precaución
    } else {
        lbl_avion_5_4.setBackground(Color.GREEN); // Normal
    }
    lbl_avion_5_4.setOpaque(true);



} catch (NumberFormatException e) {
    // Manejar la excepción si la conversión falla
                    JOptionPane.showMessageDialog(this, "Error: No se pueden operar con caracteres tipo string ni tipo null");

} catch (Exception e) {
    // Manejar otras excepciones que puedan surgir
    JOptionPane.showMessageDialog(this,"Error: " + e.getMessage());
}
    }//GEN-LAST:event_CalcularActionPerformed

    private void tbl_stockComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tbl_stockComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_stockComponentAdded

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        
                // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tbl_stock.getModel();
        
        // Iterar sobre las filas y columnas para establecer el valor 0 excepto en la primera columna
        int filas = model.getRowCount();
        int columnas = model.getColumnCount();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 1; j < columnas; j++) { // Empezamos desde la columna 1 (segunda columna)
                model.setValueAt(0, i, j); // Establecer el valor 0 en cada celda, excepto en la columna 0
            }
        }

   
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                
        
                
                // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tbl_stock.getModel();
        
        // Iterar sobre las filas y columnas para establecer el valor 0 excepto en la primera columna
        int filas = model.getRowCount();
        int columnas = model.getColumnCount();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 1; j < columnas; j++) { // Empezamos desde la columna 1 (segunda columna)
                model.setValueAt(0, i, j); // Establecer el valor 0 en cada celda, excepto en la columna 0
            }
        }
        
        lbl_avion_1_2.setText("Avión 2:" );
        lbl_avion_1_3.setText("Avión 3:" );
        lbl_avion_1_4.setText("Avión 4:" );
        lbl_avion_1_5.setText("Avión 5:" );
        lbl_avion_2_1.setText("Avión 1:" );
        lbl_avion_2_3.setText("Avión 3:" );
        lbl_avion_2_4.setText("Avión 4:" );
        lbl_avion_2_5.setText("Avión 5:" );
        lbl_avion_3_1.setText("Avión 1:" );
        lbl_avion_3_2.setText("Avión 2:" );
        lbl_avion_3_4.setText("Avión 4:" );
        lbl_avion_3_5.setText("Avión 5:" );
        lbl_avion_4_1.setText("Avión 1:" );
        lbl_avion_4_2.setText("Avión 2:" );
        lbl_avion_4_3.setText("Avión 3:" );
        lbl_avion_4_5.setText("Avión 5:" );
        lbl_avion_5_1.setText("Avión 1:" );
        lbl_avion_5_2.setText("Avión 2:" );
        lbl_avion_5_3.setText("Avión 3:" );
        lbl_avion_5_4.setText("Avión 4:" );
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        
                       User frm = new User(); 
            frm.setVisible(true);          
            this.dispose();
        
        
        
    }//GEN-LAST:event_btn_finalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lblDistancias;
    private javax.swing.JLabel lbl_avion_1_2;
    private javax.swing.JLabel lbl_avion_1_3;
    private javax.swing.JLabel lbl_avion_1_4;
    private javax.swing.JLabel lbl_avion_1_5;
    private javax.swing.JLabel lbl_avion_2_1;
    private javax.swing.JLabel lbl_avion_2_3;
    private javax.swing.JLabel lbl_avion_2_4;
    private javax.swing.JLabel lbl_avion_2_5;
    private javax.swing.JLabel lbl_avion_3_1;
    private javax.swing.JLabel lbl_avion_3_2;
    private javax.swing.JLabel lbl_avion_3_4;
    private javax.swing.JLabel lbl_avion_3_5;
    private javax.swing.JLabel lbl_avion_4_1;
    private javax.swing.JLabel lbl_avion_4_2;
    private javax.swing.JLabel lbl_avion_4_3;
    private javax.swing.JLabel lbl_avion_4_5;
    private javax.swing.JLabel lbl_avion_5_1;
    private javax.swing.JLabel lbl_avion_5_2;
    private javax.swing.JLabel lbl_avion_5_3;
    private javax.swing.JLabel lbl_avion_5_4;
    private javax.swing.JTable tbl_stock;
    private java.awt.TextField txtX;
    private java.awt.TextField txtY;
    private java.awt.TextField txtZ;
    // End of variables declaration//GEN-END:variables
}
