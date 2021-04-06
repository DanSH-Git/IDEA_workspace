package Web.BootStrap;

/**
 * @author asus1
 * @create 2021/1/30 14:39
 * BootStrap:前端开发框架，定义了CSS样式与JS插件，响应式布局（同一套页面兼顾不同设备的设备）
 * 下载引入三个文件夹，创建页面，引入资源文件
 * 资源差异：带min为压缩版
 *
 * 响应式布局：依赖于栅格系统，将一行均分为12个格子，指定元素占几个格子
 *      步骤：1.定义容器，相当于table
 *                  分类：container 固定宽度，宽度随设备变化，有留白
 *                        container-fluid 100%宽度，无留白
 *            2.定义行：相当于之前的tr  样式row
 *            3.定义元素，指定元素在不同设备上，所占格子数。样式col-设备代号-格子数
 *                  设备代号 xs 手机 sm 平板 md 笔记本  lg 台式机
 *      注意：
 *            1.格子数超过12，超出部分自动换行
 *            2.上个属性向上兼容，适用于大于等于分界点大小的设备
 *            3.真实设备小于属性设置最小值，则元素占满整行
 *      全局CSS样式：
 *          按钮 class="btn btn-default primary"
 *          图片 img-responsive 自适应尺寸
 *          表格 table  table-border table -hover
 *          表单
 *       组件
 *          导航条
 *          分页条
 *       轮播图：
 *
 */
public class BSIntro {
}
