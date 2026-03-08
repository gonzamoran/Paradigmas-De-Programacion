import org.junit.Assert;
import org.junit.Test;

public class TeTest {
    @Test
    public void test01TeCon2AzucarDescripcionYPrecioCorrecto(){
        Bebida te = new Te(); //precio:15

        te = new Azucar(te); // sin precio
        te = new Azucar(te); // sin precio

        Assert.assertEquals("Té con azucar con azucar", te.getDescripcion());
        Assert.assertEquals(15, te.getPrecio());
    }
}
