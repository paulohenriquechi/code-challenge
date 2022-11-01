import java.util.Scanner;
// TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
public class Desafio02 {
    public static void main(String[] args) {
        int A, N;
        int r = 0;
        int r2 = 0;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int dados = N/A;
        for(int i=1;i<=dados;i++){
          r=A*i;
          r2=r2+r;
        }
        System.out.println(r2);
        input.close();
    }
}
