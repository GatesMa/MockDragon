package cn.gatesma.mockdragon.constant.type;

/**
 * StringMockType
 *
 * @author by gatesma.
 */
public enum StringMockType {

    ENGLISH_ONLY("英文"),
    CHINESE_ONLY("中文"),
    NUMBER_ONLY("数字");

    private final String desc;

    StringMockType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
