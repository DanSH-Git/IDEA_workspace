package SQL.JDBC;

import java.sql.*;
import java.util.Scanner;

/**
 * @author asus1
 * @create 2021/1/8 15:55
 * 需求：
 * 1.通过键盘录入用户名和密码
 * 2.判断用户是否登录成功
 * Login
 */
public class JDBCPrac1 {
    public static void main(String[] args) {
        String uname;
        String upd;
        System.out.println("请输入用户名：");
        Scanner sc=new Scanner(System.in);
        uname=sc.next();
        System.out.println("请输入密码：");
        Scanner sc1=new Scanner(System.in);
        upd=sc1.next();
        if(login(uname,upd)){
            System.out.println("登录成功");
        }
        else{
            System.out.println("密码与账号不匹配");
        }

    }
    /**
     * 登录判断
     *
     */
    public static boolean login(String username, String psd){
        if(username==null||psd==null){
            return false;
        }
        Connection conn=null;
        Statement statement=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
//            获取连接
            conn = JDBCUtils.getConnection();
//            未防止注入
//            String sql="select * from users where name='"+username+"'and password='"+psd+"'";
//            statement = conn.createStatement();
//            resultSet = statement.executeQuery(sql);
//            使用preparedStatement防止注入攻击
            String sql2="select * from users where name=?and password=?";
            preparedStatement = conn.prepareStatement(sql2);
//            为？赋值
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,psd);
            resultSet=preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(resultSet,preparedStatement,conn);
        }

        return  false;
    }
}
