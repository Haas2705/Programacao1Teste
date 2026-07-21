package Semanas13e14.ExercicioListaDePresenca;

import java.text.DecimalFormat;

public class Presenca {
    
    private Pessoa[] alunos;
    private boolean[] presenca;

    public Presenca(Pessoa[] alunos) {
        if (alunos == null) {
            this.alunos = new Pessoa[0];
            this.presenca = new boolean[0];
        } else {
            this.alunos = alunos;
            this.presenca = new boolean[alunos.length];
        }
    }

    public boolean[] getPresenca() {
        return presenca;
    }

    public void setPresenca(boolean[] presenca) {
        this.presenca = presenca;
    }

    public void marcarPresenca(int indice) {
        if (indice >= 0 && indice < alunos.length) { // Verifica se o índice fornecido é válido
            presenca[indice] = true; // Marca a presença do aluno no índice especificado como true
            System.out.println("Presença marcada para o aluno " + alunos[indice].getNome());
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void gerarPresencaAleatoria() {
        for (int i = 0; i < presenca.length; i++) {
            presenca[i] = Math.random() < 0.5; // Gera aleatoriamnete true ou false
        }
    }

    public void imprimirPresenca(DecimalFormat df) {
        if (alunos == null) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println("Nome: " + alunos[i].getNome());
                System.out.println("Idade: " + alunos[i].getIdade());
                System.out.println("Peso: " + df.format(alunos[i].getPeso()));
                System.out.println("Altura: " + df.format(alunos[i].getAltura()));
                if (presenca[i] == true) {
                    System.out.println("Presente");
                } else {
                    System.out.println("Ausente");
                }
                System.out.println("-----------------------");
                }
            }
        }
        
}
