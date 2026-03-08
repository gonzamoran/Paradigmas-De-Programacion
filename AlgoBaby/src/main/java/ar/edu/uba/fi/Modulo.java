package ar.edu.uba.fi;

import java.util.ArrayList;

public abstract class Modulo {
    protected int cantidad;
    private int costoPorCantidad;

    public Modulo(int cantidad, int costoPorCantidad) {

        this.cantidad = cantidad;
        this.costoPorCantidad = costoPorCantidad;
    }

    public double costo(double acumulador) {
        return acumulador + (cantidad * costoPorCantidad);
    }

    public abstract double procesamiento(double acumulador);

    public double cantidad(ArrayList<Modulo> modulos) {
        double result = this.cantidad;

        for(Modulo m : modulos) {
            result = result + m.cantidad;
        }

        return result;
    }
}
