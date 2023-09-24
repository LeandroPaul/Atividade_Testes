package questao_4;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculo {
    @Test
    public void testCalculo(){
        System.out.print("Calculo");
        double x = 10.0;
        double y = 8.0;
        double z = 1.0;
        teste instance = new teste();
        double e = 18.0;
        double r = instance.calculo(x,y,z);
        assertEquals(e, r, 0.0);
    }
}
