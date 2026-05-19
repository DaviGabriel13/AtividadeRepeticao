public class exercicioRepeticao20Davi {
    static void main(String[] args) {
        double taxaA,taxaB;
        int habitantesA = 500000,habitantesB = 700000, ano = 2015;
        while(habitantesB > habitantesA){
            taxaA = 0.03 * habitantesA;
            habitantesA += Math.floor(taxaA);
            taxaB = 0.02 * habitantesB;
            habitantesB += Math.floor(taxaB);

            ano++;
        }
        System.out.println("O ano que os habitante de A se tornou maior que os habitantes de b foi "+ano);
    }
}
