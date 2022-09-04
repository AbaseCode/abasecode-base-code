package com.abasecode.opencode.base.code.enums;

/**
 * @author Jon
 * e-mail: ijonso123@gmail.com
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://github.com/abasecode">project github</a>
 * url: <a href="https://abasecode.com">AbaseCode.com</a>
 */
public enum ResultMessageEnum {
    SYSTEM_ERROR("System error!"),
    SYSTEM_SUCCESS("Everything are well done!"),
    SYSTEM_OK("OK!");
    String value;

    ResultMessageEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}