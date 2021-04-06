package JavaBasic.Demo8Abstract;

import java.util.ArrayList;

/*抽象方法：加上Abstract，去掉大括号，直接分号结束
* 抽象类：抽象方法所在的类，必须是抽象类，class前加上abstract
*
*不能直接创建抽象类，子类继承抽象类
* 子类必须覆盖重写父类中的所有抽象方法。除非子类也是抽象类，则自动包含父类中的抽象方法
* 去掉关键字abstract，补上方法内容。
* 创建子类对象进行使用。
* */
public  class Demo1abstract {
    public static void main(String[] args) {
        Demo2captain cap=new Demo2captain("群主",100);
        Demo2member one=new Demo2member("A",0);
        Demo2member two=new Demo2member("B",0);
        Demo2member Three=new Demo2member("C",0);

        cap.show();
        one.show();
        two.show();
        Three.show();
        System.out.println("+++++++++++++++++++++");
        ArrayList<Integer> red=cap.Send(50,3);
        one.receive(red);
        two.receive(red);
        Three.receive(red);
        cap.show();
        one.show();
        two.show();
        Three.show();
    }
}
