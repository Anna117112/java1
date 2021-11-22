import java.util.Arrays;

public class Dz3 {
    public static void main(String[] args) {
        array1();
        array2();
        array3();
        array4();
        array5(2, 3);
        array6 ();

        array7( new int[]{1,2,8,6,13,4} );


    }
    // Задание 1
    public static void array1() {
        int array[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int x : array) {
            if (x == 1) {
                x = 0;
            } else {
                x = 1;
            }
            System.out.print(x + " ");
        }
    }

    // Задание 2
    public static void array2() {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length + 1; i++) {
            array2[i] = i + 1;

            System.out.print(array2[i] + " ");


        }

    }

    // Задание 3
    public static void array3() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
            System.out.print(array3[i] + " ");
        }
    }
    // Задание 4

    public static void array4() {
        int[][] array4 = new int[3][3];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                }
                System.out.print(array4[i][j] + " ");

            }
            System.out.println();

        }


    }

    //Задание 5
    public static int[] array5(int len, int initialValue) {
        int[] array5 = new int[len];
        for (int i = 0; i < len; i++) {
            array5[i] = initialValue;

        }
        System.out.println(Arrays.toString(array5));
        return array5;

    }

    // Задание 6
    public static void array6() {
        int[] array6 = {5, 8, 3};
        int a = array6[0];
        for (int i = 0; i < array6.length; i++) {

            if (array6[i] >= a) {
                a = array6[i];
            }
        }

        System.out.println("Максимальный элемент в массиве " + a);
        for (int i = 0; i < array6.length; i++) {

            if (array6[i] <= a) {
                a = array6[i];
            }
        }
        System.out.println("Минимальный элемент в массиве " + a);
    }


    // Задание 7

    public static boolean array7( int [] array) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
       int a = 0;
       boolean x = false;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }

        for (int i = 0; i < array.length; i++) {
            sum1 = sum1 + array[i];
            sum2 = sum - sum1;


            if (sum1 == sum2) {
                a = array[i];
                x = true ;
                System.out.print("На " + a + " элементе сумма левой и правой части массива равна");

            }

        }

          return x;
    }


}












































