import java.util.Scanner;

public class exercicioRepeticao16Davi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero,original,digito,octal,contOctal,contHexa,hexa;
        String octalPrint = "",hexaPrint = "",digitoHexa = "";
        boolean binario =true;
        contOctal = 0;
        contHexa = 0;
        octal = 0;
        hexa = 0;

        System.out.println("Informe o valor do numero binario: ");
        numero = in.nextInt();
        original = numero;

        if(numero == 0){
            binario = true;
        }else{
            while(numero > 0){
                digito = numero%10;
                if(digito > 1){
                    binario = false;
                    break;
                }
                octal += (int) (digito * Math.pow(2,contOctal));
                contOctal++;
                hexa += (int) (digito * Math.pow(2,contHexa));
                contHexa++;
                if(contOctal == 3){
                    octalPrint = octal + octalPrint;
                    contOctal = 0;
                    octal = 0;
                }
                if(contHexa == 4){
                    if(hexa == 10){
                        digitoHexa = "A";
                    } else if (hexa == 11) {
                        digitoHexa = "B";
                    } else if (hexa == 12) {
                        digitoHexa = "C";
                    } else if (hexa == 13 ) {
                        digitoHexa = "D";
                    } else if (hexa == 14) {
                        digitoHexa = "E";
                    }else if(hexa == 15){
                        digitoHexa = "F";
                    }
                    hexaPrint = digitoHexa + hexaPrint;
                    contHexa = 0;
                    hexa = 0;

                }

                //testando commit

                numero = numero/10;
            }
        }

        if (binario){
            System.out.println("É binário");
            if (contOctal > 0){
                octalPrint = octal + octalPrint;
            }
            if (contHexa > 0){

                if(hexa == 10){
                    digitoHexa = "A";
                } else if (hexa == 11) {
                    digitoHexa = "B";
                } else if (hexa == 12) {
                    digitoHexa = "C";
                } else if (hexa == 13 ) {
                    digitoHexa = "D";
                } else if (hexa == 14) {
                    digitoHexa = "E";
                }else if(hexa == 15){
                    digitoHexa = "F";
                }
                hexaPrint = digitoHexa + hexaPrint;
            }
            System.out.println("Octal: "+octalPrint);
            System.out.println("Hexadecimal: "+hexaPrint);
        }else {
            System.out.println("Não é binário");
        }

    }
}
