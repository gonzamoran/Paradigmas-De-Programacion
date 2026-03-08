public abstract class ImpuestoReal implements Impuesto{
    protected String descripcion;

    public  ImpuestoReal(){}

    public ImpuestoReal(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }
}
