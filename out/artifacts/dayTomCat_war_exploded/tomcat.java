package Web;

/**
 * @author asus1
 * @create 2021/2/26 16:37
 *
 * tomcat 端口号占用：https://blog.csdn.net/AcTarjan/article/details/82990196
 * 启动 localhost：8080
 * 配置： 文件放在 webapps localhost：8080/文件名
 * 部署 1.项目打包为.war包 自动解压 自动删除
 *      2.配置conf/server.xml 在<host>标签体中配置<Context docBase="" path=""/>
 *          docBase项目存放路径， path 虚拟路径
 *      3.在conf/Catalina/localhost创建任意名称的xml文件，在文件中编写<Context docBase="D:\hello" /> 热部署
 *
 * 目录结构：WEB——INF
 *              web.xml 核心配置文件
 *              classes 字节码文件名目录
 *              lib 放置依赖jar包
 */
public class tomcat {
}
