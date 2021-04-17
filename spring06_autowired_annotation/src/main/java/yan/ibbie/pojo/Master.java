package yan.ibbie.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class Master {
    //@Autowired  //在属性上使用（若没有匹配的bean，会报错）
    //@Autowired(required = false)    //required = false表示没有匹配的bean不会报错
    //@Nullable   //表示该属性可以为空
    //@Qualifier(value = "cat66") //指定要注入的bean
//    @Resource   //同Autowired
    //@Resource(name = "cat66")   //指定要注入的bean
//    @Resource(name = "cat00")
    @Autowired
    @Qualifier("cat11")
    private Cat cat;
    private Dog dog;

    public Cat getCat() {
        return cat;
    }

    //属性上使用了@Autowired，没有set方法也可以
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
    }

    @Autowired  //在setter上使用（前提是容器中存在该bean）
    public void setDog(@Nullable Dog dog) { //表示该属性可以为空
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
