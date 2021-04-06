package Web.JavaScript.BOM;

/**
 * @author asus1
 * @create 2021/1/25 11:18
 * BOM:Browser Object Model 浏览器对象模型，浏览器各个组成部分封装成对象
 *      对象：浏览器Navigator对象，窗口window对象，地址栏location对象，历史记录history对象，显示器屏幕Screen对象
 *            window:不需要创建，直接使用window.方法名（），也可以省略window
 *                   方法：
 *                      1.弹出框  alert（）警告框
 *                               confirm（）带消息的确认框(有boolean型返回值)
 *                               prompt（）可提示输入的框（返回框内输入值）
 *                      2.开发：open（“url”） close（）打开关闭窗口
 *                      3.定时器：setTimeOut（“jsCode”，ms）指定毫秒数后调用函数或者就算表达式
 *                               clearTimeOut（）取消setTimeOut（）方法设置的timeout
 *                               setInterval（）按照指定周期来调用函数或者计算表达式
 *                               clearInterval（）取消
 *                   属性：获取BOM对象 navigator location history screen
 *             location：reload重新加载，获取路径.href
 *             history: 属性：length 返回窗口历史列表中的url数量
 *                      方法：back（） 加载前一个url
 *                           foward（）加载下一个url
 *                           go（）加载具体某个页面
 *
 */
public class day1BOM {
}
