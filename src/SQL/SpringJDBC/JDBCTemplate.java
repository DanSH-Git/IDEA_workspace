package SQL.SpringJDBC;

import SQL.ConnectPool.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author asus1
 * @create 2021/1/13 20:18
 * Spring框架对JDBC进行简单封装，提供了JDBCTemplate对象简化JDBC的开发
 * 步骤：
 *      1.导入jar包
 *      2.创建JDBCTemplate对象，依赖于数据源DataSource：
 *              JDBCTemplate tp=new JDBCTemplate(ds)
 *      3.使用JDBCTemplate方法完成CRUD操作
 *          update()
 *          QueryForMap() 查询长度仅为1
 *          QueryForList()
 *          Query()
 *          QueryForObject()
 *
 */
public class JDBCTemplate {
    public static void main(String[] args) {
        JdbcTemplate jt=new JdbcTemplate(JDBCUtils.getDs());
        String sql="update account set balance=1900 where id=? ";
//        更新语句中，sql语句后参数与sql语句中占位符一一对应
        jt.update(sql,3);

    }
}
