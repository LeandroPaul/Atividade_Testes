package questao_2;

public class calculadora{

    //Atributo
    private int resultado=0;

    //Método somar
    public double somar(int a, int b){
        resultado=a+b;
        return resultado;
    }

    //Método subtrair
    public double subtrair(int a, int b){
        resultado=a-b;
        return resultado;
    }

    //Método multiplicar 
    public double multiplicar(int a, int b){
        resultado=a*b;
        return resultado;
    }

    //Método dividir
    public double dividir(int a, int b){
        resultado=a/b;
        return resultado;
    }
}