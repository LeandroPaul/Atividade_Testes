package questao_5;

public class prova {
    static int vetor(int n, int vet[]){
        int val;
        val = vet[0];
        for (int j = 1; j < n; j+= 1) {
            if (val < vet[j]){
                val = vet[j];
            }
        }

        return val;
    }
}
