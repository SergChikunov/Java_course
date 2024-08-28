import java.util.*;
import java.util.stream.Collectors;

public class LaptopService {
    public static Set<Laptop> laptops = new HashSet<>();
    public static Map<String, Object> userCriteries = new HashMap<>();

    public static void printSeparator() {
        System.out.println("========================================================================================");
    }

    public static void showRes(Set<Laptop> resLaptops) {
        if (resLaptops.isEmpty()) {
            System.out.println("Не найдено подходящих девайсов на основе указанных критериев!");
        }
        else {
            System.out.println();
            System.out.println("Подходящие по критериям девайсы:");
            for (Laptop device : resLaptops) {
                System.out.println(device);
            }
            printSeparator();
        }

    }


    public static void fillDevicesList() {
        laptops.add(new Laptop("Huawei MateBook 14 FlemingH 53014APJ", 16, 512, "Windows", "Gray"));
        laptops.add(new Laptop("Huawei MateBook D 16 53013YLY", 16, 1000, "NoneOS", "Gray"));
        laptops.add(new Laptop("Acer Aspire 5 A515-57-506D NX.KN3CD.001", 16, 512, "NoneOS", "Silver"));
        laptops.add(new Laptop("Lenovo IdeaPad 1 15AMN7 82VG00MQUE", 8, 256, "NoneOS", "Gray"));
        laptops.add(new Laptop("ASUS ROG Strix Scar 18 G834JYR-R6153W 90NR0IP2-M00780", 64, 2000, "Windows", "Black"));
        laptops.add(new Laptop("ASUS VivoBook 17X K3704VA-AU102 90NB1091-M00420", 16, 1000, "NoneOS", "Black"));
        laptops.add(new Laptop("MSI GF63 Thin 12UC-1036XRU 9S7-16R821-1036", 16, 512, "FreeDOS", "Black"));
        System.out.println();
        System.out.println("Полный перечень доступных для выбора ноутбуков:");
        for (Laptop elements : laptops) {
            System.out.println(elements);
        }
        printSeparator();
    }

    public static void runApp() {
        System.out.println("\nПриложение подбора ноутбука по заданным критерям\n");
        Scanner in = new Scanner(System.in);
        fillDevicesList();  // вызов метода в котором заполняем все возможные конфиги ноутбуков

        boolean flag = true;

        while (flag) {

            System.out.print("Доступные критерии выбора:\n1 - сбросить сделанный выбор, 2 - по объему ОЗУ, 3 - по объему хранилища, ");
            System.out.print("4 - по операционной системе, 5 - по расцветке ");
            System.out.print("\n0 - все критерии выбора указаны, выполнить подбор, 9 - ЗАВЕРШИТЬ РАБОТУ");
            System.out.println("\nВыберите что-нибудь из предложенных вариантов... ");
            int userChoice = in.nextInt();

            if (userChoice == 9) {
                System.out.println("Завершение работы программы!");
                System.exit(0);
            }

            switch (userChoice) {
                case 1:
                    userCriteries.clear();
                    break;
                case 2:
                    System.out.print("Объем ОЗУ: ");
                    userCriteries.put("RAM", in.nextInt());
                    break;
                case 3:
                    System.out.print("Объем внутреннего хранилища: ");
                    userCriteries.put("Storage", in.nextInt());
                    break;
                case 4:
                    System.out.println("Операционная система: ");
                    userCriteries.put("OS", in.nextInt());
                    break;
                case 5:
                    System.out.println("Расцветка: ");
                    userCriteries.put("Color", in.nextInt());
                    break;
                case 0:
                    if (userCriteries.isEmpty()) {
                        System.out.println("Не было указано ни одно критерия выбора! Попытайтесь еще раз!");
                        break;
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("Такой опции не существует! Попытайтесь вновь!");
            }
        }
        // только с использованием потока данных смог сделать вывод по критериям отбора
        Set<Laptop> resLaptops = laptops.stream()
                .filter(laptop -> userCriteries.getOrDefault("RAM", 0) instanceof Integer && laptop.ram >= (int) userCriteries.getOrDefault("RAM", 0))
                .filter(laptop -> userCriteries.getOrDefault("Storage", 0) instanceof Integer && laptop.hdd >= (int) userCriteries.getOrDefault("Storage", 0))
                .filter(laptop -> userCriteries.getOrDefault("OS", "").equals("") || laptop.os.equalsIgnoreCase((String) userCriteries.getOrDefault("OS", "")))
                .filter(laptop -> userCriteries.getOrDefault("Color", "").equals("") || laptop.color.equalsIgnoreCase((String) userCriteries.getOrDefault("Color", "")))
                .collect(Collectors.toSet());
        showRes(resLaptops);
    }
}
