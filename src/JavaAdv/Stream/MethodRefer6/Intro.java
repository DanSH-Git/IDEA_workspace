package JavaAdv.Stream.MethodRefer6;

/**
 * @author asus1
 * @create 2020/12/16 10:52
 * 数组也是Object的子类对象，同样具有构造器
 * 数组的构造器引用
 */
public class Intro {
    public static int[] creatArray(int length,ArrayBuilder ab){
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        int[] arr=creatArray(10,(len)->{
            return new int[len];
        });
        System.out.println(arr.length);
        int[] arr1=creatArray(10,int[]::new);
        System.out.println(arr1.length);
    }
}
