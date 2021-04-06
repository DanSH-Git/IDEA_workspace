package JavaBasic.DemoException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author asus1
 * @create 2020/11/2 10:38
 * 模拟注册操作，若用户名存在，提示 该用户名已经被注册。
 * <p>
 * 要求：
 * 1.使用数组存储已经被被注册过的用户名；
 * 2.使用Scanner获取用户输入的用户名
 * 3.定义方法，对输入的用户名进行判断，
 * 遍历数组，获取每一个用户名，进行比较
 * true，则抛出异常，告知用户“该账户已被注册”
 * false，遍历，若无重复，提示“注册成功”。
 */
public class ExceptionPrac {
    static String[] names = {"aaa", "bbb", "ccc"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();

        exsitName(name);


        System.out.println(Arrays.toString(names));
    }

    static void exsitName(String s) {
        Set<String> set = new HashSet<>(Arrays.asList(names));
        if (set.contains(s)) {
            try{
            throw new Demo3MyException("该用户已被注册");
            } catch (Demo3MyException e) {
                e.printStackTrace();
                return;
            }

        } else {

            System.out.println("注册成功");
        }
    }
}
