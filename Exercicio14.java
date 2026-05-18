import java.util.Scanner;
import java.util.Locale;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o resultado (vencemos, empatamos ou perdemos): ");
        String resultado = sc.nextLine();

        if (resultado.equals("vencemos")) {
            System.out.println("Pontos: 3");
        } else if (resultado.equals("empatamos")) {
            System.out.println("Pontos: 1");
        } else {
            System.out.println("Pontos: 0");
        }

        sc.close();
    }
}