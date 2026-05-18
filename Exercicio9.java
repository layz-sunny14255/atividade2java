import java.util.Scanner;
import java.util.Locale;

public class exercício9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       System.out.print("Digite um número de 1 a 12: ");
        int numero = sc.nextInt();

                switch (numero) {
            case 1  -> System.out.println("Janeiro \ 31 Dias");
            case 2  -> System.out.println("Fevereiro \ 28 ou 29 (ano bissexto) Dias");
            case 3  -> System.out.println("Março \ 31 Dias");
            case 4  -> System.out.println("Abril \ 30 Dias");
            case 5  -> System.out.println("Maio \ 31 Dias");
            case 6  -> System.out.println("Junho \ 30 Dias");
            case 7  -> System.out.println("Julho \ 31 Dias");
            case 8  -> System.out.println("Agosto \ 31 Dias");
            case 9  -> System.out.println("Setembro \ 30 Dias");
            case 10 -> System.out.println("Outubro \ 31 Dias");
            case 11 -> System.out.println("Novembro \ 30 Dias");
            case 12 -> System.out.println("Dezembro \ 31 Dias");
            default -> System.out.println("Número inválido");
        }

        sc.close();
    }
}
