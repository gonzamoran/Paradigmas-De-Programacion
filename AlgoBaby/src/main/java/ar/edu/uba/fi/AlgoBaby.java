package ar.edu.uba.fi;

import java.util.ArrayList;

public class AlgoBaby {
    private static final double CAPACIDAD = 5;
    private static final double SOBRECALENTAMIENTO = 25;
    private ArrayList<Modulo> modulos;

    public AlgoBaby() {

        this.modulos = new ArrayList<>();
    }
    public void armar(Modulo modulo) {
        verificarCarga(modulo);
        this.modulos.add(modulo);
    }

    private void verificarCarga(Modulo modulo) {
        double acumulado = modulo.cantidad(this.modulos);

        if ( acumulado > CAPACIDAD) {
            throw new AlgoBabyFull();
        }
    }

    public double costo() {
        double result = 0;

        for (Modulo s : this.modulos) {
            result = s.costo(result);
        }

        return result;
    }

    public Double procesamiento() {
        double result = 0;

        for (Modulo s : this.modulos) {
            result = s.procesamiento(result);
        }

        if (result > SOBRECALENTAMIENTO) {
            throw new Sobrecalentamiento();
        }

        return result;
    }

}
