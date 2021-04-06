package JavaAdv.IO.ObjectStream;

import java.io.Serializable;

/**
 * @author asus1
 * @create 2020/11/25 16:16
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private static final long serialVersionID = 111L;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
