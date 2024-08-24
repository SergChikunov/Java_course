import java.util.Objects;

public class Laptop {
    private String name;
    private int ram;
    private int storageSize;
    private String opSYS;
    private String colorCase;
    private double displaySize;
    private double price;

    /**
     *
     * @param name          - наименование бренда/модель;
     * @param ram           - объем ОЗУ (Mb);
     * @param storageSize   - объем хранилища (Mb);
     * @param opSYS         - операционная система;
     * @param colorCase     - цветовое решение;
     * @param displaySize   - диагональ дисплея (in);
     * @param price         - стоимость (RUB)
     */
    public Laptop(String name, int ram, int storageSize, String opSYS, String colorCase, double displaySize, double price) {
        this.name = name;
        this.ram = ram;
        this.storageSize = storageSize;
        this.opSYS = opSYS;
        this.colorCase = colorCase;
        this.displaySize = displaySize;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Brand/Model: %s, RAM: %s MB, Storage Size: %s MB, OnBoard System: %s, Case Color: %s, Display Size: %.1f inch, Цена: %.2f руб.\n", this.name, this.ram, this.storageSize, this.opSYS, this.colorCase, this.displaySize, this.price);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && storageSize == laptop.storageSize && Double.compare(displaySize, laptop.displaySize) == 0 && Double.compare(price, laptop.price) == 0 && Objects.equals(name, laptop.name) && Objects.equals(opSYS, laptop.opSYS) && Objects.equals(colorCase, laptop.colorCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ram, storageSize, opSYS, colorCase, displaySize, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getOpSYS() {
        return opSYS;
    }

    public void setOpSYS(String opSYS) {
        this.opSYS = opSYS;
    }

    public String getColorCase() {
        return colorCase;
    }

    public void setColorCase(String colorCase) {
        this.colorCase = colorCase;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
