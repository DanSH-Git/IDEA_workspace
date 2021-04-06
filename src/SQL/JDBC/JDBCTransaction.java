package SQL.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author asus1
 * @create 2021/1/11 9:47
 */
public class JDBCTransaction {
    public static void main(String[] args) {
        double balance1;
        int id1;
        double balance2;
        int id2;
        transac(500,500,1,2);
        System.out.println("Over....");


    }
        public static void transac (double balance1,double balance2, int id1, int id2){
            Connection conn = null;
            PreparedStatement ps = null;
            try {
                //获取连接对象
                conn = JDBCUtils.getConnection();
//                开启事务
                conn.setAutoCommit(false);
//            定义sql
                String sql1 = "update account set balance= balance-? where id=?";
                String sql2 = "update account set balance= balance+? where id=?";
//                执行sql语句
                ps = conn.prepareStatement(sql1);
//                对PreparedStatement对象进行赋值
                ps.setDouble(1, balance1);
                ps.setInt(2, id1);
//                完成更新
                ps.executeUpdate();
                System.out.println("语句1更新成功");
                int i=3/0;
                ps = conn.prepareStatement(sql2);
                ps.setDouble(1, balance2);
                ps.setInt(2, id2);
                ps.executeUpdate();
                System.out.println("语句2更新成功");
//                提交事务
                conn.commit();
            } catch (Exception e) {
//                有异常则回滚
                try {
                    if(conn!=null)
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                e.printStackTrace();
                System.out.println("事务更新失败,已回滚");
            }
            finally{
                JDBCUtils.close(null,ps,conn);
            }
        }
    }

