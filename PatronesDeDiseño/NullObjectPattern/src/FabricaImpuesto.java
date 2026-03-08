import java.util.HashMap;
import java.util.Map;

public class FabricaImpuesto {

    static Map<String, Impuesto> impuestos =  new HashMap<>();

    static {
        impuestos.put("X", new ImpuestoX());
        impuestos.put("Y", new ImpuestoY());
    }

    public static Impuesto ObtenerImpuesto(String tipo){

        if (impuestos.containsKey(tipo))
            return impuestos.get(tipo);

//        return null;
        return new ImpuestoNull();
    }
}
