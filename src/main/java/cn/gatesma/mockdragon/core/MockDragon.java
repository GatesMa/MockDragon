package cn.gatesma.mockdragon.core;

import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_DOUBLE;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_DOUBLE_ORIGIN;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_FLOAT;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_FLOAT_ORIGIN;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_INTEGER;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_INTEGER_ORIGIN;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_LONG;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_LONG_ORIGIN;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_SHORT;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_SHORT_ORIGIN;
import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_STRING;

import cn.gatesma.mockdragon.domin.DoubleMockConfig;
import cn.gatesma.mockdragon.domin.FloatMockConfig;
import cn.gatesma.mockdragon.domin.IntegerMockConfig;
import cn.gatesma.mockdragon.domin.LongMockConfig;
import cn.gatesma.mockdragon.domin.ShortMockConfig;
import cn.gatesma.mockdragon.domin.StringMockConfig;
import cn.gatesma.mockdragon.utils.NumberMockUtils;
import cn.gatesma.mockdragon.utils.StringMockUtils;
import java.lang.reflect.Field;

/**
 * 核心工具类
 *
 * @author by gatesma.
 */
public class MockDragon {


    /**
     * test
     */
    public static <T> T createInstance(Class<T> clazz) {
        // new object
        T instance = null;
        try {
            instance = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                //设置属性是可以访问的
                field.setAccessible(true);
                Class<?> type = field.getType();
                String typeName = type.getName();
                if (TYPE_STRING.equals(typeName)) {
                    StringMockConfig config = new StringMockConfig(field);
                    field.set(instance, StringMockUtils.random(config));
                } else if (TYPE_LONG.equals(typeName) || TYPE_LONG_ORIGIN.equals(typeName)) {
                    LongMockConfig config = new LongMockConfig(field);
                    field.set(instance, NumberMockUtils.random(config));
                } else if (TYPE_SHORT.equals(typeName) || TYPE_SHORT_ORIGIN.equals(typeName)) {
                    ShortMockConfig config = new ShortMockConfig(field);
                    field.set(instance, NumberMockUtils.random(config));
                } else if (TYPE_INTEGER.equals(typeName) || TYPE_INTEGER_ORIGIN.equals(typeName)) {
                    IntegerMockConfig config = new IntegerMockConfig(field);
                    field.set(instance, NumberMockUtils.random(config));
                } else if (TYPE_DOUBLE.equals(typeName) || TYPE_DOUBLE_ORIGIN.equals(typeName)) {
                    DoubleMockConfig config = new DoubleMockConfig(field);
                    field.set(instance, NumberMockUtils.random(config));
                } else if (TYPE_FLOAT.equals(typeName) || TYPE_FLOAT_ORIGIN.equals(typeName)) {
                    FloatMockConfig config = new FloatMockConfig(field);
                    field.set(instance, NumberMockUtils.random(config));
                }

            }

        } catch (Exception e) {
            //
            //
            // TODO
        }
        return instance;
    }

}
