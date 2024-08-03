/*
 * Чтение и запись двоичных файлов в Java
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class L2task07 {
    public static void main(String[] args) {
        try {
            System.out.println("----- Старт работы программы -----");
            System.out.println();
            System.out.println("----- Запись двоичного файла -----");
            OutputStream Stream = new FileOutputStream("data.bin");  // создаем переменную (экземпляр класса) потоковой записи в файл
            Stream.write(new byte[] { 0x48, 0x65, 0x6C, 0x6C, 0x6F });  // из массива записываем двоичные данные в hex-виде
            File myFile = new File("data.bin");  // проверяем существование файла и его размер
            if (myFile.exists() && myFile.length() != 0) {
                System.out.println("Данные в файл внесены успешно!");
            }
            Stream.close(); // закрываем потоковую запись, для предотвращения утечки ресурсов

            System.out.println();
            System.out.println("----- Чтение двоичного файла -----");
            InputStream inputStream = new FileInputStream("data.bin");  // создаем переменную (экземпляр класса) потокового чтения из файла

            int data;  // вспомогательная переменная для цикла

            while ((data = inputStream.read()) != -1) {  // считываем данные в цикле, пока не получим значение раное -1
                System.out.print((char) data);  // Вывод считанного на экран, hex-представление сконвертировано в char
            }
            inputStream.close();  // закрываем поток чтения файла
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
