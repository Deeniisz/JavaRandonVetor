import java.util.Random;

public class JavaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Random random = new Random(System.currentTimeMillis());
        
        // Define a variável para contagem de trocas
        int trocas = 0;
        
        //Define o tamanho do vetor a ser inicializado
        int tamanho = 10;
        
        //Declara um vetor com 10 posições para números inteiros
        int vetor[] = new int[tamanho];
        
        //Define a variável de controle do laço para popular o vetor
        int cont;
        
        System.out.println("Vetor desordenado:");
        
        //Popula o vetor com valores gerados aleatoriamente
        for(cont = 0; cont < tamanho; cont++)
        {
            // Gera o número aleatório e o armazena em temp
            int temp = random.nextInt() % 10000;
            
            // Se o valor gerado for negativo, converte a positivo
            if (temp < 0) temp = temp * (-1);
            
            // Armazena o valor positivo no vetor
            vetor[cont] = temp;
            
            // Mostra o valor gerado e desordenado
            System.out.print(vetor[cont] + " ");
        }
        System.out.println();
        System.out.println();
 
        // Bubblesort
        // Percorre o vetor, da primeira à penultima posição
        for(int i=0; i < vetor.length; i++){
            
            for(int j=0; j < vetor.length -1 ; j++){
                if(vetor[j] > vetor[j+1]){
                    trocas++;
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado com "+ trocas +" trocas:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }

        int menor = 0, maior = 0;

        for(int i = 0; i < vetor.length; i++){
            if (i == 0)
            {
                menor = vetor[i];
                maior = vetor[i];
            }
            else
            {
                if(vetor[i] < menor)
                {
                    menor = vetor[i];
                }
                if(vetor[i] > maior)
                {
                    maior = vetor[i];
                }
                
            }
            
        }

        System.out.println("\n\nO menor valor é:" + menor);
        System.out.println("O maior valor é:" + maior);
        
    }
}