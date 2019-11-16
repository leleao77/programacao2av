import java.util.Scanner;
public class Q03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[30];
        double x = 0;
        for(int i = 0; i<vetor.length; i++){
            vetor[i] = Math.pow(x, 2);
            x++;
        }
        for(int i = 0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }    
}