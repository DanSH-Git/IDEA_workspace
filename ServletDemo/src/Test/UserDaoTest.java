package Test;

import dao.UserDao;
import domain.User;
import org.junit.Test;

/**
 * @author asus1
 * @create 2021/3/7 19:57
 */
public class UserDaoTest {
    @Test
    public void testLogin(){
        User loginUser=new User();
        loginUser.setUsername("tom");
        loginUser.setPassword("123");
        UserDao dao =new UserDao();
        User user=dao.login(loginUser);
        System.out.println(user);
    }
}
