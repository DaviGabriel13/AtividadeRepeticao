import java.util.Scanner;

public class exercicio27RepeticaoDavi {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int altura;
        System.out.println("Informe a altura do triângulo: ");
        altura = in.nextInt();

        for (int i = 1; i<=altura;i++){
            for(int j = 1; j <= i;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
