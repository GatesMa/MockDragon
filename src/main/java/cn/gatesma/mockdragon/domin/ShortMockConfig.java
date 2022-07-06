package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;
import lombok.Data;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
@Data
public class ShortMockConfig {

    private short min = 1;

    private short max = 10000;


    public ShortMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

}
