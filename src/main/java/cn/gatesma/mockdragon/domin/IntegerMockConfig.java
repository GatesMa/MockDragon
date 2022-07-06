package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * mock配置
 *
 * @author by gatesma.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IntegerMockConfig {

    private int min = 1;

    private int max = 100000;


    public IntegerMockConfig(Field field) {
        // TODO 获取属性上的注解
    }
}
