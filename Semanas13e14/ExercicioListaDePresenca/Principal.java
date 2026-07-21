package Semanas13e14.ExercicioListaDePresenca;

import java.text.DecimalFormat;

public class Principal {
    
    public static void main(String[] args) {

        String[] nomes = { "Maria", "João", "Julia", "Alberto" };

        Pessoa[] alunos = new Pessoa[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            int idadeAleatoria = (int) (Math.random() * 30) + 18; 
            double pesoAleatorio = 40 + Math.random() * 60; 
            double alturaAleatoria = 1.50 + Math.random() * (2.00 - 1.50);
            alunos[i] = new Pessoa(nomes[i], idadeAleatoria, pesoAleatorio, alturaAleatoria);
        }

        Presenca presenca = new Presenca(alunos);

        presenca.gerarPresencaAleatoria();

        DecimalFormat df = new DecimalFormat("0.00");

        presenca.imprimirPresenca(df);

    }
}
