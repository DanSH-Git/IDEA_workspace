package SQL.ConnectPool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author asus1
 * @create 2021/1/12 15:06
 */
public class Demo3Druid {
    public static void main(String[] args) throws Exception {
//        加载配置文件
//        创建Properties集合对象
        Properties pro=new Properties();
//        System.out.println(Demo3Druid.class.getClassLoader());
//        查找具有给定名称的资源。 用于搜索与给定类相关联的资源的规则由该类的定义class loader实现。 此方法委托给该对象的类加载器
        InputStream is=Demo3Druid.class.getClassLoader().getResourceAsStream("druid.properties");
//        将文件资源加载进Properties这个持久的属性集中
        pro.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn=ds.getConnection();
        System.out.println(conn);
    }
}
