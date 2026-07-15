package Semanas11e12;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        Exercicios testes = new Exercicios();

        testes.exercicio01();
        testes.exercicio02();
        testes.exercicio03();

    }

    public void exercicio01() {
        // Primeira linha
        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = 10 - i;
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

    public void exercicio04() {

    }

}
