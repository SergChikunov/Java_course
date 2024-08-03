/*
 * Работа с файлами, с проверкой
 */

import java.io.File;
import java.io.IOException;
public class L2task06 {
    public static void main(String[] args) {
        // определяем объект для каталога
        File myFile = new File("G:\\Java_files\\notes.txt");
        System.out.println();
        System.out.println("----- Старт работы программы -----");
        System.out.println("Имя файла: " + myFile.getName());
        System.out.println("Имя родительской папки: " + myFile.getParent());
        if(myFile.exists())
            System.out.println("Указанный файл существует!");
        else
            System.out.println("Файл не найден или не существует по указанному пути!");

        System.out.println("Размер файла: " + myFile.length() + " байт.");
        if(myFile.canRead())
            System.out.println("Файл доступен для прочтения");
        else
            System.out.println("Файл не доступен для прочтения");

        if(myFile.canWrite())
            System.out.println("Файл доступен для записи");
        else
            System.out.println("Файл не доступен для записи");

        // создадим новый файл
        System.out.println();
        System.out.println("----- Создание нового файла, с использованием try...catch -----");
        File newFile = new File("G:\\Java_files\\MyFile.txt");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println(newFile + " файл создан");
            else {
                System.out.println("Файл уже существует!");
                if (newFile.length() == 0) {
                    System.out.println(newFile.getName() + " уже имеется в указанном каталоге, но он пуст!");
                }
                else {
                    System.out.println(newFile.getName() + " уже имеется в указанном каталоге, размер файла: " + newFile.length() + " байт.");
                }
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("----- Конец работы программы -----");
        System.out.println();
    }
}
