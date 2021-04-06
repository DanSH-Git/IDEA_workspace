package Web.XML;

/**
 * @author asus1
 * @create 2021/2/3 14:29
 * XML：Extensible Markup Language可扩展标记语言，标签均自定义。
 * 功能: 存储数据，作为配置文件。
 *       网络中传输数据，纯文本，跨平台
 * xml语法严格，存储数据，标签自定义
 * 第一行必须写文档声明：<?xml version='1.0'?>
 *      属性列表：version版本号  ； encoding 编码方式，默认iso  ；standalone 是否独立
 *     文档中有且只有一个根标签，属性值必须使用引号，xml标签区分大小写
 * 导入css样式<?xml-stylesheet type="text/css" href="路径">
 *
 * 标签规则 包含数字字母下划线，不能以数字或者标点开头，不能包含空格，不能以字母xml开头
 * CDATA区：<![CDATA[数据]]>：数据在此处原样展示，不用转义字符替代
 *
 *约束：规定书写规则
 * 分类：
 *      1.DTD：引入dtd文档到xml文档中，内部dtd将约束规则定义到xml文档中，外部dtd将约束规则定义在外部dtd文件中
 *              本地：<!DOCTYPE students（根标签名） SYSTEM "student.dtd" （文件位置）>
 *              网络：<!DOCTYPE 根标签名 PUBLIC "dtd文件名" "dtd文件位置的URL">
 *        缺陷：无法标签内定义字符串内容
 *      2.Schema：
 *
 * 解析：操作xml文档，将文档中的数据读取到内存中
 *      操作文档：解析、写入
 *      解析方法：
 *              DOM：文档一次性加载进内存，在内存中形成DOM树
 *                   优势：操作方便，对文档进行CRUD的所有操作
 *                   不足：内存占用大
 *              SAX：逐行读取，逐行释放，基于事件驱动
 *                   优势：内存占用小
 *                   缺点：只能读取，无法进行操作
 *
 * 常见解析器：
 *          JAXP：支持DOM和SAX
 *          DOM4J：
 *          Jsoup：可直接解析某个URL地址，HTML文本内容，类似JQuery的操作方法取出和操作数据
 *          PULL：安卓内置解析器，支持SAX思想
 *
 * Jsoup：1.导入jar包
 *        2.获取document对象，代表整个树形结构
 *        3.获取对应标签Element对象
 *        4.获取数据
 */
public class XMLIntro {
}
