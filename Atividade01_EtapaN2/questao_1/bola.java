// Declaração da classe Bola
public class bola{

    // Declaração de uma variável de instância privada.
    private String cor;

    // Construtor da classe que recebe um argumento 'cor'
    public bola(String cor){
        this.cor = cor;
    }

    // Método público para obter a cor da bola
    public String getCor(){
        return this.cor;
    }

    // Método público para definir uma nova cor para a bola
    public void setCor(String novaCor){
        this.cor = novaCor;
    }
}