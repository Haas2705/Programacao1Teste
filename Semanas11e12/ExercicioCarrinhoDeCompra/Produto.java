package Semanas11e12.ExercicioCarrinhoDeCompra;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nPreço: R$ " + String.format("%.2f", preco);
    }

}
