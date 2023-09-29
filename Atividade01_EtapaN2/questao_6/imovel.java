package questao_6;

public class imovel {
    public int codigo;
    public String tipo;
    public double tamanho;
    public double preco;

   
    public double getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public double getTamanho(){
        return this.tamanho;
    }

    public void setTamanho( double tamanho){
        this.tamanho = tamanho;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco( double preco){
        this.preco = preco;
    }


    public boolean oportunidade(){
        double valor = this.preco / this.tamanho;
        if(this.tipo == "apartamento"){
            return valor < 5000;
        }

        if(this.tipo == "casa"){
            return valor < 4000;
        }

        else{
            return false;
        }
        
    }

}
