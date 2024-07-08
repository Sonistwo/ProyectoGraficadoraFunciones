package logica.funciones;

public class FCuadratica extends Funcion {
    
    //f(x) = ax^2 + bx + c
    double a, b, c;

    public FCuadratica(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double obtenerPuntoImagen(double x) {
        double y =  (a*x*x) + (b*x) + c;
        return y;
    }
     
}
