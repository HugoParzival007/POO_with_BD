package Atividade;

import java.util.Scanner;

public class EX_fixação_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hamburguer = 15; //15
        double hamburguerEspecial = 20; //20
        double batataFrita = 8; //8
        double suco = 9; //9

        System.out.println("Tabela de valores:");
        System.out.println("Hamburguer | Hamburguer especial | Batata Frita | Suco");
        System.out.println("    " + hamburguer + "   |         " + hamburguerEspecial + "        |      " + batataFrita + "     | " + suco);

        System.out.print("Informe a quantidade de Hamburguer: ");
        int qtdHamburguer = input.nextInt();

        System.out.print("Informe a quantidade de Hamburguer especial: ");
        int qtdHamburguerEspecial = input.nextInt();

        System.out.print("Informe a quantidade de Batata Frita: ");
        int qtdBatataFrita = input.nextInt();

        System.out.print("Informe a quantidade de Suco: ");
        int qtdSuco = input.nextInt();

        double totalPagar = (qtdHamburguer * hamburguer) + (qtdHamburguerEspecial * hamburguerEspecial) + (qtdBatataFrita * batataFrita) + (qtdSuco * suco);

        System.out.println("SEU PEDIDO:");
        System.out.println("Hamburguer | Hamburguer especial | Batata Frita | Suco | Total a pagar");
        System.out.println("    " + qtdHamburguer + "      |         " + qtdHamburguerEspecial + "           |      " + qtdBatataFrita + "       |  " + qtdSuco + "   |   R$ " + String.format("%.2f", totalPagar));

    }

}
