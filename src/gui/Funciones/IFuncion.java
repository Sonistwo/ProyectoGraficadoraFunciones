package gui.Funciones;

import java.util.Queue;

public interface IFuncion {
    
    public abstract double obtenerPuntoImagen(double x);
    
    public abstract void setParams(Queue<Double> parametros);
    
}
