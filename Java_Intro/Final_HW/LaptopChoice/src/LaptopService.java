import java.util.*;

public class LaptopService {

    public static Set<Laptop> warehouseLaptops = new HashSet<>();
    public static Map<String, Double> userCriterias = new HashMap<>();

    public static void printSeparator() {
        System.out.println("===================================================================================================================================================================================================");
    }

    public static void fillWarehouse() {
        warehouseLaptops.add(new Laptop("Huawei MateBook 14 FlemingH 53014APJ", 16, 512, "Windows11", "Gray", 14, 99990));
        warehouseLaptops.add(new Laptop("Huawei MateBook D 16 53013YLY", 16, 1000, null, "Gray", 16, 64990));
        warehouseLaptops.add(new Laptop("Acer Aspire 5 A515-57-506D NX.KN3CD.001", 16, 512, null, "Silver", 15.6, 52990));
        warehouseLaptops.add(new Laptop("Lenovo IdeaPad 1 15AMN7 82VG00MQUE", 8, 256, null, "Gray", 15.6, 34990));
        warehouseLaptops.add(new Laptop("ASUS ROG Strix Scar 18 G834JYR-R6153W 90NR0IP2-M00780", 64, 2000, "Windows11", "Black", 18, 405990));
        warehouseLaptops.add(new Laptop("ASUS VivoBook 17X K3704VA-AU102 90NB1091-M00420", 16, 1000, null, "Black", 17.3, 97990));
        warehouseLaptops.add(new Laptop("MSI GF63 Thin 12UC-1036XRU 9S7-16R821-1036", 16, 512, "FreeDOS", "Black", 15.6, 79990));
        System.out.println();
        System.out.println("Полный перечень доступных для выбора ноутбуков:\n" + warehouseLaptops);
        printSeparator();
    }

    public static List<String> getColor() {
        Set<String> allColorSet = new HashSet<>();
        for (Laptop device : warehouseLaptops) {
            allColorSet.add(device.getColorCase());
        }
        List<String> availColor = new ArrayList<>(allColorSet);
        return availColor;
    }

    public static List<String> getOS() {
        Set<String> allOS = new HashSet<>();
        for (Laptop device : warehouseLaptops) {
            allOS.add(device.getOpSYS());
        }
        List<String> availOS = new ArrayList<>(allOS);
        return availOS;
    }

    public static void runApp() {
        System.out.println("\nПриложение подбора ноутбука по заданным критерям\n");
        Scanner in = new Scanner(System.in);
        Scanner inOption = new Scanner(System.in);
        fillWarehouse();  // вызов метода в котором заполняем все возможные конфиги ноутбуков

        boolean flag = true;

        while (flag) {

            System.out.print("Доступные критерии выбора:\n1 - сбросить сделанный выбор, 2 - по объему ОЗУ, 3 - по объему хранилища, ");
            System.out.print("4 - по операционной системе, 5 - по расцветке, 6 - по размеру дисплея, ");
            System.out.print("7 - по стоимости,\n0 - все критерии выбора указаны, выполнить подбор, q - ЗАВЕРШИТЬ РАБОТУ");
            System.out.println("\nВыберите что-нибудь из предложенных вариантов... ");
            String userChoice = in.nextLine();
            double numOpt = 0;
            String option = " ";
            if (userChoice.equalsIgnoreCase("q") || userChoice.equalsIgnoreCase("й")) {
                System.out.println("Завершение работы программы!");
                System.exit(0);
            }

            switch (userChoice) {
                case "1":
                    userCriterias.clear();
                    break;
                case "2":
                    option = "RAM";
                    if (userCriterias.containsKey(option)) {
                        System.out.println("Эта опция уже была указана! Сделайте выбор вновь!");
                        break;
                    }
                    System.out.print("Укажите желаемый объем ОЗУ в мегабайтах: ");
                    numOpt = inOption.nextDouble();
                    userCriterias.put(option, numOpt);
                    break;
                case "3":
                    option = "Storage";
                    if (userCriterias.containsKey(option)) {
                        System.out.println("Эта опция уже была указана! Сделайте выбор вновь!");
                        break;
                    }
                    System.out.print("Укажите желаемый внутренний объем хранилища в мегабайтах: ");
                    numOpt = inOption.nextDouble();
                    userCriterias.put(option, numOpt);
                    break;
                case "4":
                    option = "OS";
                    if (userCriterias.containsKey(option)) {
                        System.out.println("Эта опция уже была указана! Сделайте выбор вновь!");
                        break;
                    }
                    List<String> availOS = getOS();
                    System.out.println("Укажите желаемую ОС, возможные варианты: ");
                    for (int i = 0; i < availOS.size(); i++) {
                        System.out.println(i + " ---> " + availOS.get(i));
                    }
                    System.out.println("Нажмите соответствующую цифру...");
                    numOpt = inOption.nextDouble();
                    if (numOpt >= availOS.size()) {
                        System.out.println("Некорректный выбор!");
                        break;
                    }
                    userCriterias.put(availOS.get((int)numOpt), numOpt);
                    break;
                case "5":
                    option = "Color";
                    if (userCriterias.containsKey(option)) {
                        System.out.println("Эта опция уже была указана! Сделайте выбор вновь!");
                        break;
                    }
                    List<String> availColor = getColor();
                    System.out.println("Укажите желаемую расцветку, возможные варианты: ");
                    for (int i = 0; i < availColor.size(); i++) {
                        System.out.println(i + " ---> " + availColor.get(i));
                    }
                    System.out.println("Нажмите соответствующую цифру...");
                    numOpt = inOption.nextDouble();
                    if (numOpt >= availColor.size()) {
                        System.out.println("Некорректный выбор!");
                        break;
                    }
                    userCriterias.put(availColor.get((int)numOpt), numOpt);
                    break;
                case "6":
                    option = "Display";
                    if (userCriterias.containsKey(option)) {
                        System.out.println("Эта опция уже была указана! Сделайте выбор вновь!");
                        break;
                    }
                    System.out.print("Укажите желаемый размер диагонали дисплея в дюймах: ");
                    numOpt = inOption.nextDouble();
                    userCriterias.put(option, numOpt);
                    break;
                case "7":
                    option = "Cost";
                    if (userCriterias.containsKey(option)) {
                        System.out.println("Эта опция уже была указана! Сделайте выбор вновь!");
                        break;
                    }
                    System.out.print("Укажите премлемую стоимость в рублях: ");
                    numOpt = inOption.nextDouble();
                    userCriterias.put(option, numOpt);
                    break;
                case "0":
                    if (userCriterias.isEmpty()) {
                        System.out.println("Не было укзаано ни одно критерия выбора! Попытайтесь еще раз!");
                        break;
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("Такой опции не существует! Попытайтесь вновь!");
            }
        }
        System.out.println();
        System.out.println(userCriterias);
        printSeparator();
        in.close();
        inOption.close();
        showResult();
    }

    public static void showResult() {
        Set<Laptop> resLaptops = new HashSet<>(warehouseLaptops);
//        Iterator<Laptop> iter = resLaptops.iterator();
//        while (iter.hasNext()) {
//            if ( (!userCriterias.containsKey("Windows11")) || (!userCriterias.containsKey(null)) || (!userCriterias.containsKey("FreeDOS")) ) {
//                resLaptops.remove(iter);
//                iter.remove();
//            }
//        }
        for (Laptop device : warehouseLaptops) {
            if ((!userCriterias.containsKey(device.getOpSYS())) || (!userCriterias.containsKey(device.getColorCase()))) {
                warehouseLaptops.remove(device);
            }
            if ( (!userCriterias.containsKey(device.getStorageSize())) ) {
                warehouseLaptops.remove(device);
            }
            if ( (!userCriterias.containsKey(device.getRam())) ) {
                warehouseLaptops.remove(device);
            }
            if ( (!userCriterias.containsKey(device.getDisplaySize())) ) {
                warehouseLaptops.remove(device);
            }
            if ( (!userCriterias.containsKey(device.getPrice())) ) {
                warehouseLaptops.remove(device);
            }
            if ( (userCriterias.containsKey(device.getStorageSize())) && (userCriterias.get("Storage") < device.getStorageSize()) ) {
                resLaptops.remove(device);
            }
            if ( (userCriterias.containsKey(device.getRam())) && (userCriterias.get("RAM") < device.getRam()) ) {
                resLaptops.remove(device);
            }
            if ( (userCriterias.containsKey(device.getDisplaySize())) && (userCriterias.get("Display") < device.getDisplaySize()) ) {
                resLaptops.remove(device);
            }
            if ( (userCriterias.containsKey(device.getPrice())) && (userCriterias.get("Cost") > device.getPrice()) ) {
                resLaptops.remove(device);
            }
        }
//        for (Laptop device : warehouseLaptops) {
//            if ((userCriterias.containsKey(device.getOpSYS())) || (userCriterias.containsKey(device.getColorCase()))) {
//                resLaptops.add(device);
//            }
//            if ( (userCriterias.containsKey(device.getStorageSize())) && (userCriterias.get("Storage") >= device.getStorageSize()) ) {
//                resLaptops.add(device);
//            }
//            if ( (userCriterias.containsKey(device.getRam())) && (userCriterias.get("RAM") >= device.getRam()) ) {
//                resLaptops.add(device);
//            }
//            if ( (userCriterias.containsKey(device.getDisplaySize())) && (userCriterias.get("Display") >= device.getDisplaySize()) ) {
//                resLaptops.add(device);
//            }
//            if ( (userCriterias.containsKey(device.getPrice())) && (userCriterias.get("Cost") <= device.getPrice()) ) {
//                resLaptops.add(device);
//            }
//
//        }
//        for (Map.Entry<String, Double> elem : userCriterias.entrySet()) {
//            for(Laptop device : warehouseLaptops) {
//                if ( (elem.getKey().equals(device.getOpSYS())) || elem.getKey().equals(device.getColorCase()) ) {
//                    resLaptops.add(device);
//                }
//                if ( (elem.getKey().contains("RAM")) && (userCriterias.get("RAM") >= device.getRam()) ) {
//                    resLaptops.add(device);
//                }
//                if ( (elem.getKey().contains("Storage")) && (userCriterias.get("Storage") >= device.getStorageSize()) ) {
//                    resLaptops.add(device);
//                }
//                if ( (elem.getKey().contains("Display")) && (userCriterias.get("Display") >= device.getDisplaySize()) ) {
//                    resLaptops.add(device);
//                }
//                if ( (elem.getKey().contains("Cost")) && (userCriterias.get("Cost") <= device.getPrice()) ) {
//                    resLaptops.add(device);
//                }
//
//            }
//        }
//        for (Laptop device : warehouseLaptops) {
//            for (Map.Entry<String, Double> item : userCriterias.entrySet()) {
//                if (  )
//            }
//            if ((userCriterias.containsKey(device.getOpSYS())) || (userCriterias.containsKey(device.getColorCase()))) {
//                //resLaptops.add(device);
//                if ( (userCriterias.containsKey(device.getStorageSize())) && (userCriterias.get("Storage") >= device.getStorageSize()) ) {
//                    //resLaptops.add(device);
//                    if ( (userCriterias.containsKey(device.getStorageSize())) && (userCriterias.get("Storage") >= device.getStorageSize()) ) {
//                        //resLaptops.add(device);
//                        if ( (userCriterias.containsKey(device.getRam())) && (userCriterias.get("RAM") >= device.getRam()) ) {
//                            //resLaptops.add(device);
//                            if ( (userCriterias.containsKey(device.getDisplaySize())) && (userCriterias.get("Display") >= device.getDisplaySize()) ) {
//                                //resLaptops.add(device);
//                                if ( (userCriterias.containsKey(device.getPrice())) && (userCriterias.get("Cost") <= device.getPrice()) ) {
//                                    resLaptops.add(device);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            // попробовать getOrDefault, еще попробовать соединить IF и потусовать их между собой!
//        }

        if (resLaptops.isEmpty()) {
            System.out.println("Не найдено подходящих девайсов на основе указанных критериев!");
        }
        else {
            System.out.println("Подходящие по критериям девайсы:");
            System.out.println(resLaptops);
            printSeparator();
        }
    }

}