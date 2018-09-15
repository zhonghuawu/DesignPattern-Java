package com.huaa.Util;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2018/9/16 0:59
 */

public class StringUtil {

    private StringUtil() {

    }

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }

}
