import java.io.IOException;
import java.util.Arrays;

public class Shake_Sort {
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

        shakeSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor.length + " em = " + (tempoFinal - tempoInicial) + " ms");

        long tempoInicial1 = System.currentTimeMillis();

        shakeSort1(vetor1);

        long tempoFinal1 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor1.length + " em = " + (tempoFinal1 - tempoInicial1) + " ms");

        long tempoInicial2 = System.currentTimeMillis();

        shakeSort2(vetor2);

        long tempoFinal2 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor2.length + " em = " + (tempoFinal2 - tempoInicial2) + " ms");

        long tempoInicial3 = System.currentTimeMillis();

        shakeSort3(vetor3);

        long tempoFinal3 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor3.length + " em = " + (tempoFinal3 - tempoInicial3) + " ms");

        long tempoInicial4 = System.currentTimeMillis();

        shakeSort4(vetor4);

        long tempoFinal4 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor4.length + " em = " + (tempoFinal4 - tempoInicial4) + " ms");

        long tempoInicial5 = System.currentTimeMillis();

        shakeSort5(vetor5);

        long tempoFinal5 = System.currentTimeMillis();

        System.out.println("Executada a ordenação de " + vetor5.length + " em = " + (tempoFinal5 - tempoInicial5) + " ms");

    }
    public static void shakeSort(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    public static void shakeSort1(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    public static void shakeSort2(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    public static void shakeSort3(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    public static void shakeSort4(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    public static void shakeSort5(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
