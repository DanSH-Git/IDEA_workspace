package JavaAdv.Stream;

import java.util.stream.Stream;

/**
 * @author asus1
 * @create 2020/12/10 9:38
 * 流模型常用方法：
 *      延迟方法：返回值仍然是Stream接口自身类型的方法，支持链式调用
 *      终结方法：返回值不在是自身类型方法，中介方法包括count和forEach方法
 * 方法：
 * 如果需要将流中的元素映射到另一个流中，可以使用map方法：
 *      <R> JavaAdv.Stream<R> map(Function< ? superT,? extends R> mapper>;
 *
 * count方法计算元素个数：
 *      long count()
 *
 * limit取用流中前几个元素；
 *      JavaAdv.Stream<T> limit(long maxSize)
 *
 * skip跳过前几个元素：
 *      JavaAdv.Stream<T> skip(long n)
 *
 * concat将两个流合并为一个流
 *      static <T> JavaAdv.Stream<T> concat(JavaAdv.Stream< ? extends T> a, JavaAdv.Stream< ? extends T> b)
 */
public class Method {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++++++Map类型映射+++++++++++++++++++++++++++++++++");
        Stream<String> stream=Stream.of("111","211","311","4111");
        stream.map((String s)->Integer.parseInt(s)).forEach(i-> System.out.println(i));
        System.out.println("++++++++++++++++++++++++count计算元素+++++++++++++++++++++++++++++++++");
        Stream<String> stream1=Stream.of("111","211","311","4111");
        System.out.println("个数为："+stream1.count());
        System.out.println("++++++++++++++++++++++++++++limit取前几个+++++++++++++++++++++++++++++");
        Stream<String> stream2=Stream.of("111","211","311","4111");
        stream2.limit(2).forEach(s-> System.out.println(s));
        System.out.println("++++++++++++++++++++++++++++++++skip跳过前几个+++++++++++++++++++++++++");
        Stream<String> stream3=Stream.of("111","211","311","4111");
        stream3.skip(2).forEach(s-> System.out.println(s));
        System.out.println("++++++++++++++++++++++++++++++concat拼接++++++++++++++++++++++++++++++");
        Stream<String> stream4=Stream.of("111","211","311","4111");
        Stream<String> stream5=Stream.of("2111","2211","2311","24111");
        Stream.concat(stream4,stream5).forEach(s -> System.out.println(s));
    }
}
