/*
 * Оператор выбора switch
 * Плюс демонстрация множественного выбора
 */
import java.util.Scanner;
public class L1task12 {
    public static void main(String[] args) {
        //int value = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("input int from 1 to 12: ");
        int value = iScanner.nextInt();
        iScanner.close();
        String text = "";
        switch (value) {
            case 1:
            case 2:
                text = "Is Winter";
                break;
            case 3:
            case 4:
            case 5:
                text = "Is Spring";
                break;
            case 6:
            case 7:
            case 8:
                text = "Is Summer";
                break;
            case 9:
            case 10:
            case 11:
                text = "Is Autumn";
                break;
            case 12:
                text = "Is Winter";
                break;
            default:
                System.out.println("Uncorrect input!");
                break;
        }
        System.out.println(text);
    }
}
