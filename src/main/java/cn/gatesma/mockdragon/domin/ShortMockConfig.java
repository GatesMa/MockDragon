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
public class ShortMockConfig {

    private short min = 1;

    private short max = 10000;


    public ShortMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

}
