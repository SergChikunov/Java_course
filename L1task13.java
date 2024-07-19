/*
 *  Циклы и массивы
 */

public class L1task13 {
    public static void main(String[] args) {
        int[][] nums = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) { // вот момент j < nums[i].length стоит отметить особо
                        // получается, что i обрабатывает массивы строк (их три), а j - значения этих массивов
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }

}
