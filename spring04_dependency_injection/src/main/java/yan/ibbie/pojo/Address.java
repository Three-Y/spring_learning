package yan.ibbie.pojo;

public class Address {
    private String str;

    public Address() {
    }

    public Address(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Address{" +
                "str='" + str + '\'' +
                '}';
    }
}
