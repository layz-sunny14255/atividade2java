import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique sua idade em dias: ");
        int idade = sc.nextInt();

        int anos = idade / 365;

        int resto_meses = idade % 365;

        int meses = resto_meses / 30;

        int dias = resto_meses % 30;

        System.out.println("Idade: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
        sc.close();
    }
}