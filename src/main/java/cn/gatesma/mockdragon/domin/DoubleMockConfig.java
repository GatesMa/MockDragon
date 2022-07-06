package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;
import lombok.Data;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
@Data
public class DoubleMockConfig {

    private double min = 1;

    private double max = 100;


    public DoubleMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

}
