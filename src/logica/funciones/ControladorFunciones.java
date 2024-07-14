package logica.funciones;

import gui.Funciones.*;

import javax.swing.JPanel;

public class ControladorFunciones {
 
    public static JPanel getEntradaLineal(){
        return new FLinealIN().obtenerPanel();
    }
    
    public static JPanel getEntradaCuadratica(){
        return new FCuadraticaIN().obtenerPanel();
    }
    
}
