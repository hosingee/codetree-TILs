import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        
        for (int div = 1; ; div++) {
            int result = n / div;
            count++;

            if (result <= 1) {
                break;
            }

            n = result;
        }

        System.out.print(count);
    }
}