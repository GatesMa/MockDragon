package cn.gatesma.mockdragon.core;

import static cn.gatesma.mockdragon.constant.FieldConstant.GENE_CLASS_SET;

import cn.gatesma.mockdragon.domin.CollectionMockConfig;
import cn.gatesma.mockdragon.domin.DoubleMockConfig;
import cn.gatesma.mockdragon.domin.FloatMockConfig;
import cn.gatesma.mockdragon.domin.IntegerMockConfig;
import cn.gatesma.mockdragon.domin.LongMockConfig;
import cn.gatesma.mockdragon.domin.MockContext;
import cn.gatesma.mockdragon.domin.ShortMockConfig;
import cn.gatesma.mockdragon.domin.StringMockConfig;
import cn.gatesma.mockdragon.utils.CollectionMockUtils;
import cn.gatesma.mockdragon.utils.NumberMockUtils;
import cn.gatesma.mockdragon.utils.StringMockUtils;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * 核心工具类
 *
 * @author by gatesma.
 */
@Slf4j
public class MockDragon {

    /**
     * createInstance
     *
     * @param clazz 类
     */
    public static <T> T createInstance(@NonNull Class<T> clazz) {
        // new object
        return createInstance(MockContext.builder().clazz(clazz).build());
    }


    /**
     * createInstance
     *
     * @param context 上下文
     */
    @SuppressWarnings("unchecked")
    public static <T> T createInstance(MockContext context) {
        Class<?> clazz = context.getClazz();
        // new object
        T instance = null;
        try {
            if (GENE_CLASS_SET.contains(clazz)) {
                // 基本类型
                return (T) createBasicInstance(context);
            } else {
                // 对象类型
                return (T) createClassInstance(clazz);
            }
        } catch (Exception e) {
            log.error("createInstance error happened ", e);
        }
        return null;
    }

    private static <T> T createClassInstance(Class<T> clazz) {
        // new object
        T instance = null;
        try {
            instance = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                //设置属性是可以访问的
                field.setAccessible(true);
                Class<?> type = field.getType();
                field.set(instance, createInstance(new MockContext(field)));
            }

        } catch (Exception e) {
            log.error("createClassInstance error", e);
        }
        return instance;
    }

    /**
     * 获取关注的类型
     *
     * @param context 上下文
     */
    private static Object createBasicInstance(MockContext context) {
        Class<?> clazz = context.getClazz();
        if (String.class.equals(clazz)) {
            // string
            StringMockConfig config = new StringMockConfig();
            return StringMockUtils.random(config);
        } else if (Long.class.equals(clazz) || long.class.equals(clazz)) {
            // long
            LongMockConfig config = new LongMockConfig();
            return NumberMockUtils.random(config);
        } else if (Short.class.equals(clazz) || short.class.equals(clazz)) {
            // short
            ShortMockConfig config = new ShortMockConfig();
            return NumberMockUtils.random(config);
        } else if (Integer.class.equals(clazz) || int.class.equals(clazz)) {
            // int
            IntegerMockConfig config = new IntegerMockConfig();
            return NumberMockUtils.random(config);
        } else if (Double.class.equals(clazz) || double.class.equals(clazz)) {
            // double
            DoubleMockConfig config = new DoubleMockConfig();
            return NumberMockUtils.random(config);
        } else if (Float.class.equals(clazz) || float.class.equals(clazz)) {
            // float
            FloatMockConfig config = new FloatMockConfig();
            return NumberMockUtils.random(config);
        } else if (List.class.equals(clazz)) {
            // list
            CollectionMockConfig config = new CollectionMockConfig();
            config.setClazz(context.getGenericClass());
            return CollectionMockUtils.randomList(config);
        } else if (Set.class.equals(clazz)) {
            // set
            CollectionMockConfig config = new CollectionMockConfig();
            config.setClazz(context.getGenericClass());
            return CollectionMockUtils.randomSet(config);
        }
        log.debug("not support basic type:{}", clazz);
        return null;
    }

}
