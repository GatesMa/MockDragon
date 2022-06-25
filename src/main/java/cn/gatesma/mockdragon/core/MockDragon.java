package cn.gatesma.mockdragon.core;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

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
        try {
            // new object
            T instance = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("filedName: " + field.getName());
                Class<?> type = field.getType();
                System.out.println("type: " + type);
                Type genericType = field.getGenericType();
                System.out.println(genericType.getTypeName());
                

            }
        } catch (Exception e) {
            // TODO
            return null;
        }

        return null;
    }

}
