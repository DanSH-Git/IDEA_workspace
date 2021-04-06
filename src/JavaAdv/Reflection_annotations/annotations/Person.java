package JavaAdv.Reflection_annotations.annotations;

/**
 * @author asus1
 * @create 2020/12/18 9:52
 */
public class Person {
    public static Object p1;
    private String name;
    private int age;
    public String a;
    String b;
    protected int c;
    public Person() {
    }
    public void eat(){
        System.out.println("eat");
    }
    public void eat(String k){
        System.out.println("eat"+k);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                '}';
    }

    public Person(String name, int age) {
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
