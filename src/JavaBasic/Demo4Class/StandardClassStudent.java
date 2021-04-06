package JavaBasic.Demo4Class;
/*标准类
* 成员变量使用private修饰，为成员变量设定Getter、Setter方法
* 编写一个无参构造方法，编写一个全参构造方法
*
*标准类叫做Java Bean
* */
public class StandardClassStudent {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public StandardClassStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StandardClassStudent() {
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
