package yan.ibbie.pojo;

public class Cat {
    private String name;

    public void miao(){
        System.out.println(this.name+" miao~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
