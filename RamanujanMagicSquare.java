import java.util.Scanner;

public class RamanujanMagicSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Ramanujan Birthday Magic Square Generator ---");

        System.out.print("Enter Day (DD): ");
        int A = sc.nextInt();

        System.out.print("Enter Month (MM): ");
        int B = sc.nextInt();

        System.out.print("Enter Century (CC): ");
        int C = sc.nextInt();

        System.out.print("Enter Year (YY): ");
        int D = sc.nextInt();

        int magicNumber = A + B + C + D;

        int[][] square = {
            {A, B, C, D},
            {D + 1, C - 1, B - 3, A + 3},
            {B - 2, A + 2, D + 2, C - 2},
            {C + 1, D - 1, A + 1, B - 1}
        };

        System.out.println("\nYour Birthday Magic Square:");
        System.out.println("-----------------------------");

        for (int[] row : square) {
            for (int value : row) {
                System.out.printf("%5d", value);
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        System.out.println("Magic Number: " + magicNumber);

        sc.close();
    }
}