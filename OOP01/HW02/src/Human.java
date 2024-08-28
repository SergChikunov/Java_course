public class Human extends Actor{ //на основе базового класса создаем виртуального покупателя
    public Human(String name) {
        super(name); //наследуем имя
    }

    @Override
    public String getName() {
        return super.name; //предоставляем имя для чтения
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder; //метод определяющий поведение при создании заказа
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder; //метод определяющий поведение при получении заказа
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;  //заказ сделан
    }

    @Override
    public boolean isTakeOrder() { //заказ получен
        return super.isTakeOrder;
    }
}
