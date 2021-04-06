package SQL;

/**
 * @author asus1
 * @create 2021/1/4 9:04
 *
 * Transaction
 * 基本介绍
 *      事务概念：包含多个步骤的业务处理，被事务管理，则要么同时成功，要么同时失败。异常则回滚。
 *      操作：开启事务start transaction，回滚rollback，提交commit。
 *      MySQL中DML(增删改)默认提交事务，持久化更新；如果开启事务不提交，关闭窗口将自动回滚。
 *      查看默认提交方式 ：Select @@autocommit;  1自动，0手动
 *      修改默认提交方式 ：Set @@autocommit=1/0;
 * 四大特征
 *      1.原子性，不可分割的最小操作单位。
 *      2.持久性,一旦提交或回滚，数据库会持久化保存数据。
 *      3.隔离性,多个事务之间相互独立。
 *      4.一致性,数据操作前后，数据总量不变。
 * 隔离级别
 *      概念：多个事务之间是隔离，相互独立的，但如果多个事务同时操作同一批数据，会引发问题，可通过设置不同隔离级别解决
 *      存在问题：
 *          1.脏数据：事务读取到另一个事务未提交的数据
 *          2.不可重复读(虚读)：同一事务中，两次读取到的数据不同
 *          3.幻读：一个事务操作数据表中所有记录，另一个事务添加了一条数据，则第一个事务查询不到自己的修改
 *      隔离级别：
 *          1. read uncommitted 读未提交 : 1,2,3
 *          2. read committed 读已提交: 2,3
 *          3. repeatable read 可重复读: 3
 *          4. serializable 串行化：
 *      隔离级别从小到大，安全性越来越高，但效率越来越低
 *      查询隔离级别： select @@tx_isolation
 *      设置隔离级别：set global transaction isolation level 级别字符串；
 *
 *
 */
public class Transaction {
}
