package questao_5;

import org.junit.*;
import static org.junit.Assert.*;

public class testVetor {
    @Test
    public void testVetor(){
        int[]  vet = {89,90,84,91};
        int r = prova.vetor(vet.length, vet);
        assertEquals(91,r);
    }   
}
