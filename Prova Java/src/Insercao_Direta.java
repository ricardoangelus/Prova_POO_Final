import java.io.IOException;
import java.util.Arrays;

public class Insercao_Direta {
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

        insertionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor.length + " em = " + (tempoFinal - tempoInicial) + " ms");

        long tempoInicial1 = System.currentTimeMillis();

        insertionSort(vetor1);

        long tempoFinal1 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor1.length + " em = " + (tempoFinal1 - tempoInicial1) + " ms");

        long tempoInicial2 = System.currentTimeMillis();

        insertionSort(vetor2);

        long tempoFinal2 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor2.length + " em = " + (tempoFinal2 - tempoInicial2) + " ms");

        long tempoInicial3 = System.currentTimeMillis();

        insertionSort(vetor3);

        long tempoFinal3 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor3.length + " em = " + (tempoFinal3 - tempoInicial3) + " ms");

        long tempoInicial4 = System.currentTimeMillis();

        insertionSort(vetor4);

        long tempoFinal4 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor4.length + " em = " + (tempoFinal4 - tempoInicial4) + " ms");

        long tempoInicial5 = System.currentTimeMillis();

        insertionSort(vetor5);

        long tempoFinal5 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor5.length + " em = " + (tempoFinal5 - tempoInicial5) + " ms");

    }

    public static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
            {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }
    public static void insertionSort2(int[] vetor1) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor1.length; j++)
        {
            key = vetor1[j];
            for (i = j - 1; (i >= 0) && (vetor1[i] > key); i--)
            {
                vetor1[i + 1] = vetor1[i];
            }
            vetor1[i + 1] = key;
        }
    }
    public static void insertionSort3(int[] vetor2) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor2.length; j++)
        {
            key = vetor2[j];
            for (i = j - 1; (i >= 0) && (vetor2[i] > key); i--)
            {
                vetor2[i + 1] = vetor2[i];
            }
            vetor2[i + 1] = key;
        }
    }
    public static void insertionSort4(int[] vetor3) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor3.length; j++)
        {
            key = vetor3[j];
            for (i = j - 1; (i >= 0) && (vetor3[i] > key); i--)
            {
                vetor3[i + 1] = vetor3[i];
            }
            vetor3[i + 1] = key;
        }
    }    public static void insertionSort5(int[] vetor4) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor4.length; j++)
        {
            key = vetor4[j];
            for (i = j - 1; (i >= 0) && (vetor4[i] > key); i--)
            {
                vetor4[i + 1] = vetor4[i];
            }
            vetor4[i + 1] = key;
        }
    }
    public static void insertionSort6(int[] vetor5) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor5.length; j++)
        {
            key = vetor5[j];
            for (i = j - 1; (i >= 0) && (vetor5[i] > key); i--)
            {
                vetor5[i + 1] = vetor5[i];
            }
            vetor5[i + 1] = key;
        }
    }
}