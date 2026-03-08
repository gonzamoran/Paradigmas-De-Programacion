package ar.uba.fi.algo3.piedrapapeltijera;

public class Tijera implements Peleable {

    @Override
    public Peleable vs(Peleable peleable) {
        return peleable.vs(this);
    }

    @Override
    public Peleable vs(Tijera tijera) {
        return this;
    }

    @Override
    public Peleable vs(Papel papel) {
        return this;
    }

    @Override
    public Peleable vs(Piedra piedra) {
        return piedra;
    }

}
