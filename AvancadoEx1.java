import java.util.Scanner;

public class AvancadoEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o tamanho do vetor? ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o valor da posição %d: ", i);
            vetor[i] = sc.nextInt();
        }

        int[] vetorPar = new int[tamanho];
        int[] vetorImpar = new int[tamanho];
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) {
                vetorPar[contadorPar] = vetor[i];
                contadorPar++;
            } else {
                vetorImpar[contadorImpar] = vetor[i];
                contadorImpar++;
            }
        }

        System.out.println("Vetor de pares:");
        for (int i = 0; i < contadorPar; i++) {
            System.out.println(vetorPar[i]);
        }

        System.out.println("Vetor de ímpares:");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.println(vetorImpar[i]);
        }

        sc.close();
    }
}