import java.util.Scanner;
public class Q02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int x = 1;
        for(int i =0; i<vetor.length; i++){
            System.out.println("informe o " +x+ "º numero");
            vetor[1] = sc.nextInt();
            x++;
        }
        int maior = 0;
        for(int i =0; i<vetor.length; i++){
           if(vetor[i] > maior){
               maior = vetor[i];
           }
        }
        System.out.println("O maior número digitado é igual a "+maior+"!");
    }
}