package gui.Funciones;

import javax.swing.JPanel;

import gui.ControladorGui;

import java.util.Queue;

public class FLineal extends javax.swing.JPanel implements IFuncion, IPanelado {

    //f(x) = mx + b ; m != 0
    private double m, b;

    @Override
    public double obtenerPuntoImagen(double x) {
        double y = (m * x) + b;
        return y;
    }

    public void setParams(Queue<Double> parametros) {

        double pendiente = parametros.poll();
        double complemento = parametros.poll();

        if (pendiente == 0) {
            this.m = 1;
        } else {
            this.m = pendiente;
        }
        this.b = complemento;
    }

    public FLineal() {
        initComponents();
        this.setSize(ControladorGui.DIMENSION_PANEL_ENTRADA);
    }

    @Override
    public JPanel obtenerPanel() {
        return this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTF1 = new javax.swing.JTextField();
        jTF2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(300, 116));
        setMinimumSize(new java.awt.Dimension(300, 116));

        jTF1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTF1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTF1.setMaximumSize(new java.awt.Dimension(64, 38));
        jTF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF1KeyTyped(evt);
            }
        });

        jTF2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTF2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTF2.setMaximumSize(new java.awt.Dimension(64, 38));
        jTF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF2KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("x +");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF1KeyTyped
        jTF1.setBorder(ControladorGui.BORDE_TEXTFIELDS);
    }//GEN-LAST:event_jTF1KeyTyped
    private void jTF2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF2KeyTyped
        jTF2.setBorder(ControladorGui.BORDE_TEXTFIELDS);
    }//GEN-LAST:event_jTF2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTF1;
    private javax.swing.JTextField jTF2;
    // End of variables declaration//GEN-END:variables
}
