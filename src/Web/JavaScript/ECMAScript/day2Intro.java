package Web.JavaScript.ECMAScript;

/**
 * @author asus1
 * @create 2021/1/23 14:01
 * Js对象：
 *   1.基本对象：
 *          Function：方法定义时，形参类型不用写。
 *                    定义名称相同的方法，会覆盖；
 *                    调用只与方法的名称有关，和参数列表无关。
 *                    方法声明中有一个隐藏的内置对象，argument封装所有实际参数
 *          Array：元素类型可变；长度可变（越界后为unified）
 *          Date tolocalString()转换为本地字符串格式；gettime获得毫秒值（1970/1/1）
 *          Math random 0到1之间的随机数，左闭右开；round四舍五入 ceil向上取整 floor向下取整
 *          Number
 *          String
 *          boolean
 *          RegExp：字符串组成规则
 *                  单个字符[] 如[a] [a-z] [A-Z]
 *                  \d 当个数字字符 [0-9] \w 单个单词字符[a-zA-Z0-9]
 *                  遇到转移符号 双写\\
 *                  量词符号：？出现0次或一次，*出现0次或多次 +出现1次或多次 {m，n}出现次数 介于mn 缺省一个则限定单一范围。
 *                  开始^ 结束$
 *                  reg对象.test(参数) 验证是否符合正则表达式的规范
 *          Global ：全体对象，封装的方法不需要对象就可以直接调用，方法名（）；
 *                   encodeURI（）url编码：将二进制转换为16进制
 *                   decodeURI（）url解码
 *                   encodeURIComponent（）url编码
 *                   decodeURIComponent（）url解码
 *                   parseInt()字符串转数字，
 *                   eval: 解析js语句并执行
 */
public class day2Intro {
}
