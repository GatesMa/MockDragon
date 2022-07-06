package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 集合mock配置
 *
 * @author by gatesma.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectionMockConfig {

    /**
     * size
     */
    private int size = 2;

    /**
     * real class
     */
    private Class<?> clazz;

    public CollectionMockConfig(Field field) {
        // TODO 获取属性上的注解
        // list
        // 当前集合的泛型类型
        Type genericType = field.getGenericType();
        if (genericType instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) genericType;
            // 得到泛型里的class类型对象
            clazz = (Class<?>) pt.getActualTypeArguments()[0];
        }
    }

}
