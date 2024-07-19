/*
 * Получение данных из терминала, ввод данных!
 */
import java.util.Scanner; // импорт модуля считывания из консоли
public class L1task05 {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in); // переменная iScanner или экземпляр класса Scanner
        // System.out.printf("name: ");        // приглашение на ввод данных
        // String name = iScanner.nextLine();         // считывание строки, именно СТРОКИ!!!
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();  // закрытие объекта Scanner

        // считывание чисел из консоли
        Scanner iScanner02 = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner02.nextInt();
        System.out.printf("double a: ");
        double y = iScanner02.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner02.close();
    }

}
