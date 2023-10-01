package Atividade02_EtapaN2;

public class livro {
    public String nome, autor;
    public int edicao, isbn;
    

    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getAutor(){
        return this.nome;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getEdicao(){
        return this.edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

    public int getIsbn(){
        return this.isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public Boolean verficaLancamento(){
        int data = this.edicao;

        if(data > 2022){
            return true;
        }
        
        else{
            return false;
        }
    }
    


}
