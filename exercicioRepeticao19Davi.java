import java.util.Scanner;

public class exercicioRepeticao19Davi {
    static void main(String[] args) {
        String formatacao;
        boolean palindromo = true;
        int numero,inicio,fim;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o número: ");
        numero = in.nextInt();
        formatacao = String.valueOf(numero);
        inicio = 0;
        fim = formatacao.length() - 1;

        while (inicio < fim){
            if(formatacao.charAt(inicio) != formatacao.charAt(fim)){
                palindromo = false;
            }
            inicio++;
            fim--;
        }

        if (palindromo){
            System.out.println("É palindromo");
        }else{
            System.out.println("Não é palindromo");
        }

    }
}
