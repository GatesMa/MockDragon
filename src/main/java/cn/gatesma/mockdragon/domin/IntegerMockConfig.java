package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
public class IntegerMockConfig {

    private int min = 1;

    private int max = 100000;


    public IntegerMockConfig() {
    }

    public IntegerMockConfig(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public IntegerMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
