import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique um número: ");
        double numero = sc.nextDouble();

        double desconto = numero * (15.0 / 100.0);
        double valorFinal = numero - desconto;

        Locale ptBr = new Locale("pt", "BR");
        double valorFormatado = NumberFormat.getCurrencyInstance(ptBr).format(valorFinal);

        System.out.println("Valor final: " + valorformatado);

        sc.close();
    }
}
