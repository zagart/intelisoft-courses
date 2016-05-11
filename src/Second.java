/**
 * Created by USER on 11.05.2016.
 */
public class Second {

    public static void main(String...args) {

        int dim = 5;

        for (int i = dim; i > 0; i--) {
            for (int j = dim; j > 0; j--) {
                if (i == (dim - j + 1)) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }

}
