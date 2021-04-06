package JavaBasic.Demo5CommonClass;

import java.util.ArrayList;

/*
* 自定义4个学生对象，添加到集合并遍历
* */
public class Demo6ArrayListPractice2 {
    public static void main(String[] args) {
        Student stu1=new Student("tom1","18");
        Student stu2=new Student("tom2","28");
        Student stu3=new Student("tom3","38");
        Student stu4=new Student("tom4","48");
        ArrayList<Student> array=new ArrayList<>();
        array.add(stu1);
        array.add(stu2);
        array.add(stu3);
        array.add(stu4);
        for (int i=0;i<array.size();i++){
            Student s=array.get(i);
            System.out.println(s.getAge()+",age:"+s.getName());
        }
    }
}

