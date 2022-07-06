package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;
import lombok.Data;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
@Data
public class FloatMockConfig {

    private float min = 1;

    private float max = 100000;


    public FloatMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

}
