import java.util.Scanner;

public class InvertedRightTriangle {

    public static void printInvertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
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
            printInvertedRightTriangle(size);
        }

        sc.close();
    }
}