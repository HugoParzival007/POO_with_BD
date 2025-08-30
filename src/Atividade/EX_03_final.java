package Atividade;

import java.util.Scanner;

public class EX_03_final {
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

            D_etapa1=Math.abs(tempoPadrao1-tempoEquipe1);
            D_etapa2=Math.abs(tempoPadrao2-tempoEquipe2);
            D_etapa3=Math.abs(tempoPadrao3-tempoEquipe3);
            if (D_etapa1 < 3)
                pontosEtapa1=100;
            else if(D_etapa1<=5)
                pontosEtapa1=80;
            else {
                pontosEtapa1= (int)(80 - (D_etapa1 - 5)/5);
            }
            if (D_etapa2 < 3)
                pontosEtapa2=100;
            else if(D_etapa2<=5)
                pontosEtapa2=80;
            else {
                pontosEtapa2= (int)( 80 - (D_etapa2 - 5)/5);
            }
            if (D_etapa3 < 3)
                pontosEtapa3=100;
            else if(D_etapa3<=5)
                pontosEtapa3=80;
            else {
                pontosEtapa3= (int)( 80 - (D_etapa3 - 5)/5);
            }

            totalPontosEquipe = pontosEtapa1 + pontosEtapa2 + pontosEtapa3;
            if (totalPontosEquipe > maiorPontuacaoTotal){
                maiorPontuacaoTotal = totalPontosEquipe;
                inscricaoVencedora = numeroInscricao;
            }


        }

    }
}
