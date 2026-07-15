package ExemploNota;

class Aluno extends Pessoa {
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        super(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String getStatus() {
        double media = calcularMedia();
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() +
                "\nMédia: " + calcularMedia() +
                "\nSituação: " + getStatus();
    }
}