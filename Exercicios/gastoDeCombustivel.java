import java.util.Locale;
import java.util.Scanner;

public class gastoDeCombustivel {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int tempo = entrada.nextInt();
    int velocidade = entrada.nextInt();
    
    int distancia = tempo * velocidade;
    int consumo = 12;

    double combustivel = (double) distancia / consumo;
    System.out.printf("%.3f%n", combustivel);

    entrada.close();
}

}
