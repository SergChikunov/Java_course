public interface ActorBehaviour {  //описываем поведение покупателя на рынке
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
