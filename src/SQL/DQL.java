package SQL;

/**
 * @author asus1
 * @create 2020/12/25 9:11
 * DQL：查询语句
 * 查询语法：
 *      select 字段 from 表 where 条件 group by 分组字段 having 分组条件 order by 顺序 limit 分页限定
 *去除重复结果集
 *      distinct  SELECT DISTINCT sex FROM stu
 *常用运算符：
 *      A or B or C =in (A,B,C)
 *      like模糊查询：  _ 单个任意字符    % 多个任意字符
 *判断null：
 *      ifNUll（为null值，替代值）
 *      
 *      1.排序查询：order by
 *      2.聚合函数：排除null.  sum count min max avg
 *      3.分组查询: group by
 *                  查询字段：分组字段（group by后分组的字段），聚合函数
 *                  where 与 having：
 *                      1，where 分组前限定，having分组后限定
 *                      2，having可对聚合函数进行判定。
 *      4.分页查询：limit 开始的索引，每页查询的条数
 *                 公式：开始的索引=（当前页码-1）*每页显示的条数
 *
 *
 */
public class DQL {
}
