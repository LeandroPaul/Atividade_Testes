package Atividade02_EtapaN2;

import static org.junit.Assert.*;

import org.junit.*;

public class livroTest {

    @Test
    public void TestAnoMaior2022(){

    livro l1 = new livro();

    l1.setAutor("Leandro");
    l1.setEdicao(2023);
    l1.setIsbn(01);
    l1.setNome("Java");

    assertTrue(true == l1.verficaLancamento());
    
    }

    @Test
    public void TestAnoMenor2022(){

    livro l1 = new livro();

    l1.setAutor("Leandro");
    l1.setEdicao(2021);
    l1.setIsbn(01);
    l1.setNome("Java");

    assertTrue(false == l1.verficaLancamento());
    
    }
}
