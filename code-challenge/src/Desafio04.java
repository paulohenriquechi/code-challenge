import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%3==0&&n%5==0){
            System.out.println("FizzBuzz");
        }
        else if(n%3==0){
            System.out.println("Fizz");
        }
        else if(n%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(n);
        }
        input.close();
    }
}
