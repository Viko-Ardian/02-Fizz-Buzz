import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int angka;
        Scanner userInput = new Scanner(System.in);

        System.out.print("masukkan nilai : ");
        angka = userInput.nextInt();

        fizzBuzz(angka);

    }

    public static void fizzBuzz(int angka) {
        
        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
