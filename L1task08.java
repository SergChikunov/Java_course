/*
 * Функции или методы (!!!)
 * Можно содать какой-то свой файл с модулями и по мере необходимости обращаться к какому-то из модулей
 * в лекции первого урока это есть
 */
public class L1task08 {
    static void sayHi() { // объявление функции
        System.out.println("hi!");
    }

    static int sum(int a, int b) { // объявление функции
        return a + b;
    }

    static double factor(int n) { // объявление функции с рекурсией
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    public static void main(String[] args) { // основной блок
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }
}
