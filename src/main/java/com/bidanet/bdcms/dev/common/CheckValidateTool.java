package com.bidanet.bdcms.dev.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yf003 on 2016/12/12.
 */
public class CheckValidateTool {

    /**
     * 验证手机号
     *
     * @param str
     * @return
     */
    public static boolean isPhone(String str) {
        Pattern pattern = Pattern.compile("^1\\d{10}$");
        Matcher phoneCheck = pattern.matcher(str);
        if (!phoneCheck.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 验证邮箱
     *
     * @param str
     * @return
     */
    public static boolean isMail(String str) {
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.([a-zA-Z0-9_-])+)+$");
        Matcher mailCheck = pattern.matcher(str);
        if (!mailCheck.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 验证是否为数字
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 验证身份证号
     * @param str
     * @return
     */
    public static boolean isIdCard(String str) {
        Pattern pattern = Pattern.compile("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }


}
