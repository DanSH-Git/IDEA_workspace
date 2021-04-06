package JavaAdv.JUnit;

import org.junit.Before;

/**
 * @author asus1
 * @create 2020/12/17 11:27
 * Junit白盒测试：
 *      1，定义测试类，类名Test
 *      2，定义测试方法：可以独立运行 testMethod（），无返回值，空参数
 *      3，给方法名加@Test
 *      4，导入依赖
 *一般使用Assert断言操作来处理
 * @Before @After  一般用于初始化和释放资源
 */
public class Intro {
@Before
public void test(){
    System.out.println("good");
}
}
