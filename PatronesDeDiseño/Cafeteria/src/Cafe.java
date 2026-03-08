public class Cafe implements Bebida {
    @Override
    public String getDescripcion() {
        return "cafe";
    }

    @Override
    public int getPrecio() {
        return 20;
    }
}
