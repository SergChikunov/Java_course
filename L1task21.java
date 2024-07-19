
/*
 * Работа с файлами. Чтение файла
 * Для считывания данных из файла предназначен класс FileInputStream, который является 
 * наследником класса InputStream и поэтому реализует все его методы.
 * Для создания объекта FileInputStream мы можем использовать наиболее используемую версию конструктора,
 * которая в качестве параметра принимает путь к считываемому файлу:
 * FileInputStream(String fileName) throws FileNotFoundException
 * Если файл не может быть открыт, например, по указанному пути такого файла не существует, то генерируется 
 * исключение FileNotFoundException.
 */
import java.io.FileInputStream;
import java.io.IOException;

public class L1task21 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("notes.txt")) { // fin - экземпляр класса FileInputStream
            int i;
            while ((i = fin.read()) != -1) { // В данном случае мы считываем каждый отдельный байт в переменную i

                System.out.print((char) i); // Затем каждый считанный байт конвертируется в объект типа char и выводится
                                            // на консоль.
            }
        } catch (IOException ex) { // если что-то пошло не так, то обработаем исключение по ошибке ввода-вывода

            System.out.println(ex.getMessage());
        }
    }

}
