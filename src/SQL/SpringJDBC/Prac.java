package SQL.SpringJDBC;

import SQL.ConnectPool.JDBCUtils;
import SQL.JDBC.account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author asus1
 * @create 2021/1/13 20:55
 * 需求:
 *      1.修改一条数据
 *      2.添加一条记录，随后删除
 *      3.查询id为1的记录，将其封装为Map集合
 *      4.查找所有记录，封装为List
 *      5.查询所有记录，将其封装为对象的集合
 *      6.查询总记录数
 */
public class Prac {
    public static void main(String[] args) {
        JdbcTemplate jt=new JdbcTemplate(JDBCUtils.getDs());
        String sql1="update account set balance=123 where id=?";
        int i=jt.update(sql1,1);
        System.out.println(i);

        String sql2="insert into account value(?,?,?)";
        int j=jt.update(sql2,null,"jack",3200);
        System.out.println(j);

        String sql3="delete from account where id=? ";
        int k=jt.update(sql3,4);
        System.out.println(k);

        String sql4="select * from account where id=1";
        Map map=jt.queryForMap(sql4);
        System.out.println(map);

        String sql5="select * from account";
        jt.queryForList(sql5);
        List<account> query = jt.query(sql5, new BeanPropertyRowMapper<account>(account.class));
        for (account account:query){
            System.out.println(account);
        }
                     


//        System.out.println(list);
        String sql6="select count(id) from account";

        System.out.println(jt.queryForMap(sql6));


    }
}
