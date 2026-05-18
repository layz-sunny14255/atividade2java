import java.util.Scanner;
import java.util.Locale;

public class exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

         System.out.print("Valor total : ");
        double total = sc.nextDouble();

        System.out.print("Valor com desconto : ");
        double valor_desconto = sc.nextDouble();

        double diferenca = total - valor_desconto;

        double desconto = (diferenca/total) * 100;
        
        System.out.println("Desconto: " + desconto);

        sc.close();
    }
}