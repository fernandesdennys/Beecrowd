import java.util.Scanner;

public class omaior {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();

        int MaiorAB = (A + B + Math.abs(A - B)) / 2;
        int Maior = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;

        System.out.println(Maior + " eh o maior");

        entrada.close();
    }
}