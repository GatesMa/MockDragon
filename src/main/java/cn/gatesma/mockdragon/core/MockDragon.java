package cn.gatesma.mockdragon.core;

import static cn.gatesma.mockdragon.constant.FieldConstant.TYPE_STRING;

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
                field.setAccessible(true); //设置些属性是可以访问的
                System.out.println("filedName: " + field.getName());
                Class<?> type = field.getType();
                System.out.println("type: " + type);
                if (type.getName().equals(TYPE_STRING)) {
                    field.set(instance, "sfoisFj");
                }

            }

        } catch (Exception e) {
            // TODO
        }
        return instance;
    }

}
