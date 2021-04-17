package yan.ibbie.pojo;

public class Master {
    private Cat cat;
    private Dog dog;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Master{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
