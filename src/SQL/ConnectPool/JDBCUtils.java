package SQL.ConnectPool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author asus1
 * @create 2021/1/12 15:20
 */
public class JDBCUtils {
    private static DataSource ds;
//静态代码块，随着类的执行而加载，并且只执行一次。静态代码块>main>非静态代码块>构造函数
    static {
    try {
        Properties pro = new Properties();
        pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
        ds= DruidDataSourceFactory.createDataSource(pro);
    } catch (IOException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    //    获取连接
    public static Connection getConnection () throws SQLException {
        return ds.getConnection();
    }
//    释放资源
    public static void close (ResultSet rs, Statement stat, Connection conn ){
        if(rs!=null)
        {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stat!=null){
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //    获取连接池
    public static DataSource getDs(){
        return  ds;
    }
}
