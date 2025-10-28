package ex24;

public class ArrayMaior {
    public static void main(String[] args) {
        double[] n1 = new double[10];
            n1[0] = 3.7;
            n1[1] = 5.2; 
            // ...
            n1[9] = 7;
                
        double n2[ ] = {0,1,2,3,4,5,6,7,8,9};

        double maior = n2[0]; //Maior elemento
        for (int i = 1; i < 10; i++) {
            if (n2[i] > maior) {
                maior = n2[i];
            }
        }
    }

}
