/*
 * Работа с файлами
 * Для создания объекта FileOutputStream используется конструктор, принимающий в качестве параметра 
 * путь к файлу для записи. Если такого файла нет, то он автоматически создается при записи. 
 * Так как здесь записываем строку, то ее надо сначала перевести в массив байтов. 
 * И с помощью метода write строка записывается в файл. 
 * Для автоматического закрытия файла и освобождения ресурса объект FileOutputStream создается с 
 * помощью конструктции try...catch.
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class L1task20 {
    public static void main(String[] args) {
        String text = "Hello world! I'm here with you!"; // строка для записи
        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {

            byte[] buffer = text.getBytes(); // перевод строки в байты

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}
