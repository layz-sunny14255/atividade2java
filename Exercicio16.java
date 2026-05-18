import java.util.Scanner;
import java.util.Locale;

public class Exercicio16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ângulo: ");
        double angulo = sc.nextDouble();

        if (angulo > 0 && angulo < 90) {
            System.out.println("Classificação:ângulo agudo");

        } else if (angulo == 90) {
            System.out.println("Classificação:ângulo reto");

        } else if (angulo > 90 && angulo < 180) {
            System.out.println("Classificação:ângulo obtuso");

        } else if (angulo == 0 || angulo == 180) {
            System.out.println("Classificação:ângulo raso");
        }

        else if (angulo > 180 && angulo < 360) {
            System.out.println("Classificação:ângulo côncavo");
        } else {
            System.out.println("Classificação:ângulo completo");
        }

        sc.close();
    }
}