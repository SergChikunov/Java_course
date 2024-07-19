/*
 * arrays
 */
public class L1task04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr[6]);

        arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(arr); // фигня какая-то
        System.out.println(arr.length); // 9
        System.out.println(arr[8]);

        // двумерные массивы
        int[][] arr02 = new int[3][5];
        for (int i = 0; i < arr02.length; i++) {
            for (int j = 0; j < arr02[i].length; j++) {
                System.out.printf("%d ", arr02[i][j]);
            }
            System.out.println();
        }
        // нельзя без преобразований положить массив целых чисел в массив double (!!!)
    }

}
