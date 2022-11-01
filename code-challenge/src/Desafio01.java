import java.util.Scanner;
//TODO: Imprima se os valores numéricos passados são iguais ou não.
public class Desafio01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if(n1==n2){
          System.out.println("Sao iguais!");
        }else{
          System.out.println("Nao sao iguais!");
        }
        input.close();
    }
}
