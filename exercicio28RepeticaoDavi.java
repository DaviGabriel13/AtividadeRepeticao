import java.util.Scanner;

public class exercicio28RepeticaoDavi {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int voto,totalVotos1 = 0,totalVotos2 = 0,totalVotos3 = 0,totalVotos4 = 0,totalVotosNulo = 0,totalVotosBranco = 0;

        do{
            System.out.println("Informe o seu voto: (Digite 0 para sair do loop)");
            voto = in.nextInt();

            switch (voto){
                case 0:
                    System.out.println("Finalizando...");
                    break;
                case 1:
                    totalVotos1++;
                    break;
                case 2:
                    totalVotos2++;
                    break;
                case 3:
                    totalVotos3++;
                    break;
                case 4:
                    totalVotos4++;
                    break;
                case 5:
                    totalVotosBranco++;
                    break;
                default:
                    totalVotosNulo++;
                    break;
            }
        }while (voto != 0);
        System.out.println("Total de votos de 1: "+totalVotos1);
        System.out.println("Total de votos de 2: "+totalVotos2);
        System.out.println("Total de votos de 3: "+totalVotos3);
        System.out.println("Total de votos de 4: "+totalVotos4);
        System.out.println("Total de votos em branco: "+totalVotosBranco);
        System.out.println("Total de votos nulos: "+totalVotosNulo);
    }
}
