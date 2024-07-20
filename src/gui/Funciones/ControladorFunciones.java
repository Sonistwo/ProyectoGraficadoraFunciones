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

                switch(valor.toUpperCase()){
                    
                    case "" -> valor += "0";
                    case "-" -> valor += "1";
                    case "E" -> valor = ControladorFunciones.E;
                    case "PI" -> valor = ControladorFunciones.PI;
                    
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

    public static JPanel getEntradaPanel(String funcion) {

        JPanel panel = null;

        switch (funcion) {

            case "Lineal" ->
                panel = new FLineal().obtenerPanel();
            case "Cuadrática" ->
                panel = new FCuadratica().obtenerPanel();
            case "Cúbica" ->
                panel = new FCubica().obtenerPanel();
            case "Polinomial" ->
                panel = new FPolinomial().obtenerPanel();

        }

        return panel;

    }

    public static void setFuncion(String funcion) {

        switch (funcion) {

            case "Lineal" ->
                Ventana.setFuncion(new FLineal());
            case "Cuadrática" ->
                Ventana.setFuncion(new FCuadratica());
            case "Cúbica" ->
                Ventana.setFuncion(new FCubica());
            case "Polinomial" ->
                Ventana.setFuncion(new FPolinomial());

        }

    }

    public static void cambiarParametros(Queue<Double> parametros, String funcion) {

        IFuncion f = Ventana.getFuncion();

        f.setParams(parametros);

    }

}
