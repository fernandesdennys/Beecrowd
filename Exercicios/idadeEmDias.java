import java.util.Locale;
import java.util.Scanner;

public class idadeEmDias {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  Locale.setDefault(Locale.US);

  int idadeEmDias = entrada.nextInt();

  //PASSO 1 calcualr anos
  int ano = idadeEmDias / 365;

  //PASSO 2 descobrir quantos dias sobram
  int resto = idadeEmDias % 365;

  //PASSO 3 calcular meses 
  int mes = resto / 30;

  //PASSO 4 calcular dias
  int dia = resto % 30;

  System.out.println( ano + " ano(s)");
  System.out.println( mes + " mes(es)");
  System.out.println( dia + " dia(s)");

  entrada.close();
  }
}
