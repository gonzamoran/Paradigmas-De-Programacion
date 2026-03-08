public class ImpuestoNull implements Impuesto {
    @Override
    public String getDescripcion() {
        return "";
    }

    @Override
    public double aplicar(double precio) {
        return precio;
    }
}
