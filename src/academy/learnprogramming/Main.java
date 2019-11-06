package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntArray0 = new int[10];
        double[] myDoubleArray = new double[10];
        myIntArray0[5] = 50;
        System.out.println(myIntArray0[5]);
//        printArray(myIntArray0);

        int[] myIntArray1 = {1,2,3,4,5};
        System.out.println(myIntArray1[0]);
        System.out.println(myIntArray1[2]);
        System.out.println(myIntArray1[4]);
//        printArray(myIntArray1);

        int[] myIntArray2 = new int[9];
        for(int i = 0; i < myIntArray2.length; i++) {
            myIntArray2[i] = i * 10;
        }
        printArray(myIntArray2);

        int[] myIntegers = getIntegers(5);
        System.out.println("Sum = " + sum(myIntegers));
        System.out.println("Average = " + average(myIntegers));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
//        System.out.println("Sum = " + sum);
    }

    public static double average(int[] array) {
        return sum(array) / array.length;
    }

    public static int[] getIntegers(int num) {
        System.out.println("Enter " + num + " integer values.\r");
        int[] values = new int[num];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
