package gui.Funciones;

import gui.ControladorGui;
import java.util.LinkedList;

import java.util.Queue;

import javax.swing.JPanel;

public class FPolinomial extends javax.swing.JPanel implements IFuncion {

    //f(x) = a1x^n + a2x^(n-1) + a3x^(n-2) + ... + an-2x² + an-1x + an ; a1 != 0
    public static Queue<Double> coeficientes;

    private final FPolinomialCoef ventanaCoef = new FPolinomialCoef();

    public FPolinomial() {
        initComponents();
        this.setSize(ControladorGui.DIMENSION_PANEL_ENTRADA);
    }

    public JPanel obtenerPanel() {
        return this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCoef = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(300, 116));
        setMinimumSize(new java.awt.Dimension(300, 116));

        btnCoef.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCoef.setText("Coeficientes");
        btnCoef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(btnCoef, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnCoef)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoefActionPerformed

        ventanaCoef.setVisible(true);

    }//GEN-LAST:event_btnCoefActionPerformed

    @Override
    public double obtenerPuntoImagen(double x) {

        double y = 0;

        int cantidadCoeficientes = coeficientes.size();

        Queue<Double> parametro = new LinkedList<>(coeficientes);

        for (int i = 0; i < cantidadCoeficientes; i++) {
            y += parametro.poll() * Math.pow(x, i);
        }

        return y;

    }

    @Override
    public void setParams(Queue<Double> parametros) {
        FPolinomial.coeficientes = parametros;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoef;
    // End of variables declaration//GEN-END:variables
}
