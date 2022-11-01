import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int numero = input.nextInt();
        int pos = 0;
        for(int i=0;i<elementos.length;i++){
            if(numero==elementos[i]){
                pos = i;
                break;
            }
        }
        if(pos!=0){
            System.out.println("Achei "+numero+" na posicao "+pos);
        }else{
            System.out.println("Numero "+numero+" nao encontrado!");
        }
    }
}