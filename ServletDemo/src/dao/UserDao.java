package dao;

import Utils.JDBCUtils;
import domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author asus1
 * @create 2021/3/7 19:35
 */
//操作数据库中User表的类
public class UserDao {
//    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDatasource());
//    获取数据库
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());
    /**
     * 登陆方法
     * @param loginUser 包含用户名和密码
     * @return user 用户的全部数据
     */
    public User login(User loginUser){
        try {
            String sql="select * from users where username = ? and password = ?";
//            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), loginUser.getName(), loginUser.getPassword());
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());
            return user;
        }
        catch (DataAccessException e){
            e.printStackTrace();//记录日志
            return null;
        }
    }
}
