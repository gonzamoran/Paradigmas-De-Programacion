public class ImpuestoY extends ImpuestoReal {

    public ImpuestoY(){
        super("Impuesto Y");
    }

    @Override
    public double aplicar(double precio) {
        return precio * 1.10;
    }
}
