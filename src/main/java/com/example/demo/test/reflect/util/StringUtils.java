package com.example.demo.test.reflect.util;

public class StringUtils {
    public static String initFiledName(String fileName){
        if (null == fileName || "".equals(fileName)){
            return "";
        }
        if (1 == fileName.length()){
            return fileName.toUpperCase();
        }
        return fileName.substring(0, 1).toUpperCase() + fileName.substring(1);
    }
}
