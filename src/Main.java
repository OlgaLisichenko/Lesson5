import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String message = "\nEnter the task number from 1 to 4. 0 - closing the program.";
        System.out.println(message);
        isScannerHaveInt(message);
        int taskNumber = scanner.nextInt();

        while (taskNumber != 0) {
            switch (taskNumber) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
            }
            System.out.println(message);
            isScannerHaveInt(message);
            taskNumber = scanner.nextInt();
        }
        scanner.close();
    }

    //  1. Создать трехмерный массив из целых чисел.
    //  С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
    //  Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
    public static void task1() {
        System.out.println("--------------- Task 1 ---------------\n");
        String message = "Enter any integer";
        System.out.println(message);
        isScannerHaveInt(message);
        int number = scanner.nextInt();
        int[][][] array3 = new int[3][2][4];
        int counter = 1;

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                for (int k = 0; k < array3[i][j].length; k++) {
                    array3[i][j][k] = counter++;
                }
            }
        }
        System.out.println("Initial array: \n" + Arrays.deepToString(array3));

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                for (int k = 0; k < array3[i][j].length; k++) {
                    array3[i][j][k] += number;
                }
            }
        }
        System.out.println("\nArray after increasing each element by the number " + number + ": \n" +
                Arrays.deepToString(array3));
    }

    //  2. Шахматная доска.
    //  Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String 8х8.
    //  С помощью циклов задать элементам циклам значения B(Black) или W(White).
    public static void task2() {
        System.out.println("--------------- Task 2 ---------------\n");
        String[][] chess = new String[8][8];

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if ((i + j) % 2 != 0) {
                    chess[i][j] = " B ";
                } else {
                    chess[i][j] = " W ";
                }
                System.out.print(chess[i][j]);
            }
            System.out.println();
        }
    }

    //  3. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
    public static void task3() {
        System.out.println("--------------- Task 3 ---------------\n");
        int[][] array = new int[3][2];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomInt(10);
                sum += array[i][j];
            }
        }
        System.out.println("Array: " + Arrays.deepToString(array));
        System.out.println("The sum of all the elements of the array is " + sum);
    }

    //  4. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
    public static void task4() {
        System.out.println("--------------- Task 4 ---------------\n");
        int[][] array = new int[5][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomInt(30);
            }
        }
        System.out.println("Unsorted array: " + Arrays.deepToString(array));

        for (int[] i : array) {
            Arrays.sort(i);
        }
        System.out.println("Sorted   array: " + Arrays.deepToString(array));
    }

    public static void isScannerHaveInt(String message) {
        while (!scanner.hasNextInt()) {
            System.out.println(message);
            scanner.next();
        }
    }

    private static int getRandomInt(int max) {
        return (int) (Math.random() * max);
    }
}