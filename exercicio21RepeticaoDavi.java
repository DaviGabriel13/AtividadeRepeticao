import java.util.Scanner;

public class exercicio21RepeticaoDavi {
    public static void main(String[] args) {
        int codigo,identificador,contResidencial = 0,contComercial = 0;
        double  quantidadeKwh,precoResidencial = 0.3,precoComercial = 0.5,precoIndustrial = 0.7,media1,media2,totalConsumidor = 0,totalResidencial = 0,totalComercial = 0,totalIndustrial = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o numero do consumidor: (Para sair do loop digite 0)");
        identificador = in.nextInt();
        if (identificador == 0){
            System.out.println("Finalizando...");
            in.close();
        }else{
            System.out.println("Informe a quantidade consumida por kWh: ");
            quantidadeKwh = in.nextDouble();
            System.out.println("Informe o codigo de consumidor: ");
            codigo = in.nextInt();

            if(codigo != 1 && codigo != 2 && codigo != 3){
                System.out.println("Código inválido");
                in.close();
            }else{
                switch (codigo){
                    case 1:
                        totalConsumidor = quantidadeKwh * precoResidencial;
                        totalResidencial += totalConsumidor;
                        contResidencial++;
                        System.out.println("O valor a ser pago pelo consumidor: R$"+totalConsumidor);
                        break;
                    case 2:
                        totalConsumidor = quantidadeKwh * precoComercial;
                        totalComercial += totalConsumidor;
                        contComercial++;
                        System.out.println("O valor a ser pago pelo consumidor: R$"+totalConsumidor);
                        break;
                    case 3:
                        totalConsumidor = quantidadeKwh * precoIndustrial;
                        totalIndustrial += totalConsumidor;

                        System.out.println("O valor a ser pago pelo consumidor: R$"+totalConsumidor);
                        break;
                }
            }

            while(identificador != 0){
                System.out.println("Informe o numero do consumidor: (Para sair do loop digite 0)");
                identificador = in.nextInt();
                if (identificador == 0){
                    System.out.println("Finalizando...");
                    in.close();
                }else{
                    System.out.println("Informe a quantidade consumida por kWh: ");
                    quantidadeKwh = in.nextDouble();
                    System.out.println("Informe o codigo de consumidor: ");
                    codigo = in.nextInt();

                    if(codigo != 1 && codigo != 2 && codigo != 3){
                        System.out.println("Código inválido");
                        in.close();
                    }else{
                        switch (codigo){
                            case 1:
                                totalConsumidor = quantidadeKwh * precoResidencial;
                                totalResidencial += totalConsumidor;
                                contResidencial++;
                                System.out.println("O valor a ser pago pelo consumidor: R$"+totalConsumidor);
                                break;
                            case 2:
                                totalConsumidor = quantidadeKwh * precoComercial;
                                totalComercial += totalConsumidor;
                                contComercial++;
                                System.out.println("O valor a ser pago pelo consumidor: R$"+totalConsumidor);
                                break;
                            case 3:
                                totalConsumidor = quantidadeKwh * precoIndustrial;
                                totalIndustrial += totalConsumidor;

                                System.out.println("O valor a ser pago pelo consumidor: R$"+totalConsumidor);
                                break;
                        }
                    }
                }
            }
            media1 = totalResidencial/contResidencial;
            media2 = totalComercial/contComercial;

            System.out.println("O total de gasto para o tipo 1: R$"+totalResidencial);
            System.out.println("O total de gasto para o tipo 2: R$"+totalComercial);
            System.out.println("O total de gasto para o tipo 2: R$"+totalIndustrial);
            System.out.println("Media do tipo 1: "+media1);
            System.out.println("Media do tipo 2: "+media2);

        }
    }
}