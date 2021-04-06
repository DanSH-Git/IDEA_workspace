package JavaBasic.Demo10multi;
 /*多态
 *父类 对象名=new 子类（）；
 *接口 对象名=new 实现类（）；
 *
 * 依据：
 * 重名变量，参照等号左边的，没有则向后查找
 * 成员方法，未覆盖则父，覆盖了则子。
 *  */

public class Demo10multi {
    public static void main(String[] args) {
        Fu f=new zi();
        f.user();
        if(f instanceof zi){
            f.user();
        }
        else{
            System.out.println("++++++++");
        }
        zi d=(zi)f;
        if(d instanceof Fu){
            f.user();
        }
        else{
            System.out.println("++++++++");
        }
        d.use();
    }
}
