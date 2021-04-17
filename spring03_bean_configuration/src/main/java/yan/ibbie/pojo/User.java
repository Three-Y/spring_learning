package yan.ibbie.pojo;

public class User {
    private String name;

    public User() {
        System.out.println("调用了无参构造器");
    }

    public User(String name) {
        System.out.println("调用有参构造器+"+name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
