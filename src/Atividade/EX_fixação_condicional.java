package Atividade;

import java.util.Scanner;

public class EX_fixação_condicional {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma idade ");
        int idade = input.nextInt();

        if (idade < 6) {
            System.out.print("Isento de pagamento");
        } else if (idade <= 12) {
            System.out.print("Bilhete de criança");
        } else if (idade <= 65) {
            System.out.print("Bilhete normal");
        } else {
            System.out.print("Bilhete de 3* idade");
        }
    }

}
