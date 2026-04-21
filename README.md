# Ramanujan-Magic-Square 
//First Project using java 

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

        // Calculate the Magic Number
        int magicNumber = A + B + C + D;

        // Generate the Square rows based on Ramanujan's formula
        int[][] square = {
            {A, B, C, D},
            {D + 1, C - 1, B - 3, A + 3},
            {B - 2, A + 2, D + 2, C - 2},
            {C + 1, D - 1, A + 1, B - 1}
        };

        // Output the Result
        System.out.println("\nYour Birthday Magic Square:");
        System.out.println("-----------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d  ", square[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.println("The Magic Number is: " + magicNumber);
        
        sc.close();
    }
}
