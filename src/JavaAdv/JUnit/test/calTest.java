package JavaAdv.JUnit.test;

import JavaAdv.JUnit.Cal.cal;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author asus1
 * @create 2020/12/17 11:32
 */
public class calTest {
    @Before
    public  void init(){
        System.out.println("init...");
    }
    @After
    public void finish(){
        System.out.println("close...");
    }

    @Test
    public void testAdd(){
        int a=1,b=2;
        cal c=new cal();
        int result=c.add(a,b);
        Assert.assertEquals(3 ,result);
    }

}
