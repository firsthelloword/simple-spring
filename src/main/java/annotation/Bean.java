package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author zhangyongkai
 * @date 2023/10/12-17:16
 */
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface Bean {

    String name() default "";

    String value() default "";
}
