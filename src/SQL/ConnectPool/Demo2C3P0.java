package SQL.ConnectPool;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author asus1
 * @create 2021/1/12 14:55
 */
public class Demo2C3P0 {
    public static void main(String[] args) throws SQLException {
        DataSource ds=new ComboPooledDataSource();
//        指定名称配置
//        DataSource ds=new ComboPooledDataSource("otherc3p0");
        Connection conn=ds.getConnection();
        System.out.println(conn);
    }
}
