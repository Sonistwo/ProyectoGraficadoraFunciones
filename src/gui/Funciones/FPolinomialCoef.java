package gui.Funciones;

import gui.PopUp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.table.DefaultTableModel;

import logica.Controlador;

public class FPolinomialCoef extends javax.swing.JFrame {

    private int potenciaActual = 0;
    private final int columnaCoef = 1;
    
    private static boolean primeraVez = true;

    public static Queue<Double> coeficientes;

    public FPolinomialCoef() {
        initComponents();
        iniciarTabla();
        this.setLocationRelativeTo(null);
        
        if(primeraVez){
            PopUp.mensajeInfo("Procure presionar ENTER para guardar el valor", "Info");
            primeraVez = false;
        }
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                FPolinomial.coeficientes = getParametros();
            }
        });

    }

    private void iniciarTabla() {
        DefaultTableModel mt = (DefaultTableModel) tablaCoef.getModel();
        Object[] datoInicial = {potenciaActual, null};
        mt.addRow(datoInicial);
        potenciaActual++;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTabla = new javax.swing.JScrollPane();
        tablaCoef = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnReducir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Coeficientes de potencias");
        setResizable(false);

        tablaCoef.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaCoef.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Potencia", "Coeficiente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCoef.getTableHeader().setReorderingAllowed(false);
        panelTabla.setViewportView(tablaCoef);
        if (tablaCoef.getColumnModel().getColumnCount() > 0) {
            tablaCoef.getColumnModel().getColumn(0).setResizable(false);
            tablaCoef.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COEFICIENTES");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnReducir.setText("REDUCIR");
        btnReducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReducirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnReducir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(63, 63, 63))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnReducir))
                .addGap(10, 10, 10))
        );

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnAceptar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (potenciaActual >= Integer.MAX_VALUE) {
            PopUp.mensajeError("Se ha llegado al mayor número de potencia posible", "Exagerado");
            return;
        }

        DefaultTableModel mt = (DefaultTableModel) tablaCoef.getModel();
        Object[] datos = {potenciaActual, null};
        mt.addRow(datos);

        potenciaActual++;

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnReducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReducirActionPerformed

        if (potenciaActual == 0) {
            PopUp.mensajeAdvertencia("No hay ninguna potencia para reducir", "Potencias");
            return;
        }

        DefaultTableModel mt = (DefaultTableModel) tablaCoef.getModel();

        mt.removeRow(potenciaActual - 1);

        potenciaActual--;

    }//GEN-LAST:event_btnReducirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        FPolinomial.coeficientes = getParametros();
        this.dispose();

    }//GEN-LAST:event_btnAceptarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FPolinomialCoef().setVisible(true);
        });
    }

    public Queue<Double> getParametros() {

        Queue<Double> parametros = new LinkedList<>();
        DefaultTableModel mt = (DefaultTableModel) tablaCoef.getModel();

        for (int i = 0; i < potenciaActual; i++) {

            Double parametro;

            try {
                parametro = Double.valueOf(mt.getValueAt(i, columnaCoef).toString());
            } catch (NumberFormatException | NullPointerException e) {
                parametro = Double.valueOf("1");
            }

            if (i == potenciaActual && mt.getValueAt(potenciaActual - 1, columnaCoef).equals(0)) {
                parametros.add(Double.valueOf("1"));
            }

            parametros.add(parametro);
        }

        return parametros;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnReducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JTable tablaCoef;
    // End of variables declaration//GEN-END:variables
}
