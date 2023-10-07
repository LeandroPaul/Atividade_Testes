package Atividade02_EtapaN2;

import static org.junit.Assert.*;

import org.junit.Test;

public class bibliotecaTest {
    @Test
    public void testTrue(){
        biblioteca biblioteca = new biblioteca();

        biblioteca.setCnpj(154234000);
        biblioteca.setNome("luz do amanhã");
        biblioteca.SetAnoFundacao(1979);

        assertEquals(true,biblioteca.patrimonioHistorico());

    }

    @Test
    public void testFalse(){
        biblioteca biblioteca = new biblioteca();

        biblioteca.setCnpj(154234000);
        biblioteca.setNome("luz do amanhã");
        biblioteca.SetAnoFundacao(1980);

        assertEquals(false,biblioteca.patrimonioHistorico());

    }

    @Test
    public void setUp() {
        biblioteca biblioteca = new biblioteca();
        livro livro1 = new livro();
        livro livro2 = new livro();
        livro livro3 = new livro();
        livro livro4 = new livro();
        livro livro5 = new livro();
        livro livro6 = new livro();


        livro1.setNome("Livro 1");
        livro1.setLancamento(true);
        livro2.setNome("Livro 2");
        livro2.setLancamento(true);
        livro3.setNome("Livro 3");
        livro3.setLancamento(false);
        livro4.setNome("Livro 4");
        livro4.setLancamento(false);
        livro5.setNome("Livro 5");
        livro5.setLancamento(true);
        livro6.setNome("Livro 6");
        livro6.setLancamento(true);
        
        

        biblioteca.incluirLivro(livro1);
        biblioteca.incluirLivro(livro2);
        biblioteca.incluirLivro(livro3);
        biblioteca.incluirLivro(livro4);
        biblioteca.incluirLivro(livro5);
    }

    @Test
    public void testConsultarLivro() {
        assertEquals(livro1.getNome(), biblioteca.consultarLivro("Livro 1"));
        assertEquals(livro4, biblioteca.consultarLivro("Livro 4"));
        assertNull(biblioteca.consultarLivro("Livro Inexistente"));
    }

    @Test
    public void testIncluirLivro() {
        biblioteca.incluirLivro(livro6);
        assertNotNull(biblioteca.consultarLivro("Livro 6"));
    }

    @Test
    public void testRemoverLivro() {
        biblioteca.removerLivro(livro2);
        assertNull(biblioteca.consultarLivro("Livro 2"));
    }

    @Test
    public void testAcervoPremium() {
        assertTrue(biblioteca.acervoPremium());
        biblioteca.incluirLivro(livro6);
        assertFalse(biblioteca.acervoPremium());
    }
}

