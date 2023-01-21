import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        scanner.close();
        printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == width/2 - i || j == width/2 + i || i == height/2 - j || i == height/2 + j || j == width/2 || i == height/2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

