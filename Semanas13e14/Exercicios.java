package Semanas13e14;

public class Exercicios {

    public static void main(String[] args) {

        Exercicios ex = new Exercicios();

    }

    // Exercicio01
    public boolean verificaLivro(Livro[] livros, String titulo) {
        // Validação para array vazio
        if (livros == null) {
            return false;
        }
        
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }  

    // Exercicio02
    public Livro retornaLivro(Livro[] livros, String titulo) {
        if (livros == null) return null; // Validando o array

        for (Livro livro : livros) {
            if (livro != null && livro.getTitulo().equalsIgnoreCase(titulo)) { // Manipulando o obj
                return livro;
            }
        }
        return null;
    }

    // Exercicio 03
    public void imprimeUniversidades(Universidade[] universidades) {
        if (universidades == null) { // Tratamento do array
            System.out.println("Nenhuma universidade cadastrada.");
            return;
        }

        for (Universidade uni : universidades) {
            if (uni != null) {
                System.out.println(uni.toString());
            }
        }
    }

    // Exercicio 04
    public Universidade maisAlunos(Universidade[] universidades) {
        if (universidades == null || universidades.length == 0) {
            return null;
        }
        
        Universidade maior = universidades[0]; // iniciando o obj auxiliar como referencia

        for(int i = 1; i < universidades.length; i++) { // i começa com 1 porque obj maior já é o 0
            if (universidades[i].getNumeroAlunos() > maior.getNumeroAlunos()) {
                maior = universidades[i];
            }
        }
        return maior;
    }  

    // Exercicio 05
    public Produto produtoMaisBarato(Produto[] produtos) {
        if (produtos == null || produtos.length == 0) {
            return null;
        }

        // Quando você trabalha com objetos, você não guarda uma cópia do objeto; você guarda uma referência para ele.
        Produto menorPreco = produtos[0]; // <- Referencia

        for (int i = 1; i < produtos.length; i++) {
            if (produtos[i].getPreco() < menorPreco.getPreco()) {
                menorPreco = produtos[i];
            }
        }
        return menorPreco;
    }



}
