import java.util.List;

public interface MarketBehaviour { //описываем взаимодействие покуптеля и рынка
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
