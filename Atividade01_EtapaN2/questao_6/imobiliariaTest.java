package questao_6;

import static org.junit.Assert.assertTrue;

import org.junit.*;
//import static org.junit.Assert.*;


public class imobiliariaTest {
    @Test
    public void imTest(){

        imovel imovel1 = new imovel();

        imovel1.setCodigo(120);
        imovel1.setPreco(120000);
        imovel1.setTamanho(20);
        imovel1.setTipo("apartamento");

        imovel imovel2 = new imovel();

        imovel2.setCodigo(102);
        imovel2.setPreco(12000);
        imovel2.setTamanho(10);
        imovel2.setTipo("casa");

        corretor corretor1 = new corretor();

        corretor1.setCreci(6786);
        corretor1.setNome("Alvaro");
        

        corretor corretor2 = new corretor();

        corretor2.setCreci(1234);
        corretor2.setNome("Mendes");

        assertTrue(imovel1.getTipo(), imovel1.oportunidade());

    }
    

}
