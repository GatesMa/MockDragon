package cn.gatesma.mockdragon.core;

import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_STRING;

import cn.gatesma.mockdragon.domin.StringMockConfig;
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
                if (TYPE_STRING.equals(type.getName())) {
                    StringMockConfig config = new StringMockConfig(field);
                    field.set(instance, StringMockUtils.random(config));
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
