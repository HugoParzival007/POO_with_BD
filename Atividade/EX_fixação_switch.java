
import java.util.Scanner;

public class EX_fixação_switch {

    public static void main(String[] args) {
        double pesoPlaneta;
        double pesoTerra;
        String planeta = null;
        double gravidadeRelativa = 0;
        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Seu peso na terra: ");
        pesoTerra = input.nextDouble();

        System.err.println("Nº\tPlaneta\tGravidade Relativa\n"
                + //
                "1\tMercúrio\t0,37\n"
                + //
                "2\tVênus\t0,88\n"
                + //
                "3\tMarte\t0,38\n"
                + //
                "4\tJúpiter\t2,64\n"
                + //
                "5\tSaturno\t1,15\n"
                + //
                "6\tUrano\t1,17");
        System.out.print("Escolha um planeta: ");
        num = input.nextInt();

        switch (num) {
            case 1:
                gravidadeRelativa = 0.37;
                planeta = "Mercúrio";
                break;
            case 2:
                gravidadeRelativa = 0.88;
                planeta = "Vênus";
                break;
            case 3:
                gravidadeRelativa = 0.38;
                planeta = "Marte";
                break;
            case 4:
                gravidadeRelativa = 2.64;
                planeta = "Júpiter";
                break;
            case 5:
                gravidadeRelativa = 1.15;
                planeta = "Saturno";
                break;
            case 6:
                gravidadeRelativa = 1.17;
                planeta = "Urano";
                break;
            default:
                System.out.println("Erro");
        }

        pesoPlaneta = ((pesoTerra / 10) * gravidadeRelativa);

        System.err.println("Seu peso em " + planeta + " é " + pesoPlaneta + " Kg.");
    }
}
