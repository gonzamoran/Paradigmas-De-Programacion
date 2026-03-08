package ar.edu.uba.fi;

public class Intermedio extends Modulo {

    public Intermedio(int cantidad) {

        super(cantidad, 800);
    }

    @Override
    public double procesamiento(double acumulador) {
        return acumulador + (Math.pow(cantidad, 2));
    }
}
