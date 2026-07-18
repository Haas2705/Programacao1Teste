package Semanas11e12.ExercicioCarrinhoDeCompra;

public class Carrinho {

    private static final int TAMANHO_MAXIMO = 100;
    private int tamanhoAtual = 0;

    private Produto[] carrinho = new Produto[TAMANHO_MAXIMO];

    public void adicionarProduto(String nome, double preco) {
        if (preco <= 0) {
            System.out.println("Preço deve ser maior que zero.");
            return;
        }

        Produto produto = new Produto(nome, preco);

        if (tamanhoAtual < TAMANHO_MAXIMO) {
            carrinho[tamanhoAtual] = produto;
            tamanhoAtual++;
        } else {
            System.out.println("Carrinho cheio!");
        }
    }

    public void removerProduto(int pos) {
        if (pos < 0 || pos >= tamanhoAtual) {
            System.out.println("Posição inválida");
            return;
        }

        for (int i = pos; i < tamanhoAtual - 1; i++) {
            carrinho[i] = carrinho[i + 1];
        }

        carrinho[tamanhoAtual - 1] = null;
        tamanhoAtual--;

        System.out.println("Produto removido com sucesso!");
    }

    public void exibirCarrinho() {
        if (tamanhoAtual == 0) {
            System.out.println("Carrinho vazio.");
            return;
        }

        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println();
            System.out.println("Índice: " + i);
            System.out.println(carrinho[i].toString());
        }
    }

    public void acessarProduto(int pos) {
        if (pos >= 0 && pos < tamanhoAtual) {
            System.out.println(carrinho[pos].toString());
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public void pesquisarProduto(String nome) {
        boolean encontrou = false;

        for (int i = 0; i < tamanhoAtual; i++) {
            if (carrinho[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println(carrinho[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Produto não encontrado.");
        }
    }

}
