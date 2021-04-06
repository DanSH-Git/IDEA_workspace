package JavaBasic.TDemoGeneric;

import java.util.ArrayList;
import java.util.Iterator;

/*
*创建集合对象不使用泛型，默认类型为Object类型，可以存储任意数据类型
* 弊端：不安全，会引发异常。
*
* 使用泛型创建集合对象，避免了类型转换的麻烦，将运行期异常提升到编译期（写代码时报错）
* 弊端：泛型是什么类型，则只能存储什么类型的数据。
* 泛型格式
*   修饰符<泛型> 返回值类型 方法名（参数列表（使用泛型））{方法体}
*   public <E> void method(E e){}
* */
public class Demo1Generic {
    public static void main(String[] args) {
       ArrayList eee=new ArrayList();
       eee.add("111");
       eee.add("1111");
       Iterator<String> it1=eee.iterator();
       while (it1.hasNext()){
           System.out.println(it1.next().length());
        }
    }
}
