public class Lesson2 {
    public static void main(String[] args) {
        invertArray();//1 task test

        fillArray();//2 task test

        changeArray();//3 task test

        fillDiagonal();//4 task test

        MinMaxNumber();//5 task test
        int[] array = {0, 1, 2, 3};
        System.out.println(checkBalance(array)); //6 task test
        shiftArray(array, 2);
    }

    //1
    public static void invertArray() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int count = 0; count < array.length; count++) {
            int a = array[count];
            if (a == 0) {
                array[count] = 1;
            }
            if (a == 1) {
                array[count] = 0;
            }

            System.out.print(array[count] + " ");
        }
        System.out.println();
    }


    //2
    public static void fillArray() {
        int[] array = new int[8];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a = a + 3;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //3
    public static void changeArray() {
        int[] ArrayMultiply2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ArrayMultiply2.length; i++) {
            int a = ArrayMultiply2[i];
            if (a < 6) {
                ArrayMultiply2[i] = a * 2;
            }
            System.out.print(ArrayMultiply2[i] + " ");
        }
        System.out.println();
    }

    //4
    public static void fillDiagonal() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][i] = 1;
                array[i][array.length - 1 - i] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //5

    public static void MinMaxNumber() {
        int min = 0;
        int max = 0;
        int[] array = new int[]{2, 3, 6, 8, 1, 5};
        for (int i = 0; i < array.length; i++) {
            int a = i;
            int b = i;
            for (int j = 0; j < array.length; j++) {
                if (a > array[j]) {
                    min = array[j];
                }
                if (b < array[j]) {
                    max = array[j];
                }
            }
        }
        System.out.println("min number : " + min);
        System.out.println("max number : " + max);
    }

    //6
    public static boolean checkBalance(int a[]) {
        int leftpart = 0;
        int rightpart = 0;

        for (int i = 0; i < a.length; i++) {
            if (i > 2) {
                rightpart = rightpart + a[i];
            }
            if (i <= 2) {
                leftpart = leftpart + a[i];
            }
        }
        System.out.print(leftpart + " ");
        System.out.print(rightpart + " ");
        if (leftpart == rightpart) {
            return true;
        }
        return false;
    }

    //7
    public static void shiftArray(int[] array, int n) {


        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int buffer = array[0];
                array[0] = array[array.length - 1];

                for (int j = 1; j < array.length - 1; j++) {
                    array[array.length - j] = array[array.length - j - 1];
                }
                array[1] = buffer;
            }
        } else if (n < 0) {
            for (int i = 0; i > n; n--) {
                int buffer = array[array.length - 1];
                array[array.length - 1] = array[0];

                for (int j = 1; j < array.length - 1; j++) {
                    array[j - 1] = array[j];
                }

                array[array.length - 2] = buffer;
            }

        }

        for (int cell : array) {
            System.out.print(cell + " ");
        }

    }
}
/////%^%$^%^^%@ pull-requst




