import java.util.Scanner;

public class exercicio26RepeticaoDavi {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,multiplicacao;

        System.out.println("Informe um número: ");
        n = in.nextInt();
        System.out.println("Tabuada: ");
        for (int i = 1;i <= n;i++){
            multiplicacao = i * n;
            System.out.println(i+ " * "+n+" = "+multiplicacao);
        }
        in.close();
    }
}
