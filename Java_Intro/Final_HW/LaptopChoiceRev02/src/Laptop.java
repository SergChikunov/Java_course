public class Laptop {
    public String model;
    public int ram;
    public int hdd;
    public String os;
    public String color;

    /**
     *
     * @param model модель или марка девайса
     * @param ram объем ОЗУ
     * @param hdd объем внутреннего хранилища
     * @param os операционная система
     * @param color расцветка
     */
    public Laptop(String model, int ram, int hdd, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Модель (марка) = '" + model + '\'' +
                ", ОЗУ = '" + ram + '\'' +
                ", Накопитель = '" + hdd + '\'' +
                ", Система = '" + os + '\'' +
                ", Цветовое исполнение = '" + color + '\'' +
                '}';
    }
}
