import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique sua idade: ");
        double anos = sc.nextDouble();

        System.out.print("Indique quantos meses se passaram desde seu aniversário: ");
        double meses = sc.nextDouble();

        System.out.print("Indique quantos dias se passaram desde o último mês: ");
        double dias = sc.nextDouble();

        double idade = (anos * 365) + (meses * 30) + dias;

        System.out.println("Idade: " + idade);

        sc.close();
    }
}