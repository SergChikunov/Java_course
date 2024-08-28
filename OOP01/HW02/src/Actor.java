public abstract class Actor implements ActorBehaviour { //базовый класс потенциального покупателя
    protected final String name; // имя, менять нельзя, поэтому = final
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName(); // метод объявлен, но тело не прописываем, т.к. класс и сам метод абстрактные
}
