package logica.funciones;

import java.util.Queue;

public class FLineal extends Funcion {

    //f(x) = mx + b ; m != 0
    private double m, b;

    public FLineal() {
        
    }

    @Override
    public double obtenerPuntoImagen(double x) {
        double y = (m * x) + b;
        return y;
    }

    public void setParams(Queue<Double> parametros){
        
        double pendiente = parametros.poll();
        double complemento = parametros.poll();
        
        if(pendiente == 0){
            this.m = 1;
        } else {
            this.m = pendiente;
        }
        
        this.b = complemento;
    }

}
