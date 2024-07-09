import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double result = 0.0 ;
        System.out.print("n  sayi giriniz: ");
        n = input.nextInt();
        for(double i= 1;i<=n;i++){
            result +=(1/i);
        }

        System.out.println(result);

    }
}