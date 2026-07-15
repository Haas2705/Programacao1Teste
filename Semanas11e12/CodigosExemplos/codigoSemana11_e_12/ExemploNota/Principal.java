package ExemploNota; // Pacote que contém a classe Principal e a classe Aluno

import java.util.Scanner; // Importação da classe Scanner do pacote java.util

public class Principal { // Declaração da classe Principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para ler dados de entrada

        System.out.print("Digite o número de alunos: "); // Solicita ao usuário que digite o número de alunos
        int numAlunos = scanner.nextInt(); // Lê o número de alunos digitado pelo usuário

        Aluno[] alunos = new Aluno[numAlunos]; // Criação de um array de objetos Aluno com o tamanho especificado

        for (int i = 0; i < numAlunos; i++) { // Loop que solicita informações dos alunos e cria objetos Aluno
            System.out.println("\nAluno " + (i + 1)); // Mostra o número do aluno sendo inserido
            System.out.print("Digite o nome do aluno: "); // Solicita o nome do aluno
            String nome = scanner.next(); // Lê o nome do aluno digitado pelo usuário
            System.out.print("Digite a nota 1 do aluno: "); // Solicita a primeira nota do aluno
            double nota1 = scanner.nextDouble(); // Lê a primeira nota do aluno digitada pelo usuário
            System.out.print("Digite a nota 2 do aluno: "); // Solicita a segunda nota do aluno
            double nota2 = scanner.nextDouble(); // Lê a segunda nota do aluno digitada pelo usuário

            alunos[i] = new Aluno(nome, nota1, nota2); // Cria um objeto Aluno com as informações fornecidas e o armazena no array
        }

        double somaMedias = 0; // Variável para armazenar a soma das médias dos alunos

        System.out.println("\nResultados:"); // Mostra a palavra "Resultados" no console

        for (int i = 0; i < numAlunos; i++) { // Loop que calcula a média de cada aluno e mostra suas informações
            Aluno aluno = alunos[i]; // Obtém o objeto Aluno na posição i do array
            double media = aluno.calcularMedia(); // Chama o método calcularMedia() para obter a média do aluno
            somaMedias += media; // Soma a média do aluno à variável somaMedias

            System.out.println(aluno.toString()); // Mostra as informações do aluno no console
        }

        double mediaGeral = somaMedias / numAlunos; // Calcula a média geral da turma
        System.out.println("\nMédia geral da turma: " + mediaGeral); // Mostra a média geral da turma no console

        scanner.close(); // Fecha o objeto Scanner
    }
}
