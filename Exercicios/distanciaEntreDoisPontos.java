import java.util.Locale;
import java.util.Scanner;

public class distanciaEntreDoisPontos {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double x1 = entrada.nextDouble();
    double y1 = entrada.nextDouble();
    double x2 = entrada.nextDouble();
    double y2 = entrada.nextDouble();

    double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.printf("%.4f%n", distancia); 
    entrada.close();
  }
}

// Math.pow(a, b) → potência (aᵇ)
// Math.sqrt(x) → raiz quadrada