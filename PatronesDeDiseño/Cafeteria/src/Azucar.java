public class Azucar extends AdicionalBebida {
    public Azucar(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return this.bebida.getDescripcion() + " con azucar";
    }

    @Override
    public int getPrecio() {
        return this.bebida.getPrecio();
    }
}
