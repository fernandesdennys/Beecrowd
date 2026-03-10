import java.util.Locale;
import java.util.Scanner;

public class distancia {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int distancia = entrada.nextInt();
    int tempo = distancia * 2;

    System.out.println(tempo + " minutos");

    entrada.close();
  }
}
