public class Main {

    public static void main(String...args) {

        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }

        for (int element : array) {
            System.out.println(element);
        }

    }

}
