import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Digite o coeficiente A:");
            double A = input.nextDouble();
            if(A==0){
                System.out.println("Programa encerrado.");
                break;
            }
            System.out.print("Digite o coeficiente B:");
            double B = input.nextDouble();
            System.out.print("Digite o coeficiente C:");
            double C = input.nextDouble();

            double delta = (B*B)-(4*A*C);
            if (delta<0){
                System.out.println("Sem raízes reais");
            } else if (delta == 0) {
                double x = -B / (2 * A);
                System.out.println("Resultado: A equação possui uma raiz real.");
                System.out.println("x = " + x);
            }
            // MODIFICADO: O 'else' agora trata o caso de Delta > 0
            else {
                // Para calcular a raiz quadrada em Java, usamos Math.sqrt()
                double x1 = (-B + Math.sqrt(delta)) / (2 * A);
                double x2 = (-B - Math.sqrt(delta)) / (2 * A);
                System.out.println("Resultado: A equação possui duas raízes reais.");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }

        }
    }
}