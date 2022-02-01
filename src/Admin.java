public class Admin{
    final boolean isRoot = true;
    String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "isRoot=" + isRoot +
                ", name='" + name + '\'' +
                '}';
    }
}
