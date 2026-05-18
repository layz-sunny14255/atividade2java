import java.util.Scanner;
import java.util.Locale;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria:Infantil A");

        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria:Infantil B");

        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria:Juvenil A");

        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria:Juvenil B");

        } else {
            System.out.println("Categoria:Adulto");
        }

        sc.close();
    }
}