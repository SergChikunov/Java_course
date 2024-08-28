public class Main {
    public static void main(String[] args) {
        Market market = new Market(); //создаем экземпляр рынка
        Human human1 = new Human("Иван"); //плодим виртуальных посетителей
        Human human2 = new Human("Владимир");
        Human human3 = new Human("Сергей");
        Human human4 = new Human("Анатолий");
        Human human5 = new Human("Константин");
        Human human6 = new Human("Павел");

        //покупатели спонтанно посещают рынок и обслужены они должны быть в порядке появления
        market.acceptToMarket(human6);
        market.acceptToMarket(human2);
        market.acceptToMarket(human4);
        market.acceptToMarket(human3);
        market.acceptToMarket(human1);
        market.acceptToMarket(human5);

        market.update();
    }
}