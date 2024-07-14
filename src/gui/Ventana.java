package gui;

import java.util.Queue;
import java.util.LinkedList;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

import logica.Plano;
import logica.Controlador;
import logica.funciones.*;

public class Ventana extends javax.swing.JFrame {

    private Plano planoCartesiano;
    private Funcion f;

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
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        cboxFunciones.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                setEntradas();
                cambioFuncion();
            }
        });
        
        this.f = new FLineal();
        setEntradas();

    }

    private void iniciarPlano() {

        planoCartesiano = new Plano(panelFuncion);
        planoCartesiano.dibujarPlano();

    }

    private void setFuncion(Funcion f) {
        this.f = f;
    }

    private Queue<Double> obtenerEntradas() {

        Queue<Double> colaParametros = new LinkedList<>();

        Component panel = panelEntrada.getComponent(0);

        if (panel instanceof JPanel p) {

            Component[] componentes = p.getComponents();

            for (Component c : componentes) {
                if (c instanceof JTextField campo) {
                    if (!campo.getText().isEmpty()) {
                        Double parametro = Double.valueOf(campo.getText());
                        colaParametros.add(parametro);
                    } else {
                        colaParametros.add(Double.valueOf(0));
                    }

                }
            }

        }

        return colaParametros;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelFuncion = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        cboxFunciones = new javax.swing.JComboBox<>();
        panelEntrada = new javax.swing.JPanel();
        panelAbajo = new javax.swing.JPanel();
        btnZoomIn = new javax.swing.JButton();
        btnZoomOut = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(842, 570));
        setMinimumSize(new java.awt.Dimension(842, 570));

        panelPrincipal.setMaximumSize(new java.awt.Dimension(842, 570));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(842, 570));

        panelFuncion.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        panelFuncion.setMaximumSize(new java.awt.Dimension(400, 400));
        panelFuncion.setMinimumSize(new java.awt.Dimension(400, 400));
        panelFuncion.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout panelFuncionLayout = new javax.swing.GroupLayout(panelFuncion);
        panelFuncion.setLayout(panelFuncionLayout);
        panelFuncionLayout.setHorizontalGroup(
            panelFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelFuncionLayout.setVerticalGroup(
            panelFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        panelLateral.setMaximumSize(new java.awt.Dimension(312, 510));
        panelLateral.setMinimumSize(new java.awt.Dimension(312, 510));

        cboxFunciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboxFunciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lineal", "Cuadrática" }));
        cboxFunciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxFunciones.setFocusable(false);
        cboxFunciones.setMaximumSize(new java.awt.Dimension(131, 31));
        cboxFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFuncionesActionPerformed(evt);
            }
        });

        panelEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEntrada.setMaximumSize(new java.awt.Dimension(300, 116));
        panelEntrada.setMinimumSize(new java.awt.Dimension(300, 116));
        panelEntrada.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(cboxFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cboxFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAbajo.setMaximumSize(new java.awt.Dimension(398, 95));
        panelAbajo.setMinimumSize(new java.awt.Dimension(398, 95));

        btnZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/zoomin.png"))); // NOI18N
        btnZoomIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnZoomIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnZoomIn.setMaximumSize(new java.awt.Dimension(55, 55));
        btnZoomIn.setMinimumSize(new java.awt.Dimension(55, 55));
        btnZoomIn.setPreferredSize(new java.awt.Dimension(55, 55));
        btnZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomInActionPerformed(evt);
            }
        });

        btnZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/zoomout.png"))); // NOI18N
        btnZoomOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnZoomOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnZoomOut.setMaximumSize(new java.awt.Dimension(55, 55));
        btnZoomOut.setMinimumSize(new java.awt.Dimension(55, 55));
        btnZoomOut.setPreferredSize(new java.awt.Dimension(55, 55));
        btnZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomOutActionPerformed(evt);
            }
        });

        btnGraficar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGraficar.setText("GRAFICAR");
        btnGraficar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbajoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(30, Short.MAX_VALUE))
        );

        separador.setBackground(new java.awt.Color(102, 102, 102));
        separador.setForeground(new java.awt.Color(102, 102, 102));
        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separador.setMaximumSize(new java.awt.Dimension(50, 10));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelLateral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        planoCartesiano.setEscala(planoCartesiano.getEscala() - Plano.ESCALA_PASO);
        planoCartesiano.repintarPlano();

        btnZoomIn.setEnabled(true);

        if (funcionPintada) {
            planoCartesiano.dibujarFuncion(f);
        }

    }//GEN-LAST:event_btnZoomOutActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed

        planoCartesiano.repintarPlano();
            
        Queue<Double> parametros = obtenerEntradas();

        String funcionSeleccionada = getFuncionSeleccionada();

        switch (funcionSeleccionada) {

            case "Lineal":
                FLineal lineal = (FLineal) f;
                lineal.setParams(parametros.poll(), parametros.poll());
                break;

            case "Cuadrática":
                FCuadratica cuadratica = (FCuadratica) f;
                cuadratica.setParams(parametros.poll(), parametros.poll(), parametros.poll());
                break;
                
            default:
                return;

        }

        planoCartesiano.dibujarFuncion(f);
        this.funcionPintada = true;
        
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void cboxFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFuncionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxFuncionesActionPerformed

    private void setEntradas() {

        String funcionSeleccionada = getFuncionSeleccionada();

        switch (funcionSeleccionada) {

            case "Lineal":

                actualizarPanelEntrada(ControladorFunciones.getEntradaLineal());

                break;

            case "Cuadrática":

                actualizarPanelEntrada(ControladorFunciones.getEntradaCuadratica());
                
                break;

        }
        
        

    }

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
    private javax.swing.JComboBox<String> cboxFunciones;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JPanel panelFuncion;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

    
    private String getFuncionSeleccionada() {
        return cboxFunciones.getSelectedItem().toString();
    }

    private void cambioFuncion() {
        
        String funcionSeleccionada = getFuncionSeleccionada();

        switch (funcionSeleccionada) {

            case "Lineal":
                this.setFuncion(new FLineal());
                break;

            case "Cuadrática":
                this.setFuncion(new FCuadratica());
                break;
        }
        
    }

    private void actualizarPanelEntrada(JPanel panelNuevo) {
        this.panelEntrada.removeAll();
        this.panelEntrada.add(panelNuevo);
        this.panelEntrada.repaint();
        this.panelEntrada.revalidate();
    }
}
