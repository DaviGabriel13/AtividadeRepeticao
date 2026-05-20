import java.util.Scanner;

public class exercicio14RepeticaoDavi {
    public static void main(String[] args) {
        int n,fatorial;
        fatorial = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        n = in.nextInt();

        for (int i = 1;i <=n;i++){
            fatorial *= i;
        }

        System.out.println("Fatorial: "+fatorial);
    }
}
