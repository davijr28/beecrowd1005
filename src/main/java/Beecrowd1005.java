import java.util.Scanner;
public class Beecrowd1005 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        double A,B,MEDIA;
        
        //ler variáveis
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        
        //calcular a média
        MEDIA = (A*3.5 + B*7.5)/11;
        
        //mostrar resultado no console
        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }
}