package cn.gatesma.mockdragon.domin;

import cn.gatesma.mockdragon.constant.type.StringMockType;
import java.lang.reflect.Field;
import lombok.Data;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
@Data
public class StringMockConfig {

    private int minCount = 1;

    private int maxCount = 10;

    private StringMockType mockType = StringMockType.ENGLISH_ONLY;

    public StringMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

}
