package logica;

import javax.swing.JPanel;

import java.awt.Dimension;

import gui.Ventana;
import gui.Funciones.*;

public class Controlador {
    
    public static final Dimension DIMENSION_PANEL_ENTRADA = new Dimension(300, 116);
    
    public static void correrVentanaPrincipal(){
        new Ventana().setVisible(true);
    }
    
    public static JPanel getEntradaLineal(){
        return new FLinealIN().obtenerPanel();
    }
    
    public static JPanel getEntradaCuadratica(){
        return new FCuadraticaIN().obtenerPanel();
    }
    
}
