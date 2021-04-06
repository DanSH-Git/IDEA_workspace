package JavaBasic.DemoMap;

/**
 * @author asus1
 * @create 2020/10/28 16:18
 */
public class Demo3Person {
    private String name;
    private int age;

    public Demo3Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo3Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo3Person() {
    }
}
