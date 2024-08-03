/*
 * Работа с файлами. Пример 2
 */

import java.io.File;

public class L2task04 {
    public static void main(String[] args) {
        // создадим объект file для каталога
        File dir1 = new File("G:\\java_files");
        // создадим объекты для файлов
        //File file1 = new File("G:\\java_files", "Hello.txt");
        //File file2 = new File(dir1, "Hello2.txt");
        if (dir1.isDirectory()) {  // если dir1 каталог, то получим все объекты в этом каталоге
            for (File item : dir1.listFiles()) {  // перечисление объектов каталога в цикле
                if (item.isDirectory()) {  // если объект каталог, 
                    System.out.println(item.getName() + "\t folder");  // то выводим его имя и через табуляцию указываем что это каталог
                }
                else {
                    System.out.println(item.getName() + "\t file");  // иначе выходит, что это файл, выводим его имя и через табуляцию указываем что это файл
                }
            }
        }
    }

}
