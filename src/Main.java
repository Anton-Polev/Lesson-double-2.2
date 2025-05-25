import java.util.Arrays;

public class Main {
    public static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 19;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean number(java.util.Scanner scan) {
        System.out.println("Введите число:");
        int num1 = scan.nextInt();
        System.out.println("Введите число:");
        int num2 = scan.nextInt();
        int s = num1 + num2;
        return (s >= 10 && s <= 20);
    }

    public static int number2(java.util.Scanner scan) {
        System.out.println("Введите число:");
        int num = scan.nextInt();
        return num;
    }

    public static void number2(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void stringNum(String text, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(text);
        }
    }

    public static int inputYear(java.util.Scanner scan) {
        System.out.println("Введите год:");
        int num = scan.nextInt();
        return num;
    }

    public static boolean year(int num) {
        return (num % 4 == 0 && num % 100 != 0) || (num % 400 == 0);
    }

    public static void invert(int[] num) {
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                num[i] = 1;
            } else if (num[i] == 1) {
                num[i] = 0;
            }
        }
        System.out.println(Arrays.toString(num));
    }

    public static void fill() {
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++)
            num[i] = i + 1;
        System.out.println(Arrays.toString(num));
    }

    public static void multiply(int[] num) {
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 6) {
                num[i] = num[i] * 2;
            }
        }
        System.out.println(Arrays.toString(num));
    }

    public static void table() {
        int[][] table = new int[8][8];
        int counter = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j] = counter++;
            }
        }
        for (int i = 0; i < 8; i++) {
            table[i][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%3d ", table[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print("[" + val + "]");
        }
        System.out.println();
    }

    public static void printTask(int taskNumber) {
        System.out.println("Задание " + taskNumber);
    }

    public static void printLine() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        printTask(1);
        printTreeWords();
        printLine();

        printTask(2);
        checkSumSign();
        printLine();

        printTask(3);
        printColor();
        printLine();

        printTask(4);
        compareNumbers();
        printLine();

        printTask(5);
        System.out.println(number(scan));
        printLine();

        printTask(6);
        int num = number2(scan);
        number2(num);
        printLine();

        printTask(7);
        System.out.println(number(scan));
        printLine();

        printTask(8);
        System.out.println("Введите строку:");
        scan.nextLine();
        String string = scan.nextLine();
        System.out.println("Сколько раз напечатать ?:");
        int repeat = scan.nextInt();
        stringNum(string, repeat);
        printLine();

        printTask(9);
        int getYear = inputYear(scan);
        System.out.println(year(getYear));
        printLine();

        printTask(10);
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invert(arr);
        printLine();

        printTask(11);
        fill();
        printLine();

        printTask(12);
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiply(arr2);
        printLine();

        printTask(13);
        table();
        printLine();

        printTask(14);
        System.out.println("Введите длину:");
        int len = scan.nextInt();
        System.out.println("Введите значение:");
        int initialValue = scan.nextInt();
        int[] newArray = createArray(len, initialValue);
        printArray(newArray);
        printLine();

        scan.close();
    }
}
