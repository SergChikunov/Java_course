/*
 * Работа с файлами. Чтение файла
 * Совместим оба класса и выполним чтение из одного и запись в другой файл
 * Классы FileInputStream и FileOutputStream предназначены прежде всего для записи двоичных файлов, 
 * то есть для записи и чтения байтов. И хотя они также могут использоваться для работы с текстовыми файлами, 
 * но все же для этой задачи больше подходят другие классы.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L1task23 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("notes.txt");  // файл для чтения
                FileOutputStream fos = new FileOutputStream("notes_new.txt")) {  // файл для записи
            byte[] buffer = new byte[256];

            int count;

            while ((count = fin.read(buffer)) != -1) { // считываем буфер

                fos.write(buffer, 0, count); // записываем из буфера в файл
            }
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}
