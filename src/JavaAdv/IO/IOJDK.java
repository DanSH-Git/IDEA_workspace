package JavaAdv.IO;

import java.io.FileReader;

/**
 * @author asus1
 * @create 2020/11/18 11:21
 * 在try catch 方法中，try后添加一个（）,括号内定义流对象，可在作用域内生效，执行完毕后自动释放流对象
 * 格式：
 *      try(定义流对象){
 *          产生异常的代码
 *      }catch(异常类变量 变量名）
 *      {
 *          异常处理逻辑
 *      }
 */
public class IOJDK {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("src\\JavaAdv.IO\\test.txt");){
            int len=0;
            while((len=fr.read())!=-1)
                System.out.println((char)len);
            fr.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
