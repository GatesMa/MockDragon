package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
public class ShortMockConfig {

    private short min = 1;

    private short max = 10000;


    public ShortMockConfig() {
    }

    public ShortMockConfig(short min, short max) {
        this.min = min;
        this.max = max;
    }

    public ShortMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

    public short getMin() {
        return min;
    }

    public void setMin(short min) {
        this.min = min;
    }

    public short getMax() {
        return max;
    }

    public void setMax(short max) {
        this.max = max;
    }
}
