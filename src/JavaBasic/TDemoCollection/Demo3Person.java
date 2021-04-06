package JavaBasic.TDemoCollection;

/**
 * @author asus1
 * @create 2020/10/27 14:52
 */
public class Demo3Person implements Comparable<Demo3Person>{
    private String name;
    private int age;

    public Demo3Person() {
    }

    public Demo3Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Demo3Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Demo3Person o) {
        return o.getAge()- this.getAge();
    }
}
