

// Importação do pacote junit para usar as anotações e classes de teste
import org.junit.*;

// Importação statica do método 'assertTrue' para evitar usar 'Assert.assertTrue'.
import static org.junit.Assert.*;

// Declaração da classe construtor
public class bolaTest {

    // Anotação para indicar que o método, é um método de teste
    @Test

    // Declaração do método
    public void testCorDaBola(){
        // Instância do objeto b da classe Bola com a cor "amarelo".
        bola b = new bola("amarelo");

        // Verifica se a cor inicial é "amarelo".
        Assert.assertTrue("amarelo" ==b.getCor());

        // Muda a cor para "verde" e verifica novamente.
        b.setCor("verde");
        assertTrue("verde"==b.getCor());
    }
}