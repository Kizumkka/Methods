import java.util.Scanner;

public class Pyramid {

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
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
            printPyramid(size);
        }

        sc.close();
    }
}