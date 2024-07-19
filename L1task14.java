/*
 * Параметры переменной длины в методах и работа с ними
 */
public class L1task14 {
    public static void main(String[] args) {
        sum(1, 2, 3);           // 6  передаем массивы в качестве аргументов при вызове метода
        sum(1, 2, 3, 4, 5);     // 15
        sum();                          // 0
        sumMore("Welcome!", 20,10);  // при передаче агрументов указываем обязательные и один или несколько необязательных
        sumMore("Hello World!");            // или вообще не указываем необязательных!!!
    }

    static void sum(int... nums) {  // объявление метода с параметрами переменной длины (означает, что по факту будет передан массив)

        int result = 0;
        for (int n : nums)  // перебор элементов массива, цикл здесь аналог foreach
            result += n;
        System.out.println(result);
    }

    static void sumMore(String message, int ...nums){  // если метод объявлен с несколькими параметрами, включая необязательные, то они должны быть указаны последними

        System.out.println(message);
        int result = 0;
        for(int x : nums)   // перебор элементов массива, цикл здесь аналог foreach
            result += x;
        System.out.println(result);
    }
}
