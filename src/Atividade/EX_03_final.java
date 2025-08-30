package Atividade;

import java.util.Scanner;

public class EX_03_final {
    public static int calcularPontosEtapa(double tempoPadrao, double tempoEquipe){
        double D=Math.abs(tempoPadrao-tempoEquipe);
        int pontosEtapa;
        if (D < 3)
            pontosEtapa=100;
        else if(D<=5)
            pontosEtapa=80;
        else {
            pontosEtapa= (int)(80 - (D - 5)/5);
        }
        return pontosEtapa;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tempoPadrao1;
        double tempoPadrao2;
        double tempoPadrao3;
        int numeroInscricao;
        double tempoEquipe1;
        double tempoEquipe2;
        double tempoEquipe3;
        double D_etapa1;
        double D_etapa2;
        double D_etapa3;
        int pontosEtapa1;
        int pontosEtapa2;
        int pontosEtapa3;
        int totalPontosEquipe;
        int inscricaoVencedora = 0;
        double maiorPontuacaoTotal = -1.0;

        System.out.println("Digite o tempo-padrão para a Etapa 1 (em minutos):");
        tempoPadrao1 = input.nextDouble();
        System.out.println("Digite o tempo-padrão para a Etapa 2 (em minutos):");
        tempoPadrao2 = input.nextDouble();
        System.out.println("Digite o tempo-padrão para a Etapa 3 (em minutos):");
        tempoPadrao3 = input.nextDouble();

        while(true){
            System.out.println("Qual o numero da equipe?");
            numeroInscricao = input.nextInt();

            if(numeroInscricao==9999)
                break;

            System.out.println("Digite o tempo da equipe na Etapa 1:");
            tempoEquipe1 = input.nextDouble();
            System.out.println("Digite o tempo da equipe na Etapa 2:");
            tempoEquipe2 = input.nextDouble();
            System.out.println("Digite o tempo da equipe na Etapa 3:");
            tempoEquipe3 = input.nextDouble();

            pontosEtapa1 = calcularPontosEtapa(tempoPadrao1, tempoEquipe1);
            pontosEtapa2 = calcularPontosEtapa(tempoPadrao2, tempoEquipe2);
            pontosEtapa3 = calcularPontosEtapa(tempoPadrao3, tempoEquipe3);

            totalPontosEquipe = pontosEtapa1 + pontosEtapa2 + pontosEtapa3;
            if (totalPontosEquipe > maiorPontuacaoTotal){
                maiorPontuacaoTotal = totalPontosEquipe;
                inscricaoVencedora = numeroInscricao;
            }
            System.out.println("Equipe: " + numeroInscricao);
            System.out.println("Pontos Etapa 1: " + pontosEtapa1);
            System.out.println("Pontos Etapa 2: " + pontosEtapa2);
            System.out.println("Pontos Etapa 3: " + pontosEtapa3);
            System.out.println("Total de Pontos: " + totalPontosEquipe);
        }
        System.out.println("A equipe vencedora é a de inscrição " + inscricaoVencedora + " com " + maiorPontuacaoTotal + " pontos!");
    }
}
