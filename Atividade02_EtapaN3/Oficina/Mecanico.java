package Atividade02_EtapaN3.Oficina;

import java.util.List;

public class Mecanico {
    public int matricula;
    public String nome;
    public List<String> especialidades;

    public Mecanico(){
        
            
        
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula (int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public List<String> getEspecialidades(){
        return especialidades;
    }

    public void setEspecialidades(List especialidades){
        this.especialidades = especialidades;
    }

    public boolean funcionarioPremium(){

        if(especialidades.size() > 2){
            return true;
        } 
        
        else{
            return false;
        }

        
    }
        
    
        
    
}
