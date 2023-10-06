package Atividade02_EtapaN2;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert.*;

public class bibliotecaTest {
     @Test
    public void Test(){
        biblioteca b = new biblioteca();

        b.setNome("Luz do amanhã");
        b.setCnpj(7012342);
        b.SetAnoFundacao(1950);

        assertEquals(true, b.patrimonioHistorico());
    }
    
}
