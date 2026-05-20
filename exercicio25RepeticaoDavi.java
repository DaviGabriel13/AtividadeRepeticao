import java.util.Scanner;

public class exercicio25RepeticaoDavi {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero,divisor,somador =0;
        System.out.println("Informe um número: ");
        numero = in.nextInt();

        if (numero%2 == 0){
            divisor = numero/2;
            for (int i = 1;i <= divisor;i++){
                if(numero%i==0){
                    somador += i;
                }
            }
            if (somador == numero){
                System.out.println("Número perfeito");
            }else{
                System.out.println("Não é número perfeito");
            }
        }else{
            System.out.println("Não é número perfeito");
        }
    }
}
