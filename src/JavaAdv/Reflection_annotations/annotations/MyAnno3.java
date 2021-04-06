package JavaAdv.Reflection_annotations.annotations;

import java.lang.annotation.*;

/**
 * @author asus1
 * @create 2020/12/21 15:41
 */
@Target(value={ElementType.TYPE})//作用位置
@Retention(RetentionPolicy.RUNTIME)//保留阶段
public @interface MyAnno3 {
    String className();
    String methodName();
}
