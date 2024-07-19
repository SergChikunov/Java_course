
/*
 * Работа с файлами. Чтение файла
 * Можно считать данные в массив байтов и затем производить с ним манипуляции
 */
import java.io.FileInputStream;
import java.io.IOException;

public class L1task22 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("notes.txt")) { // fin - экземпляр класса FileInputStream
            byte[] buffer = new byte[256]; // массив buffer со значениями byte, длиной 256 байт
            System.out.println("File data:");

            int count;
            // Поскольку файл может быть больше 256 байтов, то считываем в цикле while до
            // конца файла. Когда больше не останется данных для считывания, то метод
            // возвратит -1.
            while ((count = fin.read(buffer)) != -1) {

                // Поскольку количество считанных байтов/размер файла могут быть меньше 256
                // байт, то реальное количество считанных байт сохраняем в переменную count.
                // Затем выводим считанное количество данных на консоль в цикле for.
                for (int i = 0; i < count; i++) { // организуем цикл для вывода символов из буфера

                    System.out.print((char) buffer[i]); // выводим каждый символ буфера в виде char
                }
            }
        } catch (IOException ex) { // если что-то пошло не так, то обработаем исключение по ошибке ввода-вывода

            System.out.println(ex.getMessage());
        }
    }
}
