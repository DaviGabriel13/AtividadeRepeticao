import java.util.Scanner;

public class exercicioRepeticao18Davi {
    static void main(String[] args) {
        int numeroPar = 0,numeroImpar = 0,numero,contPar = 0,contImpar = 0,contTotal = 0,maiorPar = Integer.MIN_VALUE,menorImpar = Integer.MAX_VALUE;
        double mediaPar = 0,mediaImpar = 0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Informe algum número inteiro: (Caso queira sair do loop digita um valor negativo)");
            numero = in.nextInt();
            if(numero < 0){
                break;
            }else{
                if(numero%2 == 0){
                    numeroPar += numero;
                    contPar++;
                    if (numero > maiorPar){
                        maiorPar = numero;
                    }
                }else{
                    numeroImpar += numero;
                    contImpar++;
                    if(numero <menorImpar){
                        menorImpar = numero;
                    }
                }
                contTotal++;


            }

        }while (numero > 0);

        if (contTotal > 0){
            mediaPar = (double) numeroPar/contPar;
            mediaImpar = (double) numeroImpar/contImpar;
            System.out.println("Média par: "+mediaPar);
            System.out.println("Média ímpar: "+mediaImpar);
            System.out.println("Maior número par: "+maiorPar);
            System.out.println("Menor número ímpar: "+menorImpar);

        } else{
            System.out.println("Nenhum número foi anotado. Finalizando...");
        }


    }
}
