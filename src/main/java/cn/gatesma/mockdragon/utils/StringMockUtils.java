package cn.gatesma.mockdragon.utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 获取随机字符串工具
 *
 * @author by gatesma.
 */
public class StringMockUtils {

    /**
     * <p>创建一个随机字符串，其长度是指定的字符数,字符将从参数的字母数字字符集中选择，如参数所示。</p>
     * <p>count:计算创建的随机字符长度</p>
     * <p>start:字符集在开始时的位置</p>
     * <p>end:字符集在结束前的位置，必须大于65</p>
     * <p>letters true,生成的字符串可以包括字母字符</p>
     * <p>numbers true,生成的字符串可以包含数字字符</p>
     * <br/>
     * <p>汉字Unicode编码的区间为：0x4E00->0x3fa5</p>
     */
    public static String randomChinese(int count) {
        return RandomStringUtils.random(count, 0x4e00, 0x9fa5, false, false);
    }

    public static void main(String[] args) {
        System.out.println(randomChinese(10));
    }


}
