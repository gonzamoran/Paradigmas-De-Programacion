public class ImpuestoX extends ImpuestoReal {

    public ImpuestoX(){
        super("Impuesto X");
    }

    @Override
    public double aplicar(double precio) {
        return precio * 1.05;
    }
}
