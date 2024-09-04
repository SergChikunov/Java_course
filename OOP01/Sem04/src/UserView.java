import java.util.List;

public interface UserView <T extends User> {

    void sendInConsole (List<T> list);

}
