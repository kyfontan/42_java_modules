import java.util.Scanner;

public class Program {
    static int i = 2;

    public static boolean isPrime(int n) {
        while (i < n) {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Choose number:");
       int number = Integer.parseInt(sc.nextLine());

       if (number <= 0 || number == 1) {
        throw new IllegalArgumentException();
       } else {
        System.out.println(isPrime(number));
       }
       sc.close();
    }
}
