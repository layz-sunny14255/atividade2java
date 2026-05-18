import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

           System.out.print("Indique a distância percorrida em km: ");
        double distancia = sc.nextDouble();

        System.out.print("Indique a quantidade de combustível gasto em litros: ");
        
        double quantidade = sc.nextDouble();

        double media = distancia/quantidade;

        System.out.println("Média: " + media);

        sc.close();
    }
}