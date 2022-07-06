package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
public class FloatMockConfig {

    private float min = 1;

    private float max = 100000;


    public FloatMockConfig() {
    }

    public FloatMockConfig(float min, float max) {
        this.min = min;
        this.max = max;
    }

    public FloatMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }
}
