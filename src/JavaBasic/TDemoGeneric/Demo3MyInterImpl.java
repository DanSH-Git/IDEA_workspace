package JavaBasic.TDemoGeneric;
/*泛型接口的实现类*/
public class Demo3MyInterImpl<E> implements Demo3MyInter<E> {

    @Override
    public void meth(E e) {
        System.out.println(e);
    }
}
