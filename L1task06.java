/*
 * Проверка на соответствие типа данных
 */
import java.util.Scanner;
public class L1task06 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();  // здесь проверка на соответствие типа
        System.out.println(flag);  // вывод результата проверки
        int i = iScanner.nextInt(); // но далее код выводит Exception
        System.out.println(i);
        iScanner.close();
    }

}
