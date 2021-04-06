package SQL.JDBC;

import java.sql.*;

/**
 * @author asus1
 * @create 2021/1/6 21:18
 */
public class JDBCNormal {
    public static void main(String[] args) {
        Statement stat=null;
        Connection conn=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "insert into account values(null,'xx',3000)";
            String sql2="update account set balance=100 where id =3";
            String sql3="delete from account where id =3";
            String sql4="select * from account";
            conn = DriverManager.getConnection("jdbc:mysql:///jdbcdemo", "root", "root");
            stat=conn.createStatement();
//            int count = stat.executeUpdate(sql3);
//            System.out.println(count);
            rs=stat.executeQuery(sql4);
//            游标向下移动一行
            while(rs.next()){
//            rs.next();
//            获取数据
            int id=rs.getInt(1);
            String name=rs.getString("name");
            Double bal=rs.getDouble(3);
            System.out.println("id:"+id+"---name:"+name+"---balance:"+bal);}


//            if(count>0)
//                System.out.println("添加成功");
//            else
//                System.out.println("添加失败");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
                e.printStackTrace();
            }
        finally {
            if(stat!=null)
            {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null)
            {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(rs!=null)
            {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        }

    }

