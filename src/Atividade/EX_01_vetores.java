package Atividade;

import java.util.Scanner;

public class EX_01_vetores {
    public static void main(String[] args) {
        int matriz [] [] = new int [3] [3];
        int qtPar = 0;
        int qtImpar = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();

                if(matriz[i][j]%2 == 0){
                    qtPar++;
                } else {
                    qtImpar++;
                }
            }
        }

        System.out.println("\n--- Matriz Criada ---");
        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz[i][j] + "\t"); // \t para alinhar as colunas
            }
            System.out.println();
        }
        System.out.println("Quantidade de números pares: " + qtPar);
        System.out.println("Quantidade de números ímpares: " + qtImpar);
    }
}
