import java.util.Scanner;

public class Program {
    static int prime = 0;

    public static int addSeq(String seq) {
        int res = 0;
        int i = 0;

        while (i < seq.length()) {
            res += Integer.valueOf(seq.charAt(i) - '0');
            i++;
        }
        return (res);
    }


    public static boolean isPrime(int n) {
        int i = 2;
        while (i < n) {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("-> ");
            String line = sc.nextLine();

            if (Integer.valueOf(line) == 42)
                break ;
            int res = addSeq(line);
            if (isPrime(res))
                prime++;

        }
        System.out.println("Count of coffee-request - " + prime);
        sc.close();
    }
}
