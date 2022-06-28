package cn.gatesma.mockdragon.utils;

import cn.gatesma.mockdragon.domin.StringMockConfig;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * 获取随机字符串工具
 *
 * @author by gatesma.
 */
public class StringMockUtils {

    public static String random(StringMockConfig config) {
        int count = RandomUtils.nextInt(config.getMinCount(), config.getMaxCount());
        // TODO 待支持中文
        return randomEnglish(count);
    }

    /**
     * <p>创建一个随机字符串，其长度是指定的字符数,字符将从参数的字母数字字符集中选择，如参数所示。</p>
     * <p>count:计算创建的随机字符长度</p>
     * <p>start:字符集在开始时的位置</p>
     * <p>end:字符集在结束前的位置，必须大于65</p>
     * <p>letters true,生成的字符串可以包括字母字符</p>
     * <p>numbers true,生成的字符串可以包含数字字符</p>
     * <br/>
     * <p>汉字Unicode编码的区间为：0x4E00->0x9fa5 https://www.cnblogs.com/hulian425/p/14738409.html</p>
     *
     * <a href="https://blog.csdn.net/weixin_34345560/article/details/91984205">unicode字符范围</a>
     */
    public static String randomChinese(int count) {
        return RandomStringUtils.random(count, 0x4e00, 0x9fa5, false, false);
    }

    public static String randomEnglish(int count) {
        return RandomStringUtils.random(count, 5, 129, true, false);
    }


    public static void main(String[] args) {
        System.out.println(randomChinese(1000));
        System.out.println(randomEnglish(1000));
    }


}
