import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mul = ((a + c - 1) / c) * c;

        if (mul > b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}