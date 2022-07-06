package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;

/**
 * mock配置
 *
 * @author by gatesma.
 */
public class LongMockConfig {

    private long min = 1;

    private long max = 100000;


    public LongMockConfig() {
    }

    public LongMockConfig(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public LongMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }
}
