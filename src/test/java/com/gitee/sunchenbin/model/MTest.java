package com.gitee.sunchenbin.model;

import com.gitee.sunchenbin.mybatis.actable.utils.ColumnUtils;

public class MTest {
    public static void main(String[] args) {
        System.out.println(ColumnUtils.lowerCamelToLowerUnderscore("mySampleVariable"));
        System.out.println(ColumnUtils.lowerCamelToLowerUnderscore("MySampleVariable"));
    }
}
