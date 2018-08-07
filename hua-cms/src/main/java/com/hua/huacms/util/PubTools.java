package com.hua.huacms.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: hua
 * @create: 2018-06-17 11:59
 */
public class PubTools {

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
