package Atividade;

import java.util.Scanner;

public class EX_02_vetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz [] [] = new int[3][3];
        int maxNum = matriz [0][0];
        int maxline = 0;
        int maxcolum = 0;
        int minNum = matriz [0][0];
        int minline = 0;
        int mincolum = 0;

        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();

                if(matriz[i][j]>maxNum){
                    maxNum=matriz[i][j];
                    maxcolum=j;
                    maxline=i;
                }
                if(matriz[i][j]<minNum){
                    minNum=matriz[i][j];
                    mincolum=j;
                    minline=i;
                }
            }
        }

        System.out.println("\n--- Matriz Criada ---");
        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("O maior elemento é " + maxNum + " e está na posição [" + maxline + "][" + maxcolum + "]");
        System.out.println("O menor elemento é " + minNum + " e está na posição [" + minline + "][" + mincolum + "]");
    }
}
