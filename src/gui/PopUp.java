package gui;

import javax.swing.JOptionPane;

public class PopUp {
    
    public static void mensajeNormal(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
    }
    
    public static void mensajeInfo(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void mensajeAdvertencia(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }
    
    public static void mensajeError(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean opcionOKCANCELAR(String pregunta, String titulo){
        int opcionSeleccionada = JOptionPane.showConfirmDialog(null, pregunta, titulo, JOptionPane.OK_CANCEL_OPTION);
        
        return opcionSeleccionada == JOptionPane.OK_OPTION;
        
    }
    
}
