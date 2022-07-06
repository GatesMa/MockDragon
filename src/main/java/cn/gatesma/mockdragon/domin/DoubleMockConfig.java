package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;

/**
 * 字符串mock配置
 *
 * @author by gatesma.
 */
public class DoubleMockConfig {

    private double min = 1;

    private double max = 100;


    public DoubleMockConfig() {
    }

    public DoubleMockConfig(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public DoubleMockConfig(Field field) {
        // TODO 获取属性上的注解
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
