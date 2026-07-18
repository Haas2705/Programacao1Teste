package Semanas13e14;

public class Produto {

    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "preco=" + preco +
                '}';
    }

}
