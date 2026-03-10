import java.util.Locale;
import java.util.Scanner;

public class conversaoDeTempo {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int segundos = entrada.nextInt();

    int horas = segundos / 3600;
    int resto = segundos % 3600;

    int minutos = resto / 60;
    int segundosFinais = resto % 60;

    System.out.println(horas + ":" + minutos + ":" + segundosFinais);

      entrada.close();
    }
}
    /*
      1 hora = 3600 segundos
      1 minuto = 60 segundos
      Quantas horas completas cabem dentro dos segundos
      formula: horas = segundos / 3600

      Para descobrir o resto:
      resto = segundos % 3600

      Agora usamos o resto para descobrir os minutos:
      minutos = resto / 60

      Depois de tirar os minutos, ainda sobra um resto:
      segundosFinais = resto % 60

      horas = segundos / 3600
      resto = segundos % 3600

      minutos = resto / 60
      segundosFinais = resto % 60
      */
