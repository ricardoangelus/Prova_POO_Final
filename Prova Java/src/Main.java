import java.util.*;

public class Main {
    public static void main(String[] args) {

        long tempoInicial1 = System.currentTimeMillis();

        List<Integer> v = new ArrayList<>();
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        List<Integer> v3 = new ArrayList<>();
        List<Integer> v4 = new ArrayList<>();
        List<Integer> v5 = new ArrayList<>();

//******************************************************************************************************************************************//
        // Processo de Desordenação do Vetor
        //long start2 = System.nanoTime();
        for (int i = 0; i <= 1000; i++) {
            v.add(i);
            Collections.shuffle(v);
        }
        for (int i = 0; i <= 10000; i++) {
            v1.add(i);
            Collections.shuffle(v1);
        }
        for (int i = 0; i <= 100000; i++) {
            v2.add(i);
            Collections.shuffle(v2);
        }
        for (int i = 0; i <= 1000000; i++) {
            v3.add(i);
            Collections.shuffle(v3);
        }
        for (int i = 0; i <= 5000000; i++) {
            v4.add(i);
            Collections.shuffle(v4);
        }
        for (int i = 0; i <= 10000000; i++) {
            v5.add(i);
            Collections.shuffle(v5);
        }

        //System.out.println("Vetores Desordenados: " + v); // Impressão dos números embaralhados

        //long end2 = System.nanoTime();
        //long resultado2 = end2 - start2;

        // 1 segundo é igual a 1_000_000_000
        //double cpu_time_used2 = (double)(resultado2) / 1e+9;
        //System.out.println("Quantidade de Itens: " + (v.toArray().length - 1) + " -----> Tempo de uso da CPU: " + cpu_time_used2 + " segundos\n");
        //System.out.println("O tamanho do vetor é: " + v.toArray().length); //Verificação do tamanho do vetor

        //System.out.println(v.get(2)); //Impressão da posíção do item no vetor
//**************************************************************************************************************//
        System.out.println("######## Ordenação: Inserção Direta 1000 ########");
        long tempoInicial2 = System.currentTimeMillis();

        int j;
        int key;
        int i;
        System.out.println("Vetores Desordenados: " + v);
        for (j = 1; j < v.toArray().length; j++)
        {
            key = v.get(j);
            for (i = j - 1; (i >= 0) && (v.get(i) > key); i--)
            {
                v.set(i + 1, v.get(i));
            }
            v.set(i + 1, key);
            }

        System.out.println("Vetores Ordenados: " + v);
        long tempoFinal2 = System.currentTimeMillis();


        System.out.println("Quantidade de Itens: " + (v.toArray().length - 1) + " -----> Tempo de uso da CPU: " + (tempoFinal2 - tempoInicial2) + " ms\n");
////****************************************************************************************************************
        System.out.println("######## Ordenação: Inserção Direta 10000 ########");
        long tempoInicial3 = System.currentTimeMillis();

        System.out.println("Vetores Desordenados: " + v1);
        for (j = 1; j < v1.toArray().length; j++)
        {
            key = v1.get(j);
            for (i = j - 1; (i >= 0) && (v1.get(i) > key); i--)
            {
                v1.set(i + 1, v1.get(i));
            }
            v1.set(i + 1, key);
        }

        System.out.println("Vetores Ordenados: " + v1);
        long tempoFinal3 = System.currentTimeMillis();


        System.out.println("Quantidade de Itens: " + (v1.toArray().length - 1) + " -----> Tempo de uso da CPU: " + (tempoFinal3 - tempoInicial3) + " ms\n");
////****************************************************************************************************************
        System.out.println("######## Ordenação: Inserção Direta 100000 ########");
        long tempoInicial4 = System.currentTimeMillis();

        System.out.println("Vetores Desordenados: " + v2);
        for (j = 1; j < v2.toArray().length; j++)
        {
            key = v2.get(j);
            for (i = j - 1; (i >= 0) && (v2.get(i) > key); i--)
            {
                v2.set(i + 1, v2.get(i));
            }
            v2.set(i + 1, key);
        }

        System.out.println("Vetores Ordenados: " + v2);
        long tempoFinal4 = System.currentTimeMillis();


        System.out.println("Quantidade de Itens: " + (v2.toArray().length - 1) + " -----> Tempo de uso da CPU: " + (tempoFinal4 - tempoInicial4) + " ms\n");
////****************************************************************************************************************
        System.out.println("######## Ordenação: Inserção Direta 1.000.000 ########");
        long tempoInicial5 = System.currentTimeMillis();

        System.out.println("Vetores Desordenados: " + v3);
        for (j = 1; j < v3.toArray().length; j++)
        {
            key = v3.get(j);
            for (i = j - 1; (i >= 0) && (v3.get(i) > key); i--)
            {
                v3.set(i + 1, v3.get(i));
            }
            v3.set(i + 1, key);
        }

        System.out.println("Vetores Ordenados: " + v3);
        long tempoFinal5 = System.currentTimeMillis();


        System.out.println("Quantidade de Itens: " + (v3.toArray().length - 1) + " -----> Tempo de uso da CPU: " + (tempoFinal5 - tempoInicial5) + " ms\n");
////****************************************************************************************************************
        System.out.println("######## Ordenação: Inserção Direta 5.000.000 ########");
        long tempoInicial6 = System.currentTimeMillis();

        System.out.println("Vetores Desordenados: " + v4);
        for (j = 1; j < v4.toArray().length; j++)
        {
            key = v4.get(j);
            for (i = j - 1; (i >= 0) && (v4.get(i) > key); i--)
            {
                v4.set(i + 1, v4.get(i));
            }
            v4.set(i + 1, key);
        }

        System.out.println("Vetores Ordenados: " + v4);
        long tempoFinal6 = System.currentTimeMillis();


        System.out.println("Quantidade de Itens: " + (v4.toArray().length - 1) + " -----> Tempo de uso da CPU: " + (tempoFinal6 - tempoInicial6) + " ms\n");
////****************************************************************************************************************
        System.out.println("######## Ordenação: Inserção Direta 10.000.000");
        long tempoInicial7 = System.currentTimeMillis();

        System.out.println("Vetores Desordenados: " + v5);
        for (j = 1; j < v5.toArray().length; j++)
        {
            key = v5.get(j);
            for (i = j - 1; (i >= 0) && (v5.get(i) > key); i--)
            {
                v5.set(i + 1, v5.get(i));
            }
            v5.set(i + 1, key);
        }

        System.out.println("Vetores Ordenados: " + v5);
        long tempoFinal7 = System.currentTimeMillis();


        System.out.println("Quantidade de Itens: " + (v5.toArray().length - 1) + " -----> Tempo de uso da CPU: " + (tempoFinal7 - tempoInicial7) + " ms\n");
////****************************************************************************************************************
//        System.out.println("######## Ordenação: Bubble Sort ########");
//        long tempoInicial3 = System.currentTimeMillis();
//
//        System.out.println("Vetores Desordenados: " + v);
//        boolean troca = true;
//        int aux;
//        while (troca) {
//            troca = false;
//            for (i = 0; i < v.toArray().length - 1; i++) {
//                if (v.get(i) > v.get(i + 1)) {
//                    aux = v.get(i);
//                    v.set(i, v.get(i + 1));
//                    v.set(i + 1, aux);
//                    troca = true;
//                }
//            }
//        }
//        System.out.println("Vetores Ordenados: " + v);
//        long tempoFinal3 = System.currentTimeMillis();
//
//
//        System.out.println("Quantidade de Itens: " + (v.toArray().length - 1) + " -----> Tempo de uso da CPU: " + (tempoFinal3 - tempoInicial3) + " ms\n");
//*************************************************************************************************************************************************//
//
//        System.out.println("######## Ordenação: Shake Sort ########");
//        long tempoInicial5 = System.currentTimeMillis();
//
//        System.out.println("Vetores Desordenados: " + v);
//        {
//            int k,l,r,tam = v.toArray().length;
//
//            l=1;
//            r= k=tam-1;
//            do {
//                for (j=r; j>=l; j--)
//                    if (v.get(j - 1) > v.get(j)) {
//                        aux= v.get(j - 1);
//                        v.set(j - 1, v.get(j));
//                        v.set(j, aux);
//                        k=j;
//                    }
//                l= k+1;
//
//                for (j=l; j<=r; j++)
//                    if (v.get(j - 1) > v.get(j))
//                    {
//                        aux= v.get(j - 1);
//                        v.set(j - 1, v.get(j));
//                        v.set(j, aux);
//                        k=j;
//                    }
//
//                r=k-1;
//
//            } while (l<=r);
//
//        }
//        System.out.println("Vetores Ordenados: " + v);
//        long tempoFinal5 = System.currentTimeMillis();
//
//
//        System.out.println("Quantidade de Itens: " + (v.toArray().length - 1) + " -----> Tempo de uso da CPU: " + (tempoFinal5 - tempoInicial5) + " ms\n");
//*************************************************************************************************************************************************//
//
//        System.out.println("######## Ordenação: Seleção Direta ########");
//        long tempoInicial4 = System.currentTimeMillis();
//
//        System.out.println("Vetores Desordenados: " + v);
//        for (int fixo = 0; fixo < v.toArray().length - 1; fixo++) {
//            int menor = fixo;
//
//            for (i = menor + 1; i < v.toArray().length; i++) {
//                if (v.get(i) < v.get(menor)) {
//                    menor = i;
//                }
//            }
//            if (menor != fixo) {
//                int t = v.get(fixo);
//                v.set(fixo, v.get(menor));
//                v.set(menor, t);
//            }
//        }
//        System.out.println("Vetores Ordenados: " + v);
//        long tempoFinal4 = System.currentTimeMillis();
//
//
//        System.out.println("Quantidade de Itens: " + (v.toArray().length - 1) + " -----> Tempo de uso da CPU: " + (tempoFinal4 - tempoInicial4) + " ms\n");
//*************************************************************************************************************************************************//

        System.out.println("######## Tempo Total de Uso da CPU ########");

        long tempoFinal1 = System.currentTimeMillis();

        System.out.println("\nTempo Total de uso da CPU: " + (tempoFinal1 - tempoInicial1) + " ms");


        }
    }

