package SQL.ConnectPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author asus1
 * @create 2021/1/12 16:25
 */
public class Demo4DruidUtils {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
//            获取连接
            conn=JDBCUtils.getConnection();
//
            String sql="insert into account values(null,?,?)";
//            获取Ps对象
            ps = conn.prepareStatement(sql);
            ps.setString(1,"tom");
            ps.setDouble(2,123);
            int num = ps.executeUpdate();
            System.out.println(num);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            JDBCUtils.close(null,ps,conn);

        }
    }
}
