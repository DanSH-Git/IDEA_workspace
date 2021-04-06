package Web.JavaScript.DOM;

/**
 * @author asus1
 * @create 2021/1/25 9:54
 * DOM：Document Object Model 文档对象模型，控制html文档，将各组成部分封装成对象，使用对象，进行CRUD动态操作
 * 获取页面标签document.getElementById(id) 通过元素id获取元素对象。
 * 操作对象： 对象名.属性值="   ";
 *      1设置属性：明确获取对象，根据属性设置
 *      2修改标签体内容：innerHTML
 *  事件：组件执行某些操作后，触发某些代码的执行
 *        可在标签上指定事件的属性，也可指定函数，将属性改变置于函数中实现
 *  核心DOM对象：
 *      Document文档对象
 *                  方法1获取Element对象
 *                          getElementById()根据id获取元素，id属性唯一
 *                          getElementByTagName()根据元素名称获取元素对象，返回一个数组
 *                          getElementByClassName()根据class属性值获取元素对象
 *                          getElementByName()
 *                  方法2创建其他DOM对象
 *                          createAttribute（name）
 *                          createComment（）
 *                          createElement（）
 *                          createTextNode（）
 *      Element元素对象
 *                  通过document创建与获取
 *                  方法：
 *                      removeAttribute
 *                      setAttribute
 *      Node节点对象 是整个DOM的主要数据类型。所有DOM对象都阔以被认为是Node对象。
 *          CRUD:
 *              appendChild() 向节点的子节点列表的结尾添加新的子节点
 *              removeChild() 删除并返回当前节点的指定子节点
 *              replaceChild() 用新节点替换一个子节点
 *          属性：parentNode 返回节点的父节点
 *
 *
 * HTML DOM:
 *      1.标签体的设置与获取：innerHTML
 *      2.使用属性
 *      3.设置样式： 标签体.style.css样式=“样式内容”
 *                  提前定义类选择器样式 .name{}  ,随后通过classname属性设置样式
 */
public class day1Dom {
}
