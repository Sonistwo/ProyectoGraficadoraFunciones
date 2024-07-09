package logica.funciones;

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

    public void setParams(double a, double b, double c) {
        if (a == 0) {
            this.a = 1;
        } else {
            this.a = a;
        }

        this.b = b;

        this.c = c;

    }

}
