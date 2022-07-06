package cn.gatesma.mockdragon.utils;

import cn.gatesma.mockdragon.domin.DoubleMockConfig;
import cn.gatesma.mockdragon.domin.FloatMockConfig;
import cn.gatesma.mockdragon.domin.IntegerMockConfig;
import cn.gatesma.mockdragon.domin.LongMockConfig;
import cn.gatesma.mockdragon.domin.ShortMockConfig;
import org.apache.commons.lang3.RandomUtils;

/**
 * 获取随机数字工具
 *
 * @author by gatesma.
 */
public class NumberMockUtils {

    public static Long random(LongMockConfig config) {
        return RandomUtils.nextLong(config.getMin(), config.getMax());
    }

    public static Short random(ShortMockConfig config) {
        return (short) RandomUtils.nextInt(config.getMin(), config.getMax());
    }

    public static Integer random(IntegerMockConfig config) {
        return RandomUtils.nextInt(config.getMin(), config.getMax());
    }

    public static Double random(DoubleMockConfig config) {
        return RandomUtils.nextDouble(config.getMin(), config.getMax());
    }

    public static Float random(FloatMockConfig config) {
        return RandomUtils.nextFloat(config.getMin(), config.getMax());
    }

}
