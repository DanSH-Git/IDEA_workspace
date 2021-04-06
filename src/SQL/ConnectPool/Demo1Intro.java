package SQL.ConnectPool;

/**
 * @author asus1
 * @create 2021/1/12 14:31
 * 数据库连接池：存放数据库连接的容器（集合），系统初始化后，创建容器，容器申请一些连接对象，用户访问时，从容器中获取连接对象。
 *              节约资源，便于用户高效访问
 * 实现：接口DataSource，
 *      获取连接 getConnection()
 *      归还连接 连接对象Connection是从连接池中获取，则Connection.close()将连接对象归还到连接池中
 *
 * 数据连接池技术
 * C3P0：
 *      步骤：1.导入jar包 c3p0-0.9.5.2.jar  ； mchange-commons-java-0.2.12.jar
 *            2.定义配置文件  c3p0.properties or c3p0-config.xml （src目录下）
 *            3.创建核心对象 数据库连接池对象 ComboPooledDataSource
 *            4.获取连接 ：getConnection
 * Druid：
 *      步骤：1.导入jar包 druid-1.0.9.jar
 *            2.定义配置文件 druid.properties 任意目录 手动加载
 *            3.获取对象，工厂类DruidDataSourceFactory
 *      定义工具类：
 *            1.定义类JDBCUtils
 *            2.提供静态代码块加载配置文件，初始化连接池对象
 *            3.提供方法：获取连接，释放资源，获取连接池
 *
 */
public class Demo1Intro {
}
