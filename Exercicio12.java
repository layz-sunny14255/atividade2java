import java.util.Scanner;
import java.util.Locale;

public class Exercício12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro ângulo: ");
        double a1 = sc.nextDouble();

        System.out.print("Segundo ângulo: ");
        double a2 = sc.nextDouble();

        System.out.print("Terceiro ângulo: ");
        double a3 = sc.nextDouble();

        if (a1 + a2 + a3 == 180.0 && a1 > 0 && a2 > 0 && a3 > 0) {
            System.out.println("Triângulo válido");
        } else {
            System.out.println("Triângulo inválido");
        }

        sc.close();
    }
}