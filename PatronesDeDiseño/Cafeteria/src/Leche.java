public class Leche extends AdicionalBebida {
    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return this.bebida.getDescripcion() + " con leche";
    }

    @Override
    public int getPrecio() {
        return this.bebida.getPrecio() + 10;
    }
}
