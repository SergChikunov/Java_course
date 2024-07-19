/*
 * Сокращенная форма условного оператора
 */

package Lesson01;

public class L1task10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b)
            c = a;
        if (b > a)
            c = b;
        System.out.println(c);
    }
}
