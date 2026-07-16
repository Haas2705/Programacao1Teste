package Semanas11e12;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        Exercicios testes = new Exercicios();

        // Teste exercicio 01
        testes.exercicio01();

        // Teste exercicio 02
        testes.exercicio02();

        // Teste exercicio 03
        // testes.exercicio03();

        // Teste exercicio 04
        int[] arrayEx04 = new int[] { 1, 2, 3, 4, 5, 6, -5, -10 };
        int resultado = testes.exercicio04(arrayEx04);
        System.out.println("A quantidade de números negativos é: " + resultado);

        // Teste exercicio 05
        int[] arrayEx05 = new int[] { 1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9 };
        int ocorrencias = testes.exercicio05(arrayEx05, 6);
        System.out.println("O número de ocorrencias de X é: " + ocorrencias);

        // Teste exercicio 06
        int[] arrayEx06 = new int[] { 1, 2, -4, -9 };
        boolean[] resultado2 = testes.exercicio06(arrayEx06);
        System.out.println(Arrays.toString(resultado2));

        // Teste exercicio 07
        double[] arrayEx07 = new double[] { 1.5, 1.2, 2.4, 5 };
        int resultado07 = testes.exercicio07(arrayEx07);
        System.out.println(resultado07);

        // Teste exercicio 08
        // int[] resultado08 = testes.exercicio08();
        // System.out.println(Arrays.toString(resultado08));

        // Teste exercicio 09
        int[] arrayEx09 = new int[] { 1, 2, 4, 6, 9, 5 };
        System.out.println("Antes: " + Arrays.toString(arrayEx09));
        testes.exercicio09(arrayEx09);
        System.out.println("Depois: " + Arrays.toString(arrayEx09));

    }

    public void exercicio01() {
        // Primeira linha
        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1.length - i;
        }
        System.out.println(Arrays.toString(array1));

        // Segunda linha
        int[] array2 = new int[11];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i * i;
        }
        System.out.println(Arrays.toString(array2));

        // Terceira linha
        int[] array3 = new int[10];

        for (int i = 0; i < array3.length; i++) {
            if (i >= 5) {
                array3[i] = (i - 4) * 10;
            } else {
                array3[i] = i + 1;
            }

        }
        System.out.println(Arrays.toString(array3));

        // Quarta linha
        int[] array4 = new int[10];

        for (int i = 0; i < array4.length; i++) {
            array4[i] = 3 + i * i;
        }
        System.out.println(Arrays.toString(array4));

    }

    public void exercicio02() {
        double[] a = { 1.5, 2.3, 4.8, 10.0 };

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void exercicio03() {
        Scanner sc = new Scanner(System.in);

        double[] arrayd = new double[10];

        for (int i = 0; i < arrayd.length; i++) {
            System.out.print("Escreva 10 valores com ponto flutuante: ");
            arrayd[i] = sc.nextDouble();

        }
        sc.close();
        System.out.println(Arrays.toString(arrayd));
    }

    public int exercicio04(int[] array) {
        if (array == null)
            return -1;

        int quant = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                quant++;
            }
        }
        return quant;
    }

    public int exercicio05(int[] a, int x) {
        if (a == null)
            return -1;

        int ocorrencias = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                ocorrencias++;
            }
        }
        return ocorrencias;
    }

    public boolean[] exercicio06(int[] array) {
        if (array == null)
            return null;

        boolean[] resultado = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            resultado[i] = array[i] > 0;
        }
        return resultado;
    }

    public int exercicio07(double[] array) {
        if (array == null || array.length == 0)
            return -1;

        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[pos]) {
                pos = i;
            }
        }
        return pos;
    }

    public int[] exercicio08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o tamanho que você quer que tenha o array de inteiros? ");
        int tam = sc.nextInt();

        int[] arrayBase = new int[tam];

        for (int i = 0; i < arrayBase.length; i++) {
            System.out.print("Digite o valor da " + (i + 1) + "ª posição: ");
            arrayBase[i] = sc.nextInt();
        }

        sc.close();
        return arrayBase;
    }

    public void exercicio09(int[] array) {
        if (array == null) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = -1;
            }
        }
    }

}
