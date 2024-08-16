import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isComposite = false;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }

        if (isComposite == true) {
            System.out.println("C");
        } else {
            System.out.println("N");
        }
    }
}