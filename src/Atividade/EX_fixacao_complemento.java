package Atividade;

import java.util.Scanner;

public class EX_fixacao_complemento {

    public static void main(String[] args) {

        boolean continuar = true;
        Scanner input = new Scanner(System.in);

        while (continuar) {

            System.out.println("\nEscolha uma das 5 opções:\n"
                    + "1\tSoma\n"
                    + "2\tSubtração\n"
                    + "3\tMultiplicação\n"
                    + "4\tDivisão\n"
                    + "5\tFim\n");
            System.out.print("Escolha uma das opções acima: ");

            if (input.hasNextInt()) {
                int num = input.nextInt();

                switch (num) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.print("Digite o primeiro número inteiro: ");
                        while (!input.hasNextInt()) {
                            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                            System.out.print("Digite o primeiro número inteiro: ");
                            input.next();
                        }
                        int num1 = input.nextInt();

                        System.out.print("Digite o segundo número inteiro: ");
                        while (!input.hasNextInt()) {
                            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                            System.out.print("Digite o segundo número inteiro: ");
                            input.next();
                        }
                        int num2 = input.nextInt();

                        if (num == 1) {
                            System.out.println("RESULTADO: " + num1 + " + " + num2 + " = " + (num1 + num2));
                        } else if (num == 2) {
                            System.out.println("RESULTADO: " + num1 + " - " + num2 + " = " + (num1 - num2));
                        } else if (num == 3) {
                            System.out.println("RESULTADO: " + num1 + " * " + num2 + " = " + (num1 * num2));
                        } else if (num == 4) {
                            if (num2 == 0) {
                                System.out.println("ERRO: Não é possível dividir por zero.");
                            } else {
                                double divisao = (double) num1 / num2;
                                System.out.println("RESULTADO: " + num1 + " / " + num2 + " = " + divisao);
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Encerrando o programa...");
                        continuar = false;
                        break;

                    default:
                        System.out.println("ERRO: Opção inválida! Por favor, escolha um número de 1 a 5.");
                        break;

                }

            } else {
                System.out.println("ERRO: Entrada inválida! Por favor, digite um número correspondente à opção.");
                input.next();
            }
        }

        input.close();
    }
}
