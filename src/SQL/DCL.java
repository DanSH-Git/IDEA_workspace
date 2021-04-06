package SQL;

/**
 * @author asus1
 * @create 2021/1/5 9:28
 * DCL:管理用户，授权。
 * 管理用户：
 *      用户添加
 *          create user ‘username’@'host' identified by 'password'
 *      用户删除
 *          Drop user 'username'@'host'
 *      修改用户密码
 *          Update user  set password =password('new pw') where user='username'
 *          set password for 'username'@'host' = password('new pw')
 *          忘记root密码：
 *              net stop mysql              --以管理员身份停止mysql服务
 *              mysql --skip-grant-tables   --使用无验证启动mysql
 *              修改用户密码，关闭服务。
 *              打开服务 net start mysql；根据新密码启动数据库
 *      查询用户
 *          use mysql；
 *          select * from user
 * 授权
 *      查询权限：
 *              show grants for 'user'@'host'
 *      授予权限：
 *              grant 权限列表 on 数据库名.表名 to 'user'@'host'
 *              最高权限：GRANT ALL ON *.* TO 'user'@'host'
 *      撤销权限：
 *              revoke 权限列表 on 数据库名.表名 from 'user'@'host'
 *
 */
public class DCL {
}
