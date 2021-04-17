package yan.ibbie.pojo;

public class Dog {
    private String name;

    public void wang(){
        System.out.println(this.name+" wang~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
