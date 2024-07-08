package logica;

import logica.funciones.Funcion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;


import javax.swing.JPanel;

public class Plano {

    private final JPanel panel;

    private final int ancho;
    private final int alto;

    private double paso = 0.2;

    private int tamanoPunto = 8;
    private int escalado = 20;

    private Funcion f;

    public static final int ESCALA_MIN = 5;
    public static final int ESCALA_PASO = 5;
    public static final int ESCALA_MAX = 60;

    private static final int PUNTOS_MAX = 20;

    public Plano(JPanel p) {
        panel = p;
        ancho = p.getWidth();
        alto = p.getHeight();
    }

    public void dibujarPlano() {

        Graphics2D g = (Graphics2D) panel.getGraphics();

        dibujarLineas(g);

        g.setColor(Color.RED);
        g.drawLine(ancho / 2, 0, ancho / 2, alto);
        g.drawLine(0, alto / 2, ancho, alto / 2);

        BasicStroke borde = new BasicStroke(3);
        g.setColor(Color.BLACK);
        g.setStroke(borde);
        g.drawRect(0, 0, ancho - 1, alto - 1);
        borde = new BasicStroke(1);
        g.setStroke(borde);

    }

    public void repintarPlano() {

        Graphics2D g = (Graphics2D) panel.getGraphics();

        g.clearRect(0, 0, alto, ancho + 2);
        dibujarPlano();

    }

    private void dibujarLineas(Graphics g) {

        int x = ancho / 2;
        int y = alto / 2;

        for (int i = ancho / 2; i < ancho; i += escalado) {
            g.drawLine(i, 0, i, alto);
            g.drawLine(x, 0, x, alto);
            x -= escalado;
        }

        for (int j = alto / 2; j < alto; j += escalado) {
            g.drawLine(0, j, ancho, j);
            g.drawLine(0, y, ancho, y);
            y -= escalado;
        }

    }

    public void dibujarFuncion(Funcion f) {

        int ajusteAlPunto = tamanoPunto / 2;
        int ajusteGraficoX = ancho / 2;
        int ajusteGraficoY = alto / 2;

        Graphics2D g = (Graphics2D) panel.getGraphics();

        for (double x = -(PUNTOS_MAX); x < PUNTOS_MAX; x += paso) {

            double y = f.obtenerPuntoImagen(x);

            int puntoX = (int) (ajusteGraficoX + x * escalado) - ajusteAlPunto;
            int puntoY = (int) (ajusteGraficoY - y * escalado) - ajusteAlPunto;

            g.fillOval(puntoX, puntoY, tamanoPunto, tamanoPunto);

        }

    }

    public void setEscala(int escala) {
        this.escalado = escala;
    }

    public int getEscala() {
        return this.escalado;
    }

    public void setTamanoPunto(int diametro) {
        this.tamanoPunto = diametro;
    }

    public void setPaso(double paso) {
        this.paso = paso;
    }

    public void setFuncion(Funcion f) {
        this.f = f;
    }

}
