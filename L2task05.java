/*
 * Работа с файлами. Пример 3.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class L2task05 {
    public static void main(String[] args) {
        System.out.println("----- There is program start -----");
        String line = "Yeah, it's my first row!";
        try {
            String pathProject = System.getProperty("user.dir");  // указание получить текущий каталог проекта (!!!)
            String pathFile = pathProject.concat("\\my_file.txt"); // имя файла (это не его создание)
            File file3 = new File(pathFile);  // переменная для имени файла
            if (file3.createNewFile()) {
                System.out.println("file.created");  // создание файла, если он не существует
            }
            else {
                BufferedReader bufReader = new BufferedReader(new FileReader(file3));  // буфер потокового чтения файла
                System.out.println("file.existed");
                line = bufReader.readLine();  // строке присваиваем считанное из файла
                bufReader.close();  // закрываем буфер чтения, чтобы предотвратить утечку ресурсов
            }
        }
        catch (Exception e) {
            System.out.println("Booom!!! Something bad happened...");
        }
        finally {
            System.out.println("finally section, optional, always run last");
            System.out.println(line);  // вывод в консоль считанного из файла
        }
        System.out.println("----- There is program end -----");
    }

}
