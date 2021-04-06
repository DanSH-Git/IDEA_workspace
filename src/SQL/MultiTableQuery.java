package SQL;

/**
 * @author asus1
 * @create 2020/12/30 20:05
 * 多表查询直接查询，组成笛卡尔积，即两个集合的所有组成情况
 * 需要消除无用的数据
 *
 * 多表查询分类：
 *      1.内连接： 确定表 ，字段，条件
 *          隐式：
 *               select xx1,xx2,xxn from table1 t1, table2 t2 where condition
 *          显式：
 *              select 字段 from table1 (inner) join table2 on condition
 *      2.外连接：
 *          左外连接：查询左表所有数据以及其交集部分
 *                   select 字段 from table1 lift (outer) join table2 on condition
 *          右外连接： 查询左表所有数据以及其交集部分
 *                  select 字段 from table1 right (outer) join table2 on condition
 *      3.子查询：查询中嵌套查询，被嵌套的部分为子查询
 *
 *      子查询查询情况不同，
 *          单行单列：子查询作为条件，使用运算符判断
 *          多行单列：子查询作为条件，使用in判断，
 *          多行多列：子查询作为虚拟表查询
 */
public class MultiTableQuery {

}
