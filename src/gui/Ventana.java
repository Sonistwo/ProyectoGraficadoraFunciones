package gui;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

import logica.Plano;
import logica.funciones.*;

public class Ventana extends javax.swing.JFrame {
    
    private Plano planoCartesiano;
    private Funcion f = new FCuadratica(1, 0, 0);
    
    private boolean funcionPintada = false;
    
    public Ventana() {
        initComponents();
        iniciarVentana();
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                iniciarPlano();
            }
        });
        
    }
    
    private void iniciarVentana() {
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
    
    private void iniciarPlano() {
        
        planoCartesiano = new Plano(panelFuncion);
        planoCartesiano.dibujarPlano();
        
    }
    
    private void setFuncion(Funcion f) {
        this.f = f;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelFuncion = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        panelAbajo = new javax.swing.JPanel();
        btnZoomIn = new javax.swing.JButton();
        btnZoomOut = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        etErrorZoom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFuncion.setMaximumSize(new java.awt.Dimension(400, 400));
        panelFuncion.setMinimumSize(new java.awt.Dimension(400, 400));
        panelFuncion.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout panelFuncionLayout = new javax.swing.GroupLayout(panelFuncion);
        panelFuncion.setLayout(panelFuncionLayout);
        panelFuncionLayout.setHorizontalGroup(
            panelFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelFuncionLayout.setVerticalGroup(
            panelFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/zoomin.png"))); // NOI18N
        btnZoomIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnZoomIn.setMaximumSize(new java.awt.Dimension(60, 60));
        btnZoomIn.setMinimumSize(new java.awt.Dimension(55, 55));
        btnZoomIn.setPreferredSize(new java.awt.Dimension(55, 55));
        btnZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomInActionPerformed(evt);
            }
        });

        btnZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/zoomout.png"))); // NOI18N
        btnZoomOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnZoomOut.setMaximumSize(new java.awt.Dimension(60, 60));
        btnZoomOut.setMinimumSize(new java.awt.Dimension(55, 55));
        btnZoomOut.setPreferredSize(new java.awt.Dimension(55, 55));
        btnZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomOutActionPerformed(evt);
            }
        });

        btnGraficar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGraficar.setText("GRAFICAR");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        etErrorZoom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etErrorZoom.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbajoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etErrorZoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAbajoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panelAbajoLayout.setVerticalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnZoomIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZoomOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGraficar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etErrorZoom)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomInActionPerformed
        
        if (planoCartesiano.getEscala() + Plano.ESCALA_PASO == Plano.ESCALA_MAX) {
            
            btnZoomIn.setEnabled(false);
            
        }
        
        etErrorZoom.setText("");
        
        planoCartesiano.setEscala(planoCartesiano.getEscala() + Plano.ESCALA_PASO);
        planoCartesiano.repintarPlano();
        
        btnZoomOut.setEnabled(true);
        
        if (funcionPintada) {
            planoCartesiano.dibujarFuncion(f);
        }

    }//GEN-LAST:event_btnZoomInActionPerformed

    private void btnZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomOutActionPerformed
        
        if (planoCartesiano.getEscala() - Plano.ESCALA_PASO == Plano.ESCALA_MIN) {
            
            btnZoomOut.setEnabled(false);
            
        }
        
        etErrorZoom.setText("");
        
        planoCartesiano.setEscala(planoCartesiano.getEscala() - Plano.ESCALA_PASO);
        planoCartesiano.repintarPlano();
        
        btnZoomIn.setEnabled(true);
        
        if (funcionPintada) {
            planoCartesiano.dibujarFuncion(f);
        }

    }//GEN-LAST:event_btnZoomOutActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        planoCartesiano.dibujarFuncion(f);
        this.funcionPintada = true;
    }//GEN-LAST:event_btnGraficarActionPerformed
    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Ventana().setVisible(true);
//                
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnZoomIn;
    private javax.swing.JButton btnZoomOut;
    private javax.swing.JLabel etErrorZoom;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelFuncion;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
