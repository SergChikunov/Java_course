/*
 * Работа со строками, классы StringBuffer и StringBuilder
 * При этом класс StringBuffer в большей степени предназначен для работы в многопоточных средах
 * А класс StringBuilder в однопоточных, в остальном оба класса идентичны
 */
public class L2task01 {
    public static void main(String[] args) {
        String str = "Java";  // как видно, длина строки 4 символа
        StringBuilder strBuild = new StringBuilder(str);  // конструктор без параметров резервирует в памяти место для 16 символов
        System.out.println("Емкость: " + strBuild.capacity()); // выходит 4 + 16 = 20 для стольки символов конструктор определил память
        strBuild.ensureCapacity(32);  // увеличим место в памяти до 32 символов, тогда 4 + 32 = 36
        System.out.println("Емкость: " + strBuild.capacity()); // 42 - тем не менее, java выделила память для 42 символов, в целях эффективной работф
        System.out.println("Длина: " + strBuild.length()); // 4 - а это длина объекта

        // Чтобы получить строку, которая хранится в StringBuilder, мы можем использовать стандартный метод toString():
        System.out.println(strBuild.toString());

        // Метод charAt() получает, а метод setCharAt() устанавливает символ по определенному индексу:
        System.out.println("--------------------");
        System.out.println("Методы charAt() и setCharAt()");
        StringBuffer strBuffer = new StringBuffer("Java");
        char c = strBuffer.charAt(0); // J
        System.out.println(c);
        strBuffer.setCharAt(0, 'c');
        System.out.println(strBuffer.toString()); // cava

        // Метод getChars() получает набор символов между определенными индексами:
        System.out.println("--------------------");
        System.out.println("Метод getChars()");
        StringBuffer strBuffer02 = new StringBuffer("world");
        int startIndex = 1;
        int endIndex = 4;
        char[] buffer = new char[endIndex-startIndex]; // т.е. еще нужен массив, длина определяется вычитанием младшего индекса от старшего
        strBuffer02.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(buffer); // orl

        // Метод append() добавляет подстроку в конец StringBuffer:
        System.out.println("--------------------");
        System.out.println("Метод append()");
        StringBuffer strBuffer03 = new StringBuffer("hello");
        strBuffer03.append(" world");
        System.out.println(strBuffer03.toString()); // hello world

        //Метод insert() добавляет строку или символ по определенному индексу в StringBuffer:
        System.out.println("--------------------");
        System.out.println("Метод insert()");
        StringBuffer strBuffer04 = new StringBuffer("word"); // исходная строка

        strBuffer04.insert(3, 'l');
        System.out.println(strBuffer04.toString()); //world - добавление символа

        strBuffer04.insert(0, "s");
        System.out.println(strBuffer04.toString()); //sworld - добавление строки

        // Метод delete() удаляет все символы с определенного индекса до определенной позиции, 
        // а метод deleteCharAt() удаляет один символ по определенному индексу:
        System.out.println("--------------------");
        System.out.println("Методы delete() и deleteCharAt()");
        StringBuffer strBuffer05 = new StringBuffer("assembler");
        strBuffer05.delete(0,2);
        System.out.println(strBuffer05.toString()); //sembler

        strBuffer05.deleteCharAt(6);
        System.out.println(strBuffer05.toString()); //semble

        //Метод substring() обрезает строку с определенного индекса до конца, либо до определенного индекса:
        System.out.println("--------------------");
        System.out.println("Метод substring()");
        StringBuffer strBuffer06 = new StringBuffer("hello java!");
        String str1 = strBuffer06.substring(6); // обрезка строки с 6 символа до конца
        System.out.println(str1); //java!

        String str2 = strBuffer06.substring(3, 9); // обрезка строки с 3 по 9 символ 
        System.out.println(str2); //lo jav


        // Для изменения длины StringBuffer (не емкости буфера символов) применяется метод setLength(). 
        // Если StringBuffer увеличивается, то его строка просто дополняется в конце пустыми символами, 
        // если уменьшается - то строка по сути обрезается:
        System.out.println("--------------------");
        System.out.println("Изменение длины строки setLength()");
        StringBuffer strBuffer07 = new StringBuffer("hello");
        strBuffer07.setLength(10);
        System.out.println(strBuffer07.toString()); //"hello     "

        strBuffer07.setLength(4);
        System.out.println(strBuffer07.toString()); //"hell"

        // Для замены подстроки между определенными позициями в StringBuffer на другую подстроку применяется метод replace():
        // Первый параметр метода replace указывает, с какой позиции надо начать замену, второй параметр - до какой позиции, 
        // а третий параметр указывает на подстроку замены.
        System.out.println("--------------------");
        System.out.println("Замена подстроки replace()");
        StringBuffer strBuffer08 = new StringBuffer("hello world!");
        strBuffer08.replace(6,11,"java");
        System.out.println(strBuffer08.toString()); //hello java!

        // Метод reverse() меняет порядок в StringBuffer на обратный:
        System.out.println("--------------------");
        System.out.println("Обратный порядок строки reverse()");
        StringBuffer strBuffer09 = new StringBuffer("assembler");
        strBuffer09.reverse();
        System.out.println(strBuffer09.toString()); //relbmessa
    }

}
