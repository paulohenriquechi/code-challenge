import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int r = somatorio(numero);
        System.out.println(r);
        input.close();
    }
    
    public static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
