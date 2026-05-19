import java.util.Scanner;
public class exercicio23RepeticaoDavi {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        double xGraus, xRad, seno = 0;
        int sinal = 1;

        System.out.print("Digite o valor de X em graus: ");
        xGraus = in.nextDouble();


        xRad = Math.toRadians(xGraus);


        for (int i = 0; i < 15; i++) {

            int expoente = 2 * i + 1;

            double termo = Math.pow(xRad, expoente) / fatorial(expoente);

            seno += sinal * termo;

            sinal *= -1;
        }

        System.out.println("Seno aproximado de X = " + seno);

        in.close();
    }

    public static double fatorial(int n) {

        double fat = 1;

        for (int i = 1; i <= n; i++) {
            fat *= i;
        }

        return fat;
    }
}
