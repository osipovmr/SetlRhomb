public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        printDiamond(height, width);
    }
    private static void printDiamond(int height, int width)   {
        for (int i = -height; i <= height; i++) {
            for (int j = -width; j <= width; j++) {
                if (Math.abs(i) + Math.abs(j) <= height) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}