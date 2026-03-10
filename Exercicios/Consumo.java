import java.util.Locale;
import java.util.Scanner;

public class consumo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int distanciaPercorrida = entrada.nextInt();
    double totalCombustivel = entrada.nextDouble();

    double resultado = distanciaPercorrida / totalCombustivel;
    System.out.printf("%.3f km/l%n", resultado);

    entrada.close();
  }
}
