import java.util.Scanner;
public class Q01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int x = 1;
        for(int i = 0; i<vetor.length; i++){
            System.out.println("informe o "+x+"º valor");  
            vetor[i]= sc.nextInt();
            x = x + 1;
        }
        for (int i = 0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        } 
    }
}

