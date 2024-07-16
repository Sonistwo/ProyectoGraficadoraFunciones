package logica.funciones;

import java.util.Queue;

public class FCuadratica extends Funcion {

    //f(x) = ax^2 + bx + c ; a != 0
    double a, b, c;

    public FCuadratica() {

    }

    @Override
    public double obtenerPuntoImagen(double x) {
        double y = (a * x * x) + (b * x) + c;
        return y;
    }

    public void setParams(Queue<Double> parametros) {
        
        double aCoef = parametros.poll();
        double bCoef = parametros.poll();
        double cCons = parametros.poll();
        
        if (aCoef == 0) {
            this.a = 1;
        } else {
            this.a = aCoef;
        }

        this.b = bCoef;

        this.c = cCons;

    }

}
