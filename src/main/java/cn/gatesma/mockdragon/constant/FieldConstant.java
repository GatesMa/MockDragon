package cn.gatesma.mockdragon.constant;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * FieldConstant
 *
 * @author by gatesma.
 */
public class FieldConstant {

    public static final String TYPE_STRING = "java.lang.String";

    public static final String TYPE_LONG = "java.lang.Long";
    public static final String TYPE_LONG_ORIGIN = "long";

    public static final String TYPE_SHORT = "java.lang.Short";
    public static final String TYPE_SHORT_ORIGIN = "short";

    public static final String TYPE_INTEGER = "java.lang.Integer";
    public static final String TYPE_INTEGER_ORIGIN = "int";

    public static final String TYPE_DOUBLE = "java.lang.Double";
    public static final String TYPE_DOUBLE_ORIGIN = "double";

    public static final String TYPE_FLOAT = "java.lang.Float";
    public static final String TYPE_FLOAT_ORIGIN = "float";

    public static final String TYPE_LIST = "java.util.List";

    public static Set<Class<?>> GENE_CLASS_SET = new HashSet<>();

    static {
        GENE_CLASS_SET.add(String.class);
        GENE_CLASS_SET.add(Long.class);
        GENE_CLASS_SET.add(long.class);
        GENE_CLASS_SET.add(Short.class);
        GENE_CLASS_SET.add(short.class);
        GENE_CLASS_SET.add(Integer.class);
        GENE_CLASS_SET.add(int.class);
        GENE_CLASS_SET.add(Double.class);
        GENE_CLASS_SET.add(double.class);
        GENE_CLASS_SET.add(Float.class);
        GENE_CLASS_SET.add(float.class);
        GENE_CLASS_SET.add(List.class);
        GENE_CLASS_SET.add(Set.class);
    }

}
