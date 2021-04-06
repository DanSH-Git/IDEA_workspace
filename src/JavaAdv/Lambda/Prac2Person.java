package JavaAdv.Lambda;

/**
 * @author asus1
 * @create 2020/11/10 9:17
 */
public class Prac2Person {
    @Override
    public String toString() {
        return "Prac2Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Prac2Person() {
    }

    private String name;
    private int age;

    public Prac2Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
