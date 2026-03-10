import java.util.Locale;
import java.util.Scanner;

public class cedulas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    int valor = entrada.nextInt();

    int notas100 = valor / 100;
    int resto = valor % 100;
    int notas50 = resto / 50;
    resto = resto % 50; 
    int notas20 = resto / 20;
    resto = resto % 20; 
    int notas10 = resto / 10;
    resto = resto % 10; 
    int notas5 = resto / 5;
    resto = resto % 5;
    int notas2 = resto / 2;
    resto = resto % 2;
    int notas1 = resto / 1;

    System.out.println(valor);
    System.out.println(notas100 + " nota(s) de R$ 100,00");
    System.out.println(notas50 + " nota(s) de R$ 50,00");
    System.out.println(notas20 + " nota(s) de R$ 20,00");
    System.out.println(notas10 + " nota(s) de R$ 10,00");
    System.out.println(notas5 + " nota(s) de R$ 5,00");
    System.out.println(notas2 + " nota(s) de R$ 2,00");
    System.out.println(notas1 + " nota(s) de R$ 1,00");

    entrada.close();
  }
}
