import java.util.Scanner;

public class exercicioRepeticao17Davi {
    static void main(String[] args) {
        int comando;
        double numero1,numero2,calculo;
        Scanner in = new Scanner(System.in);
        comando = 0;
        do{
            System.out.println("====================");
            System.out.println("Calculadora do Davi");
            System.out.println("====================");
            System.out.println("Opções: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.println("====================");
            System.out.println("Informe a opção: ");
            comando = in.nextInt();

            switch (comando){
                case 1:
                    System.out.println("Informe o primeiro numero:");
                    numero1 = in.nextDouble();
                    System.out.println("Informe o segundo numero:");
                    numero2 = in.nextDouble();
                    calculo = numero1 + numero2;
                    System.out.println("Resultado = "+calculo);
                    break;
                case 2:
                    System.out.println("Informe o primeiro numero:");
                    numero1 = in.nextDouble();
                    System.out.println("Informe o segundo numero:");
                    numero2 = in.nextDouble();
                    calculo = numero1 - numero2;
                    System.out.println("Resultado = "+calculo);
                    break;
                case 3:
                    System.out.println("Informe o primeiro numero:");
                    numero1 = in.nextDouble();
                    System.out.println("Informe o segundo numero:");
                    numero2 = in.nextDouble();
                    calculo = numero1 * numero2;
                    System.out.println("Resultado = "+calculo);
                    break;
                case 4:
                    System.out.println("Informe o primeiro numero:");
                    numero1 = in.nextDouble();
                    System.out.println("Informe o segundo numero:");
                    numero2 = in.nextDouble();
                    calculo = numero1 / numero2;
                    System.out.println("Resultado = "+calculo);
                    break;
                case 5:
                    System.out.println("Finalizando...");
                    break;
            }
        }while(comando != 5);
    }

}
