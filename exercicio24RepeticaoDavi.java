import java.util.Scanner;

public class exercicio24RepeticaoDavi {
    static void main(String[] args) {
        int a,b,restoFinal,resto,quociente = 0;

        Scanner in = new Scanner(System.in);


        System.out.println("Informe o valor inteiro de A:");
        a = in.nextInt();

        System.out.println("Informe o valor inteiro de B:");
        b = in.nextInt();
        if(a> b){
            resto = a - b;
            quociente++;
            while(resto >= b){
                resto = resto - b;
                quociente++;
            }
            System.out.println("Resto: "+resto);
            System.out.println("Quociente: "+quociente);
        }else{
            System.out.println("Não é possivel fazer a divisão de inteiros em que o primeiro número seja maior que segundo");
        }




    }
}
