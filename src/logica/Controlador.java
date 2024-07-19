package logica;

import javax.swing.JPanel;

import gui.Ventana;
import gui.Funciones.*;

public class Controlador {
    
    public static void correrVentanaPrincipal(){
        new Ventana().setVisible(true);
    }
    
    public static boolean verificarReal(String valor){
        
        switch(valor.toUpperCase()){
            
            case "" -> valor += "0";
            case "-" -> valor += "1";
            case "E" -> valor = ControladorFunciones.E;
            case "PI" -> valor = ControladorFunciones.PI;
            
        }
        
        try{
            Double.valueOf(valor);
        } catch(NumberFormatException | NullPointerException e){
            return false;
        }
        
        return true;
        
    }
    
    public static String mensajeInfo(){
        
        String mensaje = 
                "Seleccione de la lista la funcion que desea graficar.\n" +
                "Llene con números los coeficientes para graficar correctamente la funcion deseada.\n" +
                "Puede usar constantes como la constante de Euler o Pi, tipando \"E\" o \"PI\" en los recuadros\n" +
                "el programa interpretará estas entradas. (Sólamente debe ser E o PI, cualquier otra combinación con numeros no será leída\n" + 
                "en dado caso de necesitar, coloque la mejor aproximación posible del producto que desea ingresar por estas constantes).\n\n" +
                "Mil gracias por ver este pequeño proyecto ^.^\n" +
                "SonistwoLovesSumi.";
        
        return mensaje;
        
    }
    
}
