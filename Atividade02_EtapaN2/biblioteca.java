package Atividade02_EtapaN2;

public class biblioteca {
    public String nome;
    public int cnpj, anoFundacao;

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
}
