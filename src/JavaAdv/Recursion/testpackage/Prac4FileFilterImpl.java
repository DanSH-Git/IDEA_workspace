package JavaAdv.Recursion.testpackage;

import java.io.File;
import java.io.FileFilter;

/**
 * @author asus1
 * @create 2020/11/12 20:37
 */
public class Prac4FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        pathname.toString().endsWith(".java");
        return true;
    }
}
