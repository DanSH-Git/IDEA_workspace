package JavaAdv.Stream.MethodRefer5;

/**
 * @author asus1
 * @create 2020/12/16 10:27
 * 构造器的名称与类名完全一样，并不固定，构造器可使用：：new的格式表示
 */
public class Intro {
    public static void bulid(String name, PersonBuilder p) {
        Person person = p.bulidP(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        bulid("TOM", (String name) -> {
            return new Person(name);
        });
        //使用方法引用优化表达式，构造方法new Person（String name）
        //可以使用Person引用new创建对象
        bulid("Tom", Person::new);
    }
}
