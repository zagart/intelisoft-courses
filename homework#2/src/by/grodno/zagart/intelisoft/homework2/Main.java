package by.grodno.zagart.intelisoft.homework2;

import java.util.Arrays;
import java.util.Random;

/**
 * Class with entry point of an application.
 */
public class Main {

    private static int[][] array;
    private static Random random = new Random();

    public static void main(String[] args) {

        //Task1();
        //Task2();
        //Task3();
        //Task4();
        Task5();

    }

    private static void Task1() {

        array = new int[8][5];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = 10 + random.nextInt(90);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void Task2() {

        array = new int[5][8];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = -random.nextInt(100) + random.nextInt(100);
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Max value is " + max + ".");
    }

    private static void Task3() {

        array = new int[7][4];
        int max = Integer.MIN_VALUE;
        int indexOfMax = Integer.MIN_VALUE;

        for (int i = 0; i < 7; i++) {
            int localMax = 1;
            for (int j = 0; j < 4; j++) {
                array[i][j] = -random.nextInt(6) + random.nextInt(6);
                localMax *= array[i][j];
                System.out.print(array[i][j] + " ");
            }
            if (Math.abs(localMax) > max) {
                max = Math.abs(localMax);
                indexOfMax = i;
            }
            System.out.println();
        }
        System.out.println("String with maximum required value is " + indexOfMax + ".");
    }

    private static void Task4() {

        array = new int[6][7];

        for (int i = 0; i < 6; i++) {
            int max = Integer.MIN_VALUE;
            int indexOfMax = Integer.MIN_VALUE;
            for (int j = 0; j < 7; j++) {
                array[i][j] = random.nextInt(10);
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexOfMax = j;
                }
                System.out.print(array[i][j] + " ");
            }
            if (indexOfMax > 0) {
                array[i][0] = array[i][0] + array[i][indexOfMax];
                array[i][indexOfMax] = array[i][0] - array[i][indexOfMax];
                array[i][0] = array[i][0] - array[i][indexOfMax];
            }
            System.out.println();
        }
        PrintArray(array);
    }

    private static void Task5() {



    }

    private static void PrintArray(int[][] array) {
        System.out.println();
        for (int[] innerArray : array) {
            for (int element : innerArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
