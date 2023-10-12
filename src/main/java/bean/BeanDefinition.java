package bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangyongkai
 * @date 2023/10/12-15:55
 */
@Getter
@Setter
public class BeanDefinition {


    private String name;

    private Class className;

    /**
     * 是否单例
     */
    private Boolean idSingleton;
}
