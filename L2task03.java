/*
 * Работа с файлами. Пример 1
 */

import java.io.File;

public class L2task03 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");  // указание получить текущий каталог проекта (!!!)
        String pathFile = pathProject.concat("\\my_file.txt"); // имя файла (это не его создание)
        File f3 = new File(pathFile);  // переменная для имени файла
        System.out.println();
        System.out.println("--------------------");
        System.out.println(f3.getAbsolutePath()); // получение абсолютного пути к файлу
        System.out.println("--------------------");
        System.out.println();
    }
}
