/*@class AdicionalBebida
* Clase abstracta, se usa para contener el objeto a decorar
* para que todos los decoradores puedan acceder al mismo.
* Los decoradores deben extender esta clase.
* */
public abstract class AdicionalBebida implements Bebida {
    protected Bebida bebida;
}

