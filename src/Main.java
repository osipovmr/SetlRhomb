import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! This program draws a hollow rhombus.");
        Scanner scanner = new Scanner(System.in);
        int height = 0;
        int width = 0;

        System.out.print("Enter height from 1 to 80: ");
        while ((height = scanner.nextInt()) < 1 || height > 80) {
            System.out.print("Wrong! Enter height from 1 to 80: ");
        }
        System.out.println("Height = " + height);
        System.out.print("Enter width from 1 to 80: ");
        while ((width = scanner.nextInt()) < 1 || width > 80) {
            System.out.print("Wrong! Enter width from 1 to 80: ");
        }
        System.out.println("Width = " + width);
        scanner.close();
        printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 1; i < width + 1; i++) {
            ints.add(i);
        }
        int middle = ints.size() / 2;
        int core = 0;
        if (ints.size() % 2 == 0) {
            core = ((ints.get(middle - 1) + ints.get(middle)) / 2);
        } else {
            core = ints.get(middle);
        }
        System.out.println(core);

        for (int i = 1; i < height + 1; i++) {
            for (int j = 1; j < width + 1; j++) {
                if ((j == core) && ((i == 1) || (i == height)) ) {   //top and floor
                    System.out.print("#");
                } else if ((i + j == core + 1) && (i != 1) && (i != height) && (j != core)) {    //top left
                    System.out.print("#");
                }
                else if ((i - j == core - width) && (i != 1) && (i != height) && (j != core)) { //top right
                    System.out.print("#");
                }
                else if ((i - j == core - 1) && (i != 1) && (i != height) && (j != core)) {    //floor left
                    System.out.print("#");
                }
                else if ((i + j == core + width) && (i != 1) && (i != height) && (j != core)) {  //floor right
                    System.out.print("#");
                }
                else if ((Math.abs(height - width) > 2) && (Math.abs(i - core) >= 1) && (j != core) && (i != 1) && (i != height))
                    System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}