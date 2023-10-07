package questao_3;

import org.junit.*;


public class trianguloTest {
    @Test
    public void trianguloIsoscelesValido() {
        triangulo t = new triangulo();

        t.setL1(2);
        t.setL2(10);
        t.setL3(10);

        Assert.assertTrue("Isosceles" == t.tipoDeTriangulo());
    }

    @Test
    public void trianguloEscalenoValido() {
        triangulo t = new triangulo();

        t.setL1(7);
        t.setL2(1);
        t.setL3(3);

        Assert.assertTrue("Escaleno" == t.tipoDeTriangulo());
    }

    @Test
    public void trianguloEquilateroValido() {
        triangulo t = new triangulo();

        t.setL1(10);
        t.setL2(10);
        t.setL3(10);

        Assert.assertTrue("Equilatero" == t.tipoDeTriangulo());
    }

    @Test
    public void trianguloLadoComValorZero() {
        triangulo t = new triangulo();

        t.setL1(12);
        t.setL2(0);
        t.setL3(6);

        Assert.assertEquals("Zero", t.tipoDeTriangulo());
    }

    @Test
    public void trianguloLadoComValorNegativo() {
        triangulo t = new triangulo();

        t.setL1(12);
        t.setL2(-6);
        t.setL3(6);

        Assert.assertEquals("Negativo", t.tipoDeTriangulo());
    }

     @Test
    public void somaLaterais() {
        triangulo t = new triangulo();

        t.setL1(12);
        t.setL2(6);
        t.setL3(6);

        Assert.assertEquals("Soma lado2 + lado3", t.somaDosLados());

        t.setL1(3);
        t.setL2(6);
        t.setL3(3);

        Assert.assertEquals("Soma lado1 + lado3", t.somaDosLados());

        t.setL1(3);
        t.setL2(6);
        t.setL3(9);

        Assert.assertEquals("Soma lado1 + lado2", t.somaDosLados());
        Assert.assertTrue(18 == t.calculaPerimetro());
    }

}
