package gui.Funciones;

import javax.swing.JPanel;

import gui.ControladorGui;
import java.util.Queue;

public class FCuadratica extends javax.swing.JPanel implements IFuncion {

    //f(x) = ax^2 + bx + c ; a != 0
    double a, b, c;

    @Override
    public double obtenerPuntoImagen(double x) {
        double y = (a * x * x) + (b * x) + c;
        return y;
    }

    public void setParams(Queue<Double> parametros) {
        
        double aCoef = parametros.poll();
        double bCoef = parametros.poll();
        double cCons = parametros.poll();
        
        this.a = aCoef == 0 ? 1 : aCoef;
        this.b = bCoef;
        this.c = cCons;

    }
    
    public FCuadratica() {
        initComponents();
        this.setSize(ControladorGui.DIMENSION_PANEL_ENTRADA);
    }

    public JPanel obtenerPanel(){
        return this;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTF2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTF1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTF3 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(300, 116));
        setMinimumSize(new java.awt.Dimension(300, 116));

        jTF2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTF2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTF2.setMaximumSize(new java.awt.Dimension(64, 31));
        jTF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF2KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("x +");

        jTF1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTF1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTF1.setMaximumSize(new java.awt.Dimension(64, 31));
        jTF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF1KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("x² +");

        jTF3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTF3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTF3.setMaximumSize(new java.awt.Dimension(64, 31));
        jTF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF1KeyTyped
        jTF1.setBorder(ControladorGui.BORDE_TEXTFIELDS);
    }//GEN-LAST:event_jTF1KeyTyped
    private void jTF3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF3KeyTyped
        jTF3.setBorder(ControladorGui.BORDE_TEXTFIELDS);
    }//GEN-LAST:event_jTF3KeyTyped
    private void jTF2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF2KeyTyped
        jTF2.setBorder(ControladorGui.BORDE_TEXTFIELDS);
    }//GEN-LAST:event_jTF2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTF1;
    private javax.swing.JTextField jTF2;
    private javax.swing.JTextField jTF3;
    // End of variables declaration//GEN-END:variables
}
