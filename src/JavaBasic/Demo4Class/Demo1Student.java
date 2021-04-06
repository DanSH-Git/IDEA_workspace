package JavaBasic.Demo4Class;


/*
* 类不能直接使用，根据类创建对象。才能使用
* 1导入包： import 包名称.类名称
* 2创建格式：
*    类名 对象名=new 类名称（）
* 3使用
*    成员变量：对象名.成员变量名
*    成员方法：对象名。成员方法（参数）
* */
public class Demo1Student {
    public static void main(String[] args) {
        Student student =new Student();
        System.out.println(student.age);
        System.out.println(student.name);
        student.eat();
        student.sleep();
        student.study();

    }


}
