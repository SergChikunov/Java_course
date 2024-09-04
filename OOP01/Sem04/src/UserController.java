public interface UserController<T extends User> {

    void creates(String firstName, String lastName, String middleName);

}
