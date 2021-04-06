package SQL;

/**
 * @author asus1
 * @create 2020/12/27 16:51
 * 约束：确保字段的完整性，正确性，有效性
 * not null  ,unique , primary key 非空且唯一 ,foreign key.
 * 唯一约束unique
 *      唯一约束unique限定的值可以有多个null
 * 添加约束
 *      Alter table 表名 MODIFY 字段名 约束
 * 删除约束
 *      Alter table 表名 MODIFY 字段名
 * 删除主键
 *      Alter table 表名 DROP PRIMARY KEY
 * 自动增长：auto_increment
 *          ALTER TABLE stu MODIFY num INT  -- 删除自动增长
 *          ALTER TABLE stu MODIFY num INT AUTO_INCREMENT  -- 添加增长
 *
 * 外键约束：
 *      create table 表名(
 *          ...
 *          外键列
 *          constraint 外键名称 foreign key 外键列名称 references 主表名称（主表列名称）
 *      );
 *
 *      删除外键
 *          Alter Table 表名 drop foreign key 外键名称
 *      添加外键
 *          Alter Table 表名 add   constraint 外键名称 foreign key 外键列名称 references 主表名称（主表列名称）
 *
 * 级联：
 *      更新：
 *       Alter Table 表名 add   constraint 外键名称 foreign key 外键列名称 references 主表名称（主表列名称）
 *       on update cascade
 *       删除：
 *       Alter Table 表名 add   constraint 外键名称 foreign key 外键列名称 references 主表名称（主表列名称）
 *       on delete cascade
 *
 */
public class Constraint {

}
