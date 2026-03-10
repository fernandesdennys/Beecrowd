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


        "
        Para fixar esse tipo de exercício na cabeça, o mais importante é entender que vários problemas de programação seguem o mesmo padrão lógico, então você não precisa decorar cada exercício individualmente, mas sim decorar o padrão que resolve todos eles.

        Esse padrão é baseado em duas operações matemáticas simples:

        /  → quantos cabem
        %  → quanto sobra

A divisão (/) serve para descobrir quantas unidades cabem dentro de um valor, enquanto o operador de resto (%) serve para descobrir o que sobra depois dessa divisão. Sempre que você encontrar problemas envolvendo tempo, dinheiro, unidades de medida, caixas ou cédulas, a primeira coisa que deve vir à mente é exatamente essa ideia: usar divisão e resto.
Uma forma eficiente de pensar nesses problemas é aplicar a regra mental de “quebrar em partes”. Primeiro você identifica qual é a maior unidade envolvida e depois vai descendo para as menores. No caso da conversão de tempo, por exemplo, o raciocínio é:
  segundos -> horas -> minutos -> segundos restantes

Quando transformamos esse raciocínio em lógica, ele naturalmente vira:
  horas = segundos / 3600
  resto = segundos % 3600
Depois usamos o valor que sobrou para descobrir os minutos e os segundos finais.
Outro hábito importante é não começar programando direto em Java. Antes disso, escreva o algoritmo em passos simples, como se estivesse explicando para alguém:
  ler segundos
  horas = segundos / 3600
  resto = segundos % 3600
  minutos = resto / 60
  segundos = resto % 60
Depois que a lógica estiver clara, aí sim você transforma isso em código. Isso ajuda muito o cérebro a entender o processo antes de lidar com a sintaxe da linguagem.
Esse mesmo padrão aparece em muitos exercícios diferentes. Por exemplo:
converter segundos em horas:minutos:segundos
converter dinheiro em cédulas
converter dias em anos, meses e dias
converter metros em km, m e cm
Todos eles usam exatamente a mesma lógica baseada em divisão e resto.
Para fixar de verdade, um treino simples funciona muito bem: pegue alguns números aleatórios e faça o raciocínio mentalmente por alguns minutos. Por exemplo, imagine 5000 segundos e pergunte primeiro quantas horas cabem nesse valor. Depois pense quanto sobra para continuar o cálculo. Fazendo isso algumas vezes seguidas, seu cérebro começa a reconhecer o padrão automaticamente, e esse tipo de exercício passa a ficar cada vez mais natural."

*/
