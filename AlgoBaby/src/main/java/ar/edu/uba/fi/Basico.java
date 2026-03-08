package ar.edu.uba.fi;

public class Basico extends Modulo {

    public static final int VALOR = 2;

    public Basico(int cantidad) {
        super(cantidad, 500);
    }

    @Override
    public double procesamiento(double acumulador) {

        return acumulador + cantidad * VALOR;
    }
}
