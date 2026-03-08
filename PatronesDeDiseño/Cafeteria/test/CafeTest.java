import org.junit.Assert;
import org.junit.Test;

public class CafeTest {
    @Test
    public void test01CafeRegularPrecioYDescripciónCorrecto(){
        Bebida cafe = new Cafe(); //precio:20

        Assert.assertEquals("cafe", cafe.getDescripcion());
        Assert.assertEquals(20, cafe.getPrecio());
    }

   @Test
    public void test02CafeConLechePrecioYDescripcionCorrecto(){
        Bebida cafe = new Cafe(); //precio:20

        cafe = new Leche(cafe); //precio:10

        Assert.assertEquals("cafe con leche", cafe.getDescripcion());
        Assert.assertEquals(30, cafe.getPrecio());
    }

    @Test
    public void test03CafeConLecheYUnoAzucarPrecioYDescripcionCorrecto(){
        Bebida cafe = new Cafe();//precio:20

        cafe = new Leche(cafe);//precio:10
        cafe = new Azucar(cafe);//sin costo

        Assert.assertEquals("cafe con leche con azucar", cafe.getDescripcion());
        Assert.assertEquals(30, cafe.getPrecio());
    }
}
