public interface QueueBehaviour { //описываем действия покупателя в очереди
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
