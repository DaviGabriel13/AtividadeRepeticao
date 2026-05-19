public class exercicio22RepeticaoDavi {
    public static void main(String[] args) {
            double s = 1,pi,divisor;

        for (int i = 1;i <=51;i++ ){
            divisor = i + 2;
            if (i%2 == 0){
                s+= 1/(Math.pow(divisor,3));
            }else{
                s -= 1/(Math.pow(divisor,3));
            }

        }
        pi = Math.cbrt(s*32);
        System.out.println("PI: "+pi);
    }
}
