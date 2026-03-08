package ar.edu.uba.fi;

public class Avanzado extends Modulo {

    public Avanzado(int cantidad) {

        super(cantidad, 1200);
    }

    @Override
    public double procesamiento(double acumulador) {

        return acumulador + 10 + (cantidad * 2);
    }
}
