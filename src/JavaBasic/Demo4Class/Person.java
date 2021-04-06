package JavaBasic.Demo4Class;
/*定义一度getter￥setter方法
* setter：有参数无返回值
* getter:无参数有返回值
* */
public class Person {
    String name;
    private int age;

    public void show(String name){
        System.out.println("成员变量姓名:"+this.name+"局部变量姓名"+name+",年龄："+age);

    }

    public void setAge(int num){
        if(num>0){
            age=num;
        }
        else{
            System.out.println("error");
        }

    }
    public int getAge(){
        return age;

    }
}
