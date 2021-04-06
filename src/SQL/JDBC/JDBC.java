package SQL.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author asus1
 * @create 2021/1/6 9:14
 * JDBC :Java Database Connectivity Java数据库连接，Java语言操作数据库
 * 本质：使用统一的一套可以操作所有关系型数据库的规则（接口），不同数据库厂商实现这套接口，提供数据库驱动jar包。
 *      使用接口编程，执行的代码是驱动jar包中的实现类。
 * 基本步骤：1.导入驱动jar包（复制到包；右键Add as Library）；
 *          2注册驱动；
 *          3获取数据库连接对象Connection；
 *          4定义sql；
 *          5.获取执行sql语句的对象Statement
 *          6.执行sql，接受返回结果；
 *          7.处理结果
 *          8.释放资源
 *
 *  对象：DriverManager:驱动管理对象；
 *                     负责注册驱动：static void registerDriver(Driver driver) ,注册与给定的驱动程序DriverManager
 *                     Class.forName("com.mysql.jdbc.Driver"); 其中存在：
 *                           static {
 *                           try {
 *                                java.sql.DriverManager.registerDriver(new Driver());
 *                               } catch (SQLException E) {
 *                              throw new RuntimeException("Can't register driver!");
 *                              }
 *                              }
 *                     获取数据库连接
 *                     Static Connection getConnection（String url，String user，String password）
 *                     url：指定连接路径 jdbc:mysql:// ip:port / db_name   ,若为本机3306，可简写去掉 ip:port
 *       Connection：数据库连接对象
 *                   1.获取执行sql对象：
 *                      Statement createStatement()
 *                      PreparedStatement prepareStatement(String sql)
 *                   2.管理事务：
 *                      开启事务：setAutoCommit(boolean autoCommit) false为开启事务
 *                      提交事务：commit()
 *                      回滚事务：rollback()
 *       Statement:执行sql对象
 *                  boolean execute(String sql),执行任意sql
 *                  int executeUpdate(String sql):执行DML(列 insert update delete)，DDL(表库create，alter，drop)。
 *                      返回值int代表影响的行数 ，>0则成功
 *                  ResultSet executeQuery (String sql)
 *       ResultSet：结果集对象,封装查询结果
 *                  next(): 游标向下移动一行
 *                  getType()；获取数据 。
 *                             如：getInt，getString
 *                             参数：
 *                             1.int: getString(1),代表列的编号，从1开始
 *                             2.String: getDouble(""),代表列的名称
 *
 *       PreparedStatement：执行sql对象
 *          1.SQL注入：拼接sql时，有一些sql参与特殊关键字参与字符串的拼接，造成安全性问题
 *          2.解决sql注入，使用PreparedStatement对象来解决; 同时效率更高
 *          3.预编译的SQL，参数使用占位符？
 *          4.步骤：
 *  *          1.导入驱动jar包（复制到包；右键Add as Library）；
 *  *          2注册驱动；
 *  *          3获取数据库连接对象Connection；
 *  *          4定义sql；sql参数使用占位符？,
 *                      PrepareStatement Connection.prepareStatement(String sql)
 *                      给？赋值 setXXX（参数1，参数2） 参数X与？的位置对应
 *  *          5.获取执行sql语句的对象Statement
 *  *          6.执行sql，接受返回结果；
 *  *          7.处理结果
 *  *          8.释放资源
 *
 *
 *
 */
public class JDBC {
    public static void main(String[] args) throws Exception {
//        注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        获取对象
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
//        定义语句
        String sql="update account set balance=1550 where id=1";
//        获取执行对象
        Statement sta=conn.createStatement();
//        执行
        int count=sta.executeUpdate(sql);
        System.out.println(count);
//        释放资源(执行对象，连接对象）
        sta.close();
        conn.close();
    }
}
