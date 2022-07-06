package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;
import lombok.Data;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
@Data
public class IntegerMockConfig {

    private int min = 1;

    private int max = 100000;


    public IntegerMockConfig(Field field) {
        // TODO 获取属性上的注解
    }
}
