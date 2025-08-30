package Atividade;

import java.util.Scanner;

public class EX_03_vetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz [] [] = new int[3][3];
        int somaSecundaria=0;
        int somaPrincipal = 0;
        int contadorSecundaria = 0;
        double mediaSecundaria = 0;



        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\n--- Matriz Criada ---");
        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                if(i==j) {
                    somaPrincipal += matriz[i][j];
                }
                if (i+j==2) {
                    somaSecundaria += matriz[i][j];
                    contadorSecundaria++;
                }
            }
        }
        System.out.println("a) Soma da diagonal principal: " + somaPrincipal);
        if (contadorSecundaria>0){
            mediaSecundaria=(double) somaSecundaria/contadorSecundaria;
        }
        System.out.println("b) Média da diagonal secundária: " + mediaSecundaria);

        System.out.print("c) Elementos pares acima da diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j > i && matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();

        System.out.print("d) Elementos ímpares abaixo da diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i > j && matriz[i][j] % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
