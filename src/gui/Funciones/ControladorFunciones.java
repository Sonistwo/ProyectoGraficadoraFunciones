package gui.Funciones;

import gui.Ventana;

import java.awt.Color;
import java.awt.Component;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.BorderFactory;

import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.Controlador;

public class ControladorFunciones {
    
    public static final String E = "2.7182818";
    public static final String PI = "3.14159265";
            
    public static Queue<Double> obtenerEntradas() {

        boolean valido = true;

        Queue<Double> parametros = new LinkedList<>();

        JPanel panelActual = (JPanel) Ventana.panelEntrada.getComponents()[0];
        Component[] componentes = panelActual.getComponents();

        for (Component c : componentes) {

            if (c instanceof JTextField campo) {

                String valor = campo.getText();
                valor = valor.replace(",", ".");

                if (valor.isEmpty()) {
                    valor = "0";
                } else if (valor.equals("-")) {
                    valor += "1";
                }

                if (!Controlador.verificarReal(valor)) {
                    campo.setBorder(BorderFactory.createLineBorder(Color.RED));
                    valido = false;
                } else {
                    Double parametro = Double.valueOf(valor);
                    parametros.add(parametro);

                }
            }

        }

        if (!valido) {
            return null;
        }
        return parametros;

    }

    public static JPanel getEntradaLineal() {
        return new FLineal().obtenerPanel();
    }

    public static JPanel getEntradaCuadratica() {
        return new FCuadratica().obtenerPanel();
    }
    
    public static JPanel getEntradaCubica(){
        return new FCubica().obtenerPanel();
    }
    
    public static JPanel getEntradaPolinomial(){
        return new FPolinomial().obtenerPanel();
    }

}
