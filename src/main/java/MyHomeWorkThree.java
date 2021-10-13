import java.util.Arrays;

public class MyHomeWorkThree {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        invertArray(arr);
        System.out.println(Arrays.toString(arr));

        int[] ints = new int[100];
        System.out.println(Arrays.toString(ints));
        fillArray(ints);
        System.out.println(Arrays.toString(ints));

        int[] more = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(more));
        numbersMore(more);
        System.out.println(Arrays.toString(more));

        int[][] arrs = new int[3][3];
        System.out.println(arrs[0][0]);
        System.out.println(arrs[0][1]);
        System.out.println(arrs[0][2]);
        System.out.println(arrs[1][0]);
        System.out.println(arrs[1][1]);
        System.out.println(arrs[1][2]);
        System.out.println(arrs[2][0]);
        System.out.println(arrs[2][1]);
        System.out.println(arrs[2][2]);


        int[] falseArray = createAndFalseArray(10; 5 );
    }

    //  1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    //  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }

    }

    //  2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    //  значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }
    }

    //  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    //  и числа меньшие 6 умножить на 2;
    public static void numbersMore(int[] more) {
        for (int i = 0; i < more.length; i++) {
            if (more[i] < 6) {
                more[i] = more[i] * 2;
            }
        }
    }


    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы
    // таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void twoArray(int[][] arrs) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            }
        }
    }

    //  5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
    //  одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] createAndFalseArray(int len; int initialValue) {
        int[] myInts = new int[len];
        System.out.println(Arrays.toString(myInts));
        falseArray(myInts, initialValue);
        return myInts;
    }


    public static void falseArray(int[] numbers; int initialValue) {
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            numbers[i] = initialValue;
        }
    }

    //  6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    //  7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    //  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
    //  части массива равны.
//**Примеры:
    //  checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    //   checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

    //  граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

    //  8. *** Написать метод, которому на вход подается одномерный массив и число n
    //  (может быть положительным, или отрицательным), при этом метод должен сместить все элементы
    //  массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
    //  вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) ->
    //  [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    //  При каком n в какую сторону сдвиг можете выбирать сами.

}
