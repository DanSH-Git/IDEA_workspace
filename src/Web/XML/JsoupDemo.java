package Web.XML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author asus1
 * @create 2021/2/12 22:26
 */
public class JsoupDemo {
    public static void main(String[] args) throws IOException {
//        获取document对象，根据xml文档获取,获取路径
        String path=JsoupDemo.class.getClassLoader().getResource("Web/XML/student.xml").getPath();
//        解析xml文档，加载文档进内存，获取DOM树
        Document doc = Jsoup.parse(new File(path), "utf-8");
//        获取元素对象Element
        Elements ele_names = doc.getElementsByTag("name");
        System.out.println(ele_names.size());
//        获取第一个name的Element对象
        Element ele=ele_names.get(0);
        String text = ele.text();
        System.out.println(text);
    }
}
