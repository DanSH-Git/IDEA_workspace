package SQL.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author asus1
 * @create 2021/1/7 11:12
 * 定义一个方法，查询account表中所有数据，装载到集合中并返回
 */
public class JDBCAccount {
    public static void main(String[] args) {
        List<account> list=new JDBCAccount().findAll();
        System.out.println(list);
    }
    public List<account> findAll() {
        Connection conn=null;
        Statement stat=null;
        ResultSet rs=null;
        List<account> list=new ArrayList<>();
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn=DriverManager.getConnection("jdbc:mysql:///jdbcdemo","root","root");
            conn=JDBCUtils.getConnection();

            String sql ="select * from account";
            stat=conn.createStatement();
            rs=stat.executeQuery(sql);
            account acont=null;

            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                int balance=rs.getInt("balance");
                acont=new account();
                acont.setId(id);
                acont.setBalance(balance);
                acont.setName(name);
                list.add(acont);
            }
//            return list;
        } catch ( SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs,stat,conn);
//            if(stat!=null)
//            {
//                try {
//                    stat.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(conn!=null)
//            {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(rs!=null)
//            {
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//
        }
        return list;


    }
}
