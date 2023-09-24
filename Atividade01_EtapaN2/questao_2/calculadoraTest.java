// Declaração do pacote onde a classe está localizada.
package questao_2; 

// Importação do pacote JUnit para usar suas anotações e classes de teste.
import org.junit.*;

// Importação statica do método 'assertEquals' para evitar usar 'Assert.assertEquals'.
import static org.junit.Assert.*;

// Declaração da classe construtor
public class calculadoraTest { 

    // Anotação indicando que o método a seguir é um método de teste.
    @Test 

    // Declaração do método de teste, que tem o mesmo nome da classe (construtor).
    public void calculadoraTest(){ 

        // Instanciação de um objeto da classe Calculadora.
        calculadora c = new calculadora(); 

        // verifica se a soma de 5 e 10 é igual a 15.
        assertEquals(15, c.somar(10, 5),0.0);
        
        // Verifica se a divisão de 18 por 2 é igual a 9.
        assertEquals(9, c.dividir(18, 2),0.0);
        
        // verifica se a subtração de 20 por 7 é igual a 13.
        assertEquals(13, c.subtrair(20, 7), 0.0);
        
        // verifica se a multiplicação de 9 por 9 é igual a 81.
        assertEquals(81, c.multiplicar(9,9),0.0); 
    }
}
