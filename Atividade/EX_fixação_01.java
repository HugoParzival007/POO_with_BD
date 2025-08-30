
import java.util.Scanner;

public class EX_fixação_01 {

    public static void main(String[] args) {
        int cateto1;
        int cateto2;
        double Hipotenusa;
        Scanner input = new Scanner(System.in);
        System.out.print("Cateto1:");
        cateto1 = input.nextInt();
        System.out.print("Cateto2:");
        cateto2 = input.nextInt();
        Hipotenusa = Math.sqrt((cateto1 * cateto2) + (cateto1 * cateto2));
        System.out.println("Valor da hipotenusa: " + Hipotenusa);
    }

}
