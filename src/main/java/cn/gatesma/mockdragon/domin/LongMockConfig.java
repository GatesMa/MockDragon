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
public class LongMockConfig {

    private long min = 1;

    private long max = 100000;


    public LongMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

}
