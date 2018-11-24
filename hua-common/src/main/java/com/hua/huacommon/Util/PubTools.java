package com.hua.huacommon.Util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 公共方法类
 *
 * @auther: hua
 * @date: 2018/11/24 19:40
 */
public class PubTools {

    /**
     * 统计某个字符出现的次数
     *
     * @param str  所在字符串
     * @param str1 统计字符
     * @return
     * @throws Exception
     */
    public static int countStr(String str, String str1) throws Exception {
        int fromIndex = 0;
        int count = 0;
        str = str.toUpperCase();
        while (true) {
            int index = str.indexOf(str1, fromIndex);
            if (-1 != index) {
                fromIndex = index + 1;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    /**
     * unicode转中文
     *
     * @param str
     * @return
     */
    public static String unicodeToString(String str) {
        Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
        Matcher matcher = pattern.matcher(str);
        char ch;
        while (matcher.find()) {
            ch = (char) Integer.parseInt(matcher.group(2), 16);
            str = str.replace(matcher.group(1), ch + "");
        }
        return str;
    }

    /**
     * 驼峰格式转换
     *
     * @param str
     * @return
     */
    public static String strformatHump(String str) {
        String[] strs = str.split("_");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                //小写
                sb.append(strs[i].toLowerCase());
            } else {
                //从第二个起的单词首字母大写
                sb.append(strs[i].substring(0, 1).toUpperCase()).append(strs[i].substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }

    /**
     * 首字母转大写
     *
     * @param s
     * @return
     */
    public static String toUpperCaseFirstOne(String s) {
        if (Character.isUpperCase(s.charAt(0))) {
            return s;
        } else {
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }

    /**
     * 以指定格式获得当前日期
     *
     * @param format
     * @return
     */
    public static String getCurrentDate(String format) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

}
