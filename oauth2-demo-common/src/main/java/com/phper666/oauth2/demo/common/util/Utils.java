package com.phper666.oauth2.demo.common.util;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-29 21:12:41
 * @software IntelliJ IDEA
 */
public class Utils {
    /**
     * url是否存在参数，存在返回true
     * @param url
     * @return
     */
    public static boolean checkUrlIsMatchParams(String url) {
        int check = url.indexOf("?");
        return check != -1;
    }
}
