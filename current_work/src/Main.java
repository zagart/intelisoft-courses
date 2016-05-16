import java.util.Random;

public class Main {

    public static void main(String...args) {

        int x = 8;
        int y = 5;

        Random random = new Random();
        int array[][] = new int[x][y];

        int max = 0;
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 10 + random.nextInt(90);
                if (array[i][j] > max) {
                    max = array[i][j];
                    p1 = i;
                    p2 = j;
                }
                System.out.print(array[i][j] + "; ");
            }
            System.out.println();
        }


        System.out.println("Answer: " + max + " p1 = " + p1 + "; p2 = " + p2 + ";");

    }


}
