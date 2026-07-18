package Semanas13e14;

public class Universidade {

    private String nome;
    private int numeroAlunos;

    public Universidade(String nome, int numeroAlunos) {
        this.nome = nome;
        this.numeroAlunos = numeroAlunos;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "nome='" + nome + '\'' +
                ", numeroAlunos=" + numeroAlunos +
                '}';
    }

}
