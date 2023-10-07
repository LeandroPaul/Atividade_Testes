package Atividade02_EtapaN2;

import java.util.ArrayList;

public class biblioteca {
    public String nome;
    public int cnpj, anoFundacao;
    
    public ArrayList<livro> listaLivros;

    public biblioteca(){
        listaLivros = new ArrayList<>();
    }

   
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }

    public int getAnoFundacao(){
        return this.anoFundacao;
    }

    public void SetAnoFundacao(int anoFundacao){
        this.anoFundacao = anoFundacao;
    }

    public Boolean patrimonioHistorico(){
        int data = this.anoFundacao;

        if(data <= 1979){
            return true;
        }

        else{
            return false;
        }
    
    }

     // Método para consultar um livro pelo título
     public livro consultarLivro(String nome) {
        for (livro livro : listaLivros) {
            if (livro.getNome().equals(nome)) {
                return livro;
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }

    // Método para incluir um livro na biblioteca
    public void incluirLivro(livro livro) {
        listaLivros.add(livro);
    }

    // Método para remover um livro da biblioteca
    public void removerLivro(livro livro) {
        listaLivros.remove(livro);
    }

    // Método para verificar se o acervo é premium
    public boolean acervoPremium() {
        int contadorLancamentos = 0;
        for (livro livro : listaLivros) {
            if (livro.Lancamento()) {
                contadorLancamentos++;
                if (contadorLancamentos >= 5) {
                    return true;
                }
            }
        }
        return false;
    }
}

