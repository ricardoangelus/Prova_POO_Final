import java.io.IOException;
import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) throws IOException {

        int quantidade = 1000;
        int quantidade1 = 10000;
        int quantidade2 = 100000;
        int quantidade3 = 1000000;
        int quantidade4 = 5000000;
        int quantidade5 = 10000000;
        int[] vetor = new int[quantidade];
        int[] vetor1 = new int[quantidade1];
        int[] vetor2 = new int[quantidade2];
        int[] vetor3 = new int[quantidade3];
        int[] vetor4 = new int[quantidade4];
        int[] vetor5 = new int[quantidade5];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }

        System.out.println("Vetores de " + vetor.length + " unidades desordenados:\n" + Arrays.toString(vetor));

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = (int) (Math.random()*quantidade);
        }

        System.out.println("Vetores de " + vetor1.length + " unidades desordenados:\n" + Arrays.toString(vetor1));

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = (int) (Math.random()*quantidade);
        }

        System.out.println("Vetores de " + vetor2.length + " unidades desordenados:\n" + Arrays.toString(vetor2));

        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = (int) (Math.random()*quantidade);
        }

        System.out.println("Vetores de " + vetor3.length + " unidades desordenados:\n" + Arrays.toString(vetor3));

        for (int i = 0; i < vetor4.length; i++) {
            vetor4[i] = (int) (Math.random()*quantidade);
        }

        System.out.println("Vetores de " + vetor4.length + " unidades desordenados:\n" + Arrays.toString(vetor4));

        for (int i = 0; i < vetor5.length; i++) {
            vetor5[i] = (int) (Math.random()*quantidade);
        }

        System.out.println("Vetores de " + vetor5.length + " unidades desordenados:\n" + Arrays.toString(vetor5));

        long tempoInicial = System.currentTimeMillis();

        bubbleSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor.length + " em = " + (tempoFinal - tempoInicial) + " ms");

        long tempoInicial1 = System.currentTimeMillis();

        bubbleSort1(vetor1);

        long tempoFinal1 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor1.length + " em = " + (tempoFinal1 - tempoInicial1) + " ms");

        long tempoInicial2 = System.currentTimeMillis();

        bubbleSort2(vetor2);

        long tempoFinal2 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor2.length + " em = " + (tempoFinal2 - tempoInicial2) + " ms");

        long tempoInicial3 = System.currentTimeMillis();

        bubbleSort3(vetor3);

        long tempoFinal3 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor3.length + " em = " + (tempoFinal3 - tempoInicial3) + " ms");

        long tempoInicial4 = System.currentTimeMillis();

        bubbleSort4(vetor4);

        long tempoFinal4 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor4.length + " em = " + (tempoFinal4 - tempoInicial4) + " ms");

        long tempoInicial5 = System.currentTimeMillis();

        bubbleSort5(vetor5);

        long tempoFinal5 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor5.length + " em = " + (tempoFinal5 - tempoInicial5) + " ms");

    }
    private static void bubbleSort(int[] vetor){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
    private static void bubbleSort1(int[] vetor1){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor1.length - 1; i++) {
                if (vetor1[i] > vetor1[i + 1]) {
                    aux = vetor1[i];
                    vetor1[i] = vetor1[i + 1];
                    vetor1[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
    private static void bubbleSort2(int[] vetor2){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor2.length - 1; i++) {
                if (vetor2[i] > vetor2[i + 1]) {
                    aux = vetor2[i];
                    vetor2[i] = vetor2[i + 1];
                    vetor2[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
    private static void bubbleSort3(int[] vetor3){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor3.length - 1; i++) {
                if (vetor3[i] > vetor3[i + 1]) {
                    aux = vetor3[i];
                    vetor3[i] = vetor3[i + 1];
                    vetor3[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
    private static void bubbleSort4(int[] vetor4){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor4.length - 1; i++) {
                if (vetor4[i] > vetor4[i + 1]) {
                    aux = vetor4[i];
                    vetor4[i] = vetor4[i + 1];
                    vetor4[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
    private static void bubbleSort5(int[] vetor5){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor5.length - 1; i++) {
                if (vetor5[i] > vetor5[i + 1]) {
                    aux = vetor5[i];
                    vetor5[i] = vetor5[i + 1];
                    vetor5[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
}
