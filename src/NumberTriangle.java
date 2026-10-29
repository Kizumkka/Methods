import java.util.Scanner;

public class NumberTriangle {

    public static void printNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size must be positive.");
        } else {
            printNumberTriangle(size);
        }

        sc.close();
    }
}