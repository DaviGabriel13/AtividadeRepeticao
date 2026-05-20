import java.util.Scanner;

public class exercicio13RepeticaoDavi {
    public static void main(String[] args) {
        int n;
        boolean primo;
        primo = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero inteiro positivo: ");
        n = in.nextInt();
        if(n == 1){
            primo = true;
        }
        for(int i = 2; i <=n;i++){
            if(n%i == 0 &&  i != n){
                primo = false;
                break;
            }else{
                primo = true;
            }
        }

        if (primo){
            System.out.println("É primo");
        }else{
            System.out.println("Não é primo");
        }

    }
}
