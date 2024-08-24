import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] grades = new double[n];

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }

        double average = sum / n;

        System.out.printf("%.1f\n", Math.round(average * 10) / 10.0);

        if (average >= 4.0) {
            System.out.println("Perfect");
        } else if (average >= 3.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}