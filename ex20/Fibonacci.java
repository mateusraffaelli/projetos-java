package ex20;


public class Fibonacci {
    public static void main(String[] args) {
        
        int a = 2;
        int b = 1;
        int i = 0;

        // Sequencia de Fibonacci
        while (i < 199) {
            i = a + b;
            a = b;
            b = i;
            System.out.println(i);  
        }
    }
}
