package com.fccc.git.tomcat;

import java.util.Map;
import java.util.Properties;

/**
 * Created by fccc on 2019/5/23
 */
public class MyServerSocker {
    public static void main(String[] args) {
        Properties property = System.getProperties();
        Map map = System.getenv();
        String ls = System.lineSeparator();
        System.out.println(ls);

        String regex = "\"|\\.|\\-|\\&|\\||\\!|\\(|\\)|\\{|\\}|\\<|\\>|\\[|\\]|\\^|\\~|\\*|\\?|\\:|\\\\";
        String str = "  aad 1463.!~54 **(**   3423f)d]f 46[54 46:54e<>rdsf}{ds fdre而温柔……*￥%￥#    ";
        String newstr = str.trim().replaceAll(regex,"");
        System.out.println(newstr);
    }
}
