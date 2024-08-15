import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0 && num % 3 == 0) {
                count += num;
            }
        }

        System.out.print(count);
    }
}