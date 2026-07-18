package Semanas11e12.ExercicioCarrinhoDeCompra;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        // Objetos e variável auxiliares
        Scanner sc = new Scanner(System.in);
        Carrinho cart = new Carrinho();
        int op;

        do {
            System.out.println(); // espaços no menu
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Bem vindo ao carrinho de compras");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Exibir carrinho");
            System.out.println("4 - Acessar produto");
            System.out.println("5 - Pesquisar produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            System.out.println("------------------------------------------------------------------------");
            System.out.println(); // espaços no menu

            switch (op) {
                case 1: {
                    sc.nextLine(); // limpa o Enter deixado pelo nextInt()

                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double preco = sc.nextDouble();

                    sc.nextLine(); // limpar buffer

                    cart.adicionarProduto(nome, preco);
                    break;
                }

                case 2: {
                    System.out.print("Qual a posição do produto a ser removido? ");
                    int posicao = sc.nextInt();

                    cart.removerProduto(posicao);
                    break;
                }

                case 3: {
                    System.out.println("Produtos no carrinho:");
                    cart.exibirCarrinho();
                    break;
                }

                case 4: {
                    System.out.print("Digite a posição do produto que deseja ver: ");
                    int posicao = sc.nextInt();

                    cart.acessarProduto(posicao);
                    break;
                }

                case 5: {
                    sc.nextLine(); // limpa o Enter deixado pelo nextInt()

                    System.out.print("Digite o nome do produto que deseja ver: ");
                    String nome = sc.nextLine();

                    cart.pesquisarProduto(nome);
                    break;
                }

                case 0: {
                    System.out.println("Você saiu do programa.");
                    break;
                }

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (op != 0);

        sc.close();

    }
}
