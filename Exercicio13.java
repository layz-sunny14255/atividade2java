import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Os números " + a + " e " + b + " são múltiplos.");
        } else {
            System.out.println("Os números " + a + " e " + b + " não são múltiplos.");
        }

        sc.close();
    }
}
