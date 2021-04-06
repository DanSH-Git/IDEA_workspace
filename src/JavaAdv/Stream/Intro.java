package JavaAdv.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author asus1
 * @create 2020/12/10 9:05
 * JavaAdv.Stream:是一个来自数据源的元素队列：
 *      元素是特定类型对象，形成一个队列，stream并不会存储元素，只是按需运算
 *      数据源是流数据的来源，可以是集合或者队列
 * Stream操作有两个基础的特征：
 *      Pipelining：中间操作都会返回流对象本身，多个操作可以串联成一个管道。该操作可对延迟执行和短路进行操作
 *      内部迭代：迭代器或增强for属于现实集合在外部迭代，Stream提供内部迭代，流可以直接调用遍历方法。
 * 操作步骤： 获取数据源-->数据转换-->执行操作
 *
 * 获取流：
 *      所有的Collection集合都可以通过stream默认方法获取流
 *              default JavaAdv.Stream<E> stream()
 *      Stream接口的静态方法of可以获取数组对应的流
 *              static JavaAdv.Stream<T> of (T...values)
 *              参数是可变参数
 *
 */
public class Intro {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("1111");
        array.add("2222");
        array.add("3333");
        array.add("1444");
        //转换为流对象
        array.stream().filter(s -> s.length() == 4).filter(s -> s.startsWith("1")).forEach(s -> System.out.println(s));
        //Set集合转换
        Set<String> set=new HashSet<>();
        set.stream();
        //分别存储映射的键值
        Map<String,String> map=new HashMap<>();
        map.keySet().stream();
        map.values().stream();
        //键值映射关系
        map.entrySet().stream();
        //数组
        Integer[] arr={1,2,3,4,5};
        Stream<Integer> ss = Stream.of(arr);
        int[] arr1={1,2,3,4};
        Arrays.stream(arr1);
    }
}
