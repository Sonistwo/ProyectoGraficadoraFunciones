package logica;

import javax.swing.JPanel;

import gui.Ventana;
import gui.Funciones.*;

public class Controlador {
    
    public static void correrVentanaPrincipal(){
        new Ventana().setVisible(true);
    }
    
    public static boolean verificarReal(String valor){
        
        if(valor.isEmpty()){
            valor += "0";
        }
        
        if(valor.equals("-")){
            valor += "1";
        }
        
        try{
            Double.valueOf(valor);
        } catch(NumberFormatException | NullPointerException e){
            return false;
        }
        
        return true;
        
    }
    
}
