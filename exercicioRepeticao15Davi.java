import java.util.Scanner;

public class exercicioRepeticao15Davi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n,a,b,proximo;
        a = 0;
        b= 1;
        System.out.println("Informe a quantidade de numeros do fibonnaci: ");
        n = in.nextInt();
        for (int i = 0;i <=n;i++){
            if(a == 0){
                proximo = a + b;
                a = b;
                b = proximo;
            }else{
                System.out.println(a);
                proximo = a + b;
                a = b;
                b = proximo;
            }


        }
    }
}
