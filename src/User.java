public class User {
    final boolean isRoot = false;
    String name;

    public User(String name) {
        this.name = name;
    }





    @Override
    public String toString() {
        return "User{" +
                "isRoot=" + isRoot +
                ", name='" + name + '\'' +
                '}';
    }
}
