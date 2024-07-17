package gui.Funciones;

import gui.ControladorGui;

import java.util.Queue;

import javax.swing.JPanel;

public class FCubica extends javax.swing.JPanel implements IFuncion {

    // f(x) = ax³+ bx² + cx + d ; a != 0
    private double a, b, c, d;

    public FCubica() {
        initComponents();
        this.setSize(ControladorGui.DIMENSION_PANEL_ENTRADA);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTF2 = new javax.swing.JTextField();
        jTF3 = new javax.swing.JTextField();
        jTF1 = new javax.swing.JTextField();
        jTF4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(300, 116));
        setMinimumSize(new java.awt.Dimension(300, 116));

        jTF2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTF2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF2KeyTyped(evt);
            }
        });

        jTF3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTF3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF3KeyTyped(evt);
            }
        });

        jTF1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTF1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF1ActionPerformed(evt);
            }
        });
        jTF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF1KeyTyped(evt);
            }
        });

        jTF4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTF4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTF4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF4KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("x² +");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("x +");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("x³+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF1KeyTyped
        jTF1.setBorder(ControladorGui.BORDE_TEXTFIELDS);
    }//GEN-LAST:event_jTF1KeyTyped
    private void jTF2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF2KeyTyped
        jTF2.setBorder(ControladorGui.BORDE_TEXTFIELDS);
    }//GEN-LAST:event_jTF2KeyTyped
    private void jTF3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF3KeyTyped
        jTF3.setBorder(ControladorGui.BORDE_TEXTFIELDS);
    }//GEN-LAST:event_jTF3KeyTyped
    private void jTF4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF4KeyTyped
        jTF4.setBorder(ControladorGui.BORDE_TEXTFIELDS);
    }//GEN-LAST:event_jTF4KeyTyped

    private void jTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF1ActionPerformed

    @Override
    public double obtenerPuntoImagen(double x) {
        double y = (a * Math.pow(x, 3)) + (b * Math.pow(x, 2)) + (c * x) + d;
        return y;
    }

    @Override
    public void setParams(Queue<Double> parametros) {
        double aCoef = parametros.poll();
        double bCoef = parametros.poll();
        double cCoef = parametros.poll();
        double dConst = parametros.poll();
        
        this.a = aCoef == 0 ? 1 : aCoef;
        this.b = bCoef;
        this.c = cCoef;
        this.d = dConst;
        
    }
    
    public JPanel obtenerPanel() {
        return this;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTF1;
    private javax.swing.JTextField jTF2;
    private javax.swing.JTextField jTF3;
    private javax.swing.JTextField jTF4;
    // End of variables declaration//GEN-END:variables
}
