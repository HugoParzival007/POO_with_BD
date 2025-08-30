package Atividade;

import java.util.Scanner;

public class EX_02_complemento {
    public static void main(String[] args) {
        int idade;
        int sexo;
        int instrucao;
        int totalPessoas = 0;
        int mulheresSuperiorAbaixo35 = 0;
        int homensMestradoAcima40 = 0;
        int somaIdadeHomensFundamental = 0;
        int totalHomensFundamental = 0;
        int maiorIdadeMulher = 0;
        int menorIdadeMulher = 150;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Qual o sexo? (1-fem 2-masc)");
            sexo = input.nextInt();
            if (sexo == 0){
                System.out.println("Coleta de dados finalizada.");
                break;
            }
            System.out.println("Qual a idade?");
            idade = input.nextInt();
            System.out.println("Qual grau de instrução? (1-fundamental, 2-Ensino médio, 3-Curso Superior, 4-Mestrado, 5-Doutorado)");
            instrucao = input.nextInt();
            totalPessoas++;
            if(sexo == 1 && idade < 35 && instrucao == 3){
                mulheresSuperiorAbaixo35++;
            }

            if (sexo == 2 && idade > 40 && instrucao == 4){
                homensMestradoAcima40++;
            }

            if (sexo == 2 && instrucao == 1){
                somaIdadeHomensFundamental+=idade;
                totalHomensFundamental++;
            }
            if (sexo==1){
                if(idade>maiorIdadeMulher){
                    maiorIdadeMulher=idade;
                }
                if (idade < menorIdadeMulher) {
                    menorIdadeMulher = idade;
                }
            }
        }
        System.out.println("RELATORIO");
        System.out.println("Total de pessoas entrevistadas: " + totalPessoas);

        // a)
        System.out.println("a)\n Quantidade de mulheres abaixo de 35 anos com curso superior: " + mulheresSuperiorAbaixo35);

        // b)
        if (totalPessoas > 0) {
            double porcentagem = ((double) homensMestradoAcima40 / totalPessoas) * 100.0;
            System.out.printf("b)\n Porcentagem de homens com mais de 40 anos e mestrado: %.2f%%\n", porcentagem);
        } else {
            System.out.println("b)\n Não foi possível calcular a porcentagem (nenhuma pessoa entrevistada).");
        }

        // c)
        if (totalHomensFundamental > 0) {
            double media = (double) somaIdadeHomensFundamental / totalHomensFundamental;
            System.out.printf("c)\n Média de idade dos homens com ensino fundamental: %.1f anos\n", media);
        } else {
            System.out.println("c)\n Nenhum homem com ensino fundamental foi registrado.");
        }

        // d)
        if (maiorIdadeMulher > 0) {
            System.out.println("d)\n Maior idade entre as mulheres: " + maiorIdadeMulher);
            System.out.println("   Menor idade entre as mulheres: " + menorIdadeMulher);
        } else {
            System.out.println("d)\n Nenhuma mulher foi registrada.");
        }

        input.close();

    }
}
