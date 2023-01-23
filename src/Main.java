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
            int left = 0;
            int right = 0;
            for (int j = 1; j < width + 1; j++) {

                if ((j == core) && ((i == 1) || (i == height))) {   //top and floor
                    System.out.print("#");
                } else if ((i + j == core + 1) && (i != 1) && (i != height) && (j != core) && (left < 2)) {    //top left
                    System.out.print("#");
                    if (j < core) left = left + 1; else right = right + 1;
                } else if ((i - j == core - width) && (i != 1) && (i != height) && (j != core) && (right < 2)) { //top right
                    System.out.print("#");
                    if (j < core) left = left + 1; else right = right + 1;
                } else if ((i - j == core - 1) && (i != 1) && (i != height) && (j != core) && (left < 2)) {    //floor left
                    System.out.print("#");
                    if (j < core) left = left + 1; else right = right + 1;
                } else if ((i + j == core + width) && (i != 1) && (i != height) && (j != core) && (right < 2)) {  //floor right
                    System.out.print("#");
                    if (j < core) left = left + 1; else right = right + 1;
                } else if ((Math.abs(height - width) > 2) && (Math.abs(i - core) >= 1) && (j != core) && (i != 1) && (i != height) && (j == 1 || j == width) && ((left < 1) || (right < 1)) && (left + right < 2)) {
                    System.out.print("#");
                    if (j < core) left = left + 1; else right = right + 1;

                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}