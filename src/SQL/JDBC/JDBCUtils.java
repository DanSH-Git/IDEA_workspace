package SQL.JDBC;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @author asus1
 * @create 2021/1/7 14:33
 * JDBC工具类
 * 1.抽取注册驱动
 * 2.抽取方法获取对象:使用配置文件保证工具类的通用性 properties
 * 3.抽取方法释放资源
 */
public class JDBCUtils {
    private static String url;
    private static  String user;
    private  static  String password;
    private  static  String driver;
    static {
//        读取资源文件，获取值
        try {
//            创建集合类
            Properties pro=new Properties();
//            获取src路径下的文件方式ClassLoader类加载器
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL resource = classLoader.getResource("JDBC.properties");
            String path = resource.getPath();
            pro.load(new FileReader(path));
//            加载文件
//            pro.load(new FileReader("D:\\IntelliJIDEA\\workspace\\src\\JDBC.properties"));
//            获取数据赋值
            url=pro.getProperty("url");
            user=pro.getProperty("user");
            password=pro.getProperty("password");
            driver=pro.getProperty("driver");
//            注册驱动
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

//    连接对象
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

//    释放资源
    public static void close(ResultSet rs1,Statement stat1, Connection conn1){
            if(rs1!=null)
            {
                try {
                    rs1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        if(stat1!=null){
            try {
                stat1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn1!=null){
            try {
                conn1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
