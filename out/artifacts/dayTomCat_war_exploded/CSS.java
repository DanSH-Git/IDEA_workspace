package Web;

/**
 * @author asus1
 * @create 2021/1/19 16:25
 * CSS:  美化与布局设置，层叠样式表。
 *      好处：分离内容与表现形式，降低耦合度 ，便于分工，提高开发效率
 *分类：
 *      内联样式，在标签内使用style属性指定css代码 ，<div style="color:red"></div>作用于当前标签
 *      内部样式：定义标签体内容div{color :blue;} ，作用于当前页面
 *      外部样式：在外部定义css资源文件，在head标签呢你，定义link标签，引入外部资源文件。<link  href="css/a.css">
 *          或者<style>@import "css/a.css" ;</style>
 * 格式
 *      选择器{
 *                 属性名1：属性值1；
 *                 属性名2：属性值2；
 *               ...
 *              }
 * 选择器：筛选具有相似特征的元素
 *        1基础选择器
 *              （1）id选择器
 *                      #id属性值{}
 *                      如<div id="div2"></div>
 *                        <div id="div1"></div>
 *                      #div1{}
 *              （2）元素选择器：选择具有相同标签名称的元素
 *                      div{}
 *               (3) 类选择器:选择相同class属性值数据
 *                      .class{}
 *               权限：（1）>(3)>(2)
 *
 *        2拓展选择器
 *              （1）选择所有元素 *{}
 *              （2）并集选择器 选择器1，选择器2{}
 *              （3）子选择器（筛选选择器1下选择器2） 选择器1 选择器2{}
 *              （4）父选择器 （筛选选择器2的父选择器1） 选择器1>选择器2{}
 *              （5）属性选择器 选择元素名称，属性名=属性值元素    元素名称[属性名=“属性值”]{}
 *              （6）伪类选择器 选择一些元素具有的状态   元素：状态{}
 *                                                         状态：
 *                                                              link：初始化的状态（蓝）
 *                                                              visited： 被访问过的状态（黄）
 *                                                              active：正在访问状态（红）
 *                                                              hover：鼠标悬浮状态（鼠标变小手）
 *   属性：
 *          1，字体文本
 *          2. 背景
 *          3. 边框 border 复合属性
 *          4. 尺寸
 *          5. 盒子模型 margin外边距 padding内边距
 */
public class CSS {
}
