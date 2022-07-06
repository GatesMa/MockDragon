package cn.gatesma.mockdragon.domin;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * MockContext
 *
 * @author by gatesma.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MockContext {


    private Class<?> clazz;

    /**
     * 如果是List类型，得到其Generic的类型
     */
    private Type genericType;

    public MockContext(Field field) {
        clazz = field.getType();
        genericType = field.getGenericType();
    }

    public Class<?> getGenericClass() {
        if (genericType == null) {
            return null;
        }
        // 如果是泛型参数的类型
        if (genericType instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) genericType;
            //得到泛型里的class类型对象
            return (Class<?>) pt.getActualTypeArguments()[0];
        }
        return null;
    }

}
