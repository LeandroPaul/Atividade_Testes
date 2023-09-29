package questao_6;

import java.util.ArrayList;

public class corretor {
    public int creci;
    public String nome;
    public ArrayList<imovel> meusImoveis;

    public corretor(){

    }

    public int getCreci(){
        return this.creci;
    }

    public void setCreci( int creci){
        this.creci = creci;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void adicionaImovel (imovel e){
        this.meusImoveis.add(e);
    }

    public void removeImovel (imovel e){
        this.meusImoveis.remove(e);
    }

    public int quantidadeImoveis(){
        return this.meusImoveis.size();
    }

    public boolean vendedorEstrela(){
        int contador = 0;
        for (int i = 0; i < quantidadeImoveis(); i++){
            imovel im = meusImoveis.get(i);
            if (im.oportunidade()){
                contador++;
            }   
        }
        
        return (contador>=2);
        
    }
        

}
