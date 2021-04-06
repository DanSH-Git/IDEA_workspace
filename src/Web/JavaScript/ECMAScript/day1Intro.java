package Web.JavaScript.ECMAScript;

/**
 * @author asus1
 * @create 2021/1/21 13:39
 * JavaScript：客户端脚本语言（不需编译），运行在客户端浏览器中，浏览器有JavaScript解析引擎
 * 功能：增强用户与HTML页面交互，控制元素，增加动态效果。
 * JavaScript=ECMAScript+BOM+DOM
 *
 * ECMAScript：客户端脚本语言的标准;
 *             基本语法：
 *                  与html的结合方式，内部外部Js <script></script>
 *                     定义位置影响执行顺序；可以定义多个，外部通过src属性引入。
 *             数据类型：number（整数/小数/NaN），string, boolean .null（对象为空的占位符），unified（未赋值 的变量）
 *             java强类型（开辟变量空间存储固定类型的数据），JS弱类型（变量空间存储任意类型数据）var
 *             输出 document.write() 类型查看typeof 换行“<br>"
 *
 *             一元运算符：++ -- +
 *             在JS中，如果运算数不是运算符所要求的类型，js将自动将运算数进行类型转换
 *
 *             比较运算符 :
 *                  1.类型相同：直接比较，字符串中，按位主义比较，直到得出大小为止
 *                  2.类型不同，先进行类型转换，再比较 ===全等于，首先判断类型，类型不对则false
 *
 *             逻辑运算符 && || ！
 *                  类型转换 ！ ：（1） number 0或NaN假 非0真 （2）字符串 空串false （3）null&undefined false（4）Object true
 *                  If(obj！=null&&obj.length>0 ) === if(obj)
 *
 *             三元运算符 （表达式？value1：value2） 如：A>B?C:D  A>B=C反之为D
 *
 *             特殊语法：变量定义带var为局部变量，不带var为全局变量
 *
 *
 *
 *
 */
public class day1Intro {
}
