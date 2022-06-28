package cn.gatesma.mockdragon.domin;

import cn.gatesma.mockdragon.constant.type.StringMockType;
import java.lang.reflect.Field;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
public class StringMockConfig {

    private int minCount = 1;

    private int maxCount = 10;

    private StringMockType mockType = StringMockType.ENGLISH_ONLY;

    public StringMockConfig() {
    }

    public StringMockConfig(Integer minCount, Integer maxCount, StringMockType mockType) {
        this.minCount = minCount;
        this.maxCount = maxCount;
        this.mockType = mockType;
    }

    public StringMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

    public Integer getMinCount() {
        return minCount;
    }

    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public StringMockType getMockType() {
        return mockType;
    }

    public void setMockType(StringMockType mockType) {
        this.mockType = mockType;
    }
}
