package VISTA;

import GRAFOS.clases.VentanaPrincipal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;

public class Principal extends javax.swing.JFrame {

    Color DefaulColor, ClickedColor;

    public Principal() {

        initComponents();
        InitContent();
        setDate();

        DefaulColor = new Color(150, 255, 153);
        ClickedColor = new Color(150, 255, 153);

        btnEmpleado.setBackground(DefaulColor);
        btnHuesped.setBackground(DefaulColor);
        btnNosotros.setBackground(DefaulColor);
        btnFactura.setBackground(DefaulColor);
        btnHabitacion.setBackground(DefaulColor);
        btnTH.setBackground(DefaulColor);
        btnReservacion.setBackground(DefaulColor);

    }

    private void InitContent() {
        Nosotros1 nos1 = new Nosotros1();
        nos1.setSize(802, 540);
        nos1.setLocation(0, 0);

        content.removeAll();
        content.add(nos1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }

    private void setDate() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
        dateText.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEmpleado = new javax.swing.JButton();
        btnHabitacion = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnHuesped = new javax.swing.JButton();
        btnNosotros = new javax.swing.JButton();
        btnReservacion = new javax.swing.JButton();
        btnTH = new javax.swing.JButton();
        btnGRAFO = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(102, 255, 102));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icono.PNG"))); // NOI18N
        jLabel3.setText("iBed");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("===");

        btnEmpleado.setBackground(new java.awt.Color(102, 255, 102));
        btnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-trabajo-permanente-48.png"))); // NOI18N
        btnEmpleado.setText("EMPLEADO");
        btnEmpleado.setBorder(null);
        btnEmpleado.setBorderPainted(false);
        btnEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmpleadoMousePressed(evt);
            }
        });
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        btnHabitacion.setBackground(new java.awt.Color(102, 255, 102));
        btnHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-cama-matrimonial-48.png"))); // NOI18N
        btnHabitacion.setText("HABITACIONES");
        btnHabitacion.setBorder(null);
        btnHabitacion.setBorderPainted(false);
        btnHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHabitacionMousePressed(evt);
            }
        });
        btnHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionActionPerformed(evt);
            }
        });

        btnFactura.setBackground(new java.awt.Color(102, 255, 102));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-factura-48.png"))); // NOI18N
        btnFactura.setText("FACTURA");
        btnFactura.setBorder(null);
        btnFactura.setBorderPainted(false);
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFactura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFacturaMousePressed(evt);
            }
        });
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnHuesped.setBackground(new java.awt.Color(102, 255, 102));
        btnHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-cliente-48.png"))); // NOI18N
        btnHuesped.setText("HUESPED");
        btnHuesped.setBorder(null);
        btnHuesped.setBorderPainted(false);
        btnHuesped.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHuesped.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHuespedMousePressed(evt);
            }
        });
        btnHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuespedActionPerformed(evt);
            }
        });

        btnNosotros.setBackground(new java.awt.Color(102, 255, 102));
        btnNosotros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-hotel-48.png"))); // NOI18N
        btnNosotros.setText("NOSOTROS");
        btnNosotros.setBorder(null);
        btnNosotros.setBorderPainted(false);
        btnNosotros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNosotros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNosotros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNosotrosMousePressed(evt);
            }
        });
        btnNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNosotrosActionPerformed(evt);
            }
        });

        btnReservacion.setBackground(new java.awt.Color(102, 255, 102));
        btnReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-hora-de-salida-del-hotel-48.png"))); // NOI18N
        btnReservacion.setText("RESERVACION");
        btnReservacion.setBorder(null);
        btnReservacion.setBorderPainted(false);
        btnReservacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReservacionMousePressed(evt);
            }
        });
        btnReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservacionActionPerformed(evt);
            }
        });

        btnTH.setBackground(new java.awt.Color(102, 255, 102));
        btnTH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-torre-48.png"))); // NOI18N
        btnTH.setText("TORRE");
        btnTH.setBorder(null);
        btnTH.setBorderPainted(false);
        btnTH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTHMousePressed(evt);
            }
        });
        btnTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHActionPerformed(evt);
            }
        });

        btnGRAFO.setBackground(new java.awt.Color(102, 255, 102));
        btnGRAFO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-ruta-48.png"))); // NOI18N
        btnGRAFO.setText("RUTA DEL TOUR");
        btnGRAFO.setBorder(null);
        btnGRAFO.setBorderPainted(false);
        btnGRAFO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGRAFO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGRAFO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGRAFOMousePressed(evt);
            }
        });
        btnGRAFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRAFOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHuesped, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNosotros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(btnReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGRAFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNosotros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGRAFO, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(153, 255, 153));
        header.setPreferredSize(new java.awt.Dimension(750, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Registro de cliente/ Registro de empleado / Consulta de habitaciones/ Cobros");

        dateText.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        dateText.setText("Hoy es {dayname} {day} del {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        Empleado1 Emp1 = new Empleado1();
        Emp1.setSize(802, 540);
        Emp1.setLocation(0, 0);

        content.removeAll();
        content.add(Emp1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionActionPerformed
        Habitacion1 hab1 = new Habitacion1();
        hab1.setSize(802,540);
        hab1.setLocation(0, 0);

        content.removeAll();
        content.add(hab1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnHabitacionActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        Factura1 Fac1 = new Factura1();
        Fac1.setSize(802, 540);
        Fac1.setLocation(0, 0);

        content.removeAll();
        content.add(Fac1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuespedActionPerformed
        Huesped1 Hue1 = new Huesped1();
        Hue1.setSize(802, 540);
        Hue1.setLocation(0, 0);

        content.removeAll();
        content.add(Hue1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnHuespedActionPerformed

    private void btnNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNosotrosActionPerformed
        Nosotros1 nos1 = new Nosotros1();
        nos1.setSize(802, 540);
        nos1.setLocation(0, 0);

        content.removeAll();
        content.add(nos1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnNosotrosActionPerformed

    private void btnNosotrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNosotrosMousePressed
        btnNosotros.setBackground(ClickedColor);
        btnEmpleado.setBackground(DefaulColor);
        btnHuesped.setBackground(DefaulColor);
        btnFactura.setBackground(DefaulColor);
        btnHabitacion.setBackground(DefaulColor);
        btnTH.setBackground(DefaulColor);
        btnReservacion.setBackground(DefaulColor);
    }//GEN-LAST:event_btnNosotrosMousePressed

    private void btnHuespedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuespedMousePressed
        btnNosotros.setBackground(DefaulColor);
        btnHuesped.setBackground(ClickedColor);
        btnEmpleado.setBackground(DefaulColor);
        btnFactura.setBackground(DefaulColor);
        btnHabitacion.setBackground(DefaulColor);
        btnTH.setBackground(DefaulColor);
        btnReservacion.setBackground(DefaulColor);
    }//GEN-LAST:event_btnHuespedMousePressed

    private void btnEmpleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadoMousePressed
        btnNosotros.setBackground(DefaulColor);
        btnHuesped.setBackground(DefaulColor);
        btnEmpleado.setBackground(ClickedColor);
        btnFactura.setBackground(DefaulColor);
        btnHabitacion.setBackground(DefaulColor);
        btnTH.setBackground(DefaulColor);
        btnReservacion.setBackground(DefaulColor);
    }//GEN-LAST:event_btnEmpleadoMousePressed

    private void btnHabitacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionMousePressed
        btnNosotros.setBackground(DefaulColor);
        btnHuesped.setBackground(DefaulColor);
        btnEmpleado.setBackground(DefaulColor);
        btnHabitacion.setBackground(ClickedColor);
        btnFactura.setBackground(DefaulColor);
        btnTH.setBackground(DefaulColor);
        btnReservacion.setBackground(DefaulColor);
    }//GEN-LAST:event_btnHabitacionMousePressed

    private void btnFacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMousePressed
        btnNosotros.setBackground(DefaulColor);
        btnHuesped.setBackground(DefaulColor);
        btnEmpleado.setBackground(DefaulColor);
        btnHabitacion.setBackground(DefaulColor);
        btnFactura.setBackground(ClickedColor);
        btnTH.setBackground(DefaulColor);
        btnReservacion.setBackground(DefaulColor);
    }//GEN-LAST:event_btnFacturaMousePressed

    private void btnTHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTHMousePressed

    }//GEN-LAST:event_btnTHMousePressed

    private void btnTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHActionPerformed
        VentanaP Hue1 = new VentanaP();
        Hue1.setSize(802, 540);
        Hue1.setLocation(0, 0);

        content.removeAll();
        content.add(Hue1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnTHActionPerformed

    private void btnReservacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservacionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservacionMousePressed

    private void btnReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservacionActionPerformed
        Reservación1 Hue1 = new Reservación1();
        Hue1.setSize(802, 540);
        Hue1.setLocation(0, 0);

        content.removeAll();
        content.add(Hue1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnReservacionActionPerformed

    private void btnGRAFOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGRAFOMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGRAFOMousePressed

    private void btnGRAFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAFOActionPerformed
                // Crear una instancia de ArbolBinario1
        VentanaPrincipal vp = new VentanaPrincipal();

        // Mostrar el JFrame
        vp.setVisible(true);
    }//GEN-LAST:event_btnGRAFOActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnGRAFO;
    private javax.swing.JButton btnHabitacion;
    private javax.swing.JButton btnHuesped;
    private javax.swing.JButton btnNosotros;
    private javax.swing.JButton btnReservacion;
    private javax.swing.JButton btnTH;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
