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
     * createInstance
     *
     * @param clazz 类
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
                switch (typeName) {
                    case TYPE_STRING: {
                        StringMockConfig config = new StringMockConfig(field);
                        field.set(instance, StringMockUtils.random(config));
                        break;
                    }
                    case TYPE_LONG:
                    case TYPE_LONG_ORIGIN: {
                        LongMockConfig config = new LongMockConfig(field);
                        field.set(instance, NumberMockUtils.random(config));
                        break;
                    }
                    case TYPE_SHORT:
                    case TYPE_SHORT_ORIGIN: {
                        ShortMockConfig config = new ShortMockConfig(field);
                        field.set(instance, NumberMockUtils.random(config));
                        break;
                    }
                    case TYPE_INTEGER:
                    case TYPE_INTEGER_ORIGIN: {
                        IntegerMockConfig config = new IntegerMockConfig(field);
                        field.set(instance, NumberMockUtils.random(config));
                        break;
                    }
                    case TYPE_DOUBLE:
                    case TYPE_DOUBLE_ORIGIN: {
                        DoubleMockConfig config = new DoubleMockConfig(field);
                        field.set(instance, NumberMockUtils.random(config));
                        break;
                    }
                    case TYPE_FLOAT:
                    case TYPE_FLOAT_ORIGIN: {
                        FloatMockConfig config = new FloatMockConfig(field);
                        field.set(instance, NumberMockUtils.random(config));
                        break;
                    }
                    default:
                        break;
                }

            }

        } catch (Exception e) {
            /*
             TODO
            */
        }
        return instance;
    }

}
