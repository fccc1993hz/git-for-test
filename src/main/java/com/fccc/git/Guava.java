package com.fccc.git;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.google.common.escape.Escaper;
import com.google.common.html.HtmlEscapers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by fccc on 2019/4/22
 */
public class Guava {
    public static void main(String[] args) {
        String a1 = "123456";
        String b1 = Strings.padEnd(a1, 12, 'x');
        System.out.println(b1);

        String a2 = "123456";
        String b2 = Strings.padStart(a2, 12, 'x');
        System.out.println(b2);

        String a3 = "";
        boolean b3 = Strings.isNullOrEmpty(a3);
        System.out.println(b3);

        String a4 = null;
        String b4 = Strings.nullToEmpty(a4);
        System.out.println(b4);

        String a5 = "";
        String b5 = Strings.emptyToNull(a5);
        System.out.println(b5);

        String a6 = "12345";
        String b6 = Strings.repeat(a6, 3);
        System.out.println(b6);

        String a7 = "abcdefgh";
        String b7 = "abcdabcd";
        String c7 = Strings.commonPrefix(a7, b7);
        System.out.println(c7);

        String a8 = "abcdxyz";
        String b8 = "efghxyz";
        String c8 = Strings.commonSuffix(a8, b8);
        System.out.println(c8);

        Joiner joiner1 = Joiner.on("|");
        List<String> list1 = new ArrayList<>();
        list1.add("xiaoming");
        list1.add("xiaohong");
        list1.add("wangsan");
        System.out.println(joiner1.join(list1));

        Joiner joiner2 = Joiner.on(",");
        List<String> list2 = new ArrayList<>();
        list2.add("xiaoming");
        list2.add("xiaohong");
        list2.add("wangsan");
        Iterator<String> it = list2.iterator();
        System.out.println(joiner2.join(it));

        Joiner joiner3 = Joiner.on(",");
        System.out.println(joiner3.join("abc", "de", "fg", "hij"));

        Joiner joiner4 = Joiner.on("#");
        List<String> list4 = new ArrayList<>();
        list4.add("xiaoming");
        list4.add("xiaohong");
        list4.add("wangsan");
        StringBuilder builder4 = new StringBuilder("标题");
        System.out.println(joiner4.appendTo(builder4, list4));

        Joiner joiner5 = Joiner.on(",").skipNulls();
        List<String> list5 = new ArrayList<>();
        list5.add("xiaoming");
        list5.add(null);
        list5.add("wangsan");
        StringBuilder builder5 = new StringBuilder("标题");
        System.out.println(joiner5.appendTo(builder5, list5));

        Joiner joiner6 = Joiner.on(",").useForNull("!!!");
        List<String> list6 = new ArrayList<>();
        list6.add("xiaoming");
        list6.add(null);
        list6.add("wangsan");
        StringBuilder builder6 = new StringBuilder("标题");
        System.out.println(joiner6.appendTo(builder6, list6));

        Joiner joiner7 = Joiner.on("&");
        Map<String, String> map7 = Maps.newLinkedHashMap();
        map7.put("Washington D.C", "Redskins");
        map7.put("New York City", "Giants");
        map7.put("Philadelphia", "Eagles");
        map7.put("Dallas", "Cowboys");
        System.out.println(joiner7.withKeyValueSeparator("=").join(map7));

        Splitter splitter1 = Splitter.on(",");
        String str1 = "a,b,c,d,e,f,g";
        List<String> lists1 = splitter1.splitToList(str1);
        System.out.println(lists1);

        Splitter splitter2 = Splitter.on(",").omitEmptyStrings();
        String str2 = "a,b,c,d,,f,g";
        List<String> lists2 = splitter2.splitToList(str2);
        System.out.println(lists2);

        Splitter splitter3 = Splitter.on(",").omitEmptyStrings().trimResults();
        String str3 = "a,b,c,d,,f,  g  ";
        List<String> lists3 = splitter3.splitToList(str3);
        System.out.println(lists3);

        Escaper htmlEscaper = HtmlEscapers.htmlEscaper();
        System.out.println(htmlEscaper.escape("<a>你好</a>"));
    }
}
