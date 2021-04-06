package SQL;

/**
 * @author asus1
 * @create 2020/12/24 15:55
 *DDL:
 *    1.数据库操作C(Create)R(Retrieve)U(Update)D(Delete)
 *    创建:
 *          create database db-name (character set 字符集名);
 *          create database if not exists db-name;
 *     查询：
 *          show database db-name;
 *          show create database db-name;查询数据库字符集
 *     修改：
 *          alter database db-name character set 字符集名称;
 *     删除：
 *          drop database db-name;
 *     使用数据库：
 *          select database();
 *          use db-name
 *
 *      2.表操作C(Create)R(Retrieve)U(Update)D(Delete)
 *      创建：
 *          create table 表名(
 *              列1 数据类型1，
 *              列2 数据类型2，
 *              ...
 *              列n 数据类型n
 *          );
 *
 *      查询：
 *          show tables;
 *          desc 表名；查询表结构
 *      修改：
 *          表名：alter table 原列名 rename to 新列名;
 *          字符集：alter table 表名 character set 字符集名称;
 *          添加列：alter table 表名 add 列名 数据类型;
 *          修改列名：alter table 表名 change 原列名 新列名 字符集名称;
 *          修改列类型：alter table 表名 modify 列名 字符集名称;
 *          删除列：
 *      删除：
 *          drop table 表名；
 *          drop table if exists 表名;
 */
public class DDL {
}
