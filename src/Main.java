import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! This program draws a rhombus.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {
        for (int i = -height; i <= height; i++) {
            for (int j = -width/2; j <= width/2; j++) {
                if (Math.abs(i) + Math.abs(j) == height/2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}