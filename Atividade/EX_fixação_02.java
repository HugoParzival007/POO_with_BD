
import java.util.Scanner;

public class EX_fixação_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1;
        double nota2;
        double trabalho1;
        double trabalho2;
        double trabalho3;
        double trabalhoFinal;

        System.out.print("Nota 1: ");
        nota1 = input.nextDouble();
        System.out.print("Nota 2: ");
        nota2 = input.nextDouble();
        System.out.print("Nota do trabalho1: ");
        trabalho1 = input.nextDouble();
        System.out.print("Nota do trabalho2: ");
        trabalho2 = input.nextDouble();
        System.out.print("Nota do trabalho3: ");
        trabalho3 = input.nextDouble();
        System.out.print("Nota do trabalhoFinal: ");
        trabalhoFinal = input.nextDouble();

        double notaFinal = (((nota1 + nota2) / 2) * 0.6) + (((trabalho1 + trabalho2 + trabalho3) / 3) * 0.2) + (trabalhoFinal * 0.2);

        System.out.println("Nota final: " + notaFinal);
    }
}
