package com.BE_FPoly_DoAn.DOAN.Utils;

public class StringUtil {
    public static String defaultIfBlank(String value, String defaultValue) {
        return value != null && !value.isBlank() ? value : defaultValue;
    }
}