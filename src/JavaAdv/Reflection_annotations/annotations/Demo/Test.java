package JavaAdv.Reflection_annotations.annotations.Demo;

/**
 * @author asus1
 * @create 2020/12/22 21:08
 */
public class Test {
    @Check
    public void Test1(){
        String str=null;
        str.toString();
    }
    @Check
    public void Test2(){
        int num=3/0;
    }
}
