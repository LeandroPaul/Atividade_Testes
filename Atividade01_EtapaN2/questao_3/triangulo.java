package questao_3;

public class triangulo {

    private double l1 = 0;
    private double l2 = 0;
    private double l3 = 0;

    

    public double getL1(){
        return this.l1;
    }

    public void setL1(double l1){
        this.l1 = l1;
    }

    public double getL2(){
        return this.l2;
    }

    public void setL2(double l2){
        this.l2 = l2;
    }

    public double getL3(){
        return this.l3;
    }

    public void setL3(double l3){
        this.l3 = l3;
    }

    public String tipoDeTriangulo(){
       
        if (l1==l2 && l2==l3){
            return "Equilatero";
        } 
        
        else if(l1>0 && l2>0 && l3>0 && l1!=l2 && l2!=l3){
            return "Escaleno";
        }

        else if (l1 == 0 || l2==0 || l3==0 ) {
            return "Zero";
        }

        else if (l1 < 0 || l2 < 0 || l3 < 0 ) {
            return "Negativo";
        }

        else{
            return "Isosceles";
        }
    }

    
    double lado2 = l1+l3;

    public String somaDosLados(){
        
        if(l2 + l3 == l1){
            return "Soma lado2 + lado3";
        }
        else if(l1 + l3 == l2){
            return "Soma lado1 + lado3";
        }
        else{
            return "Soma lado1 + lado2";
        }
    }

    

}
