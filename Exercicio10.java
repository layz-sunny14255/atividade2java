import java.util.Scanner;
import java.util.Locale;

public class Exercício10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Segundo número: ");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("Maior: " + n1);
        } else if (n2 > n1) {
            System.out.println("Maior: " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }

        sc.close();
    }
}