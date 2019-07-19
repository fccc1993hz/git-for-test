package com.fccc.git;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by fccc on 2019/4/23
 */
public class Utils {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("AAA");
        user1.setAge(10);
        user1.setSex("M");
        user1.setPhone("15700001111");

        User user2 = new User();
        user2.setName("BBB");
        user2.setAge(20);
        user2.setSex("M");
        user2.setPhone("15700002222");

        User user3 = new User();
        user3.setName("CCC");
        user3.setAge(30);
        user3.setSex("F");
        user3.setPhone("15700003333");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        // 返回对象列表中符合条件的第一个对象，后续对象忽略
        User findUser1 = CollectionUtils.find(list, new Predicate<User>() {
            @Override
            public boolean evaluate(User u) {
                return u.getSex().equals("L");
            }
        });
        System.out.println(findUser1);

        User findUser2 = list.stream().filter(u -> u.getSex().equals("L")).findFirst().orElse(null);
        System.out.println(findUser2);

        // 返回对象列表中符合条件的对象列表
        List<User> userList1 = (List<User>) CollectionUtils.select(list, new Predicate<User>() {
            @Override
            public boolean evaluate(User u) {
                return u.getSex().equals("M");
            }
        });
        if (CollectionUtils.isNotEmpty(userList1)) {
            System.out.println(userList1);
        }

        List<User> userList2 = list.stream().filter(u -> u.getSex().equals("M")).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(userList2)) {
            System.out.println(userList2);
        }

        // 返回对象列表中的属性列表
        List<String> usernameList1 = (List<String>) CollectionUtils.collect(list, new Transformer<User, String>() {
            @Override
            public String transform(User u) {
                return u.getName();
            }
        });
        if (CollectionUtils.isNotEmpty(usernameList1)) {
            System.out.println(usernameList1);
        }

        List<String> usernameList2 = list.stream().map(user -> user.getName()).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(usernameList2)) {
            System.out.println(usernameList2);
        }

        // 返回对象列表中符合条件的对象数量
        int count1 = CollectionUtils.countMatches(list, new Predicate<User>() {
            @Override
            public boolean evaluate(User u) {
                return u.getSex().equals("M");
            }
        });
        System.out.println(count1);

        long count2 = list.stream().filter(u -> u.getSex().equals("M")).count();
        System.out.println(count2);


        // 对象列表中是否存在符合条件的对象
        boolean b1 = CollectionUtils.exists(list, new Predicate<User>() {
            @Override
            public boolean evaluate(User u) {
                return u.getName().equals("AAA");
            }
        });
        System.out.println(b1);

        boolean b2 = list.stream().anyMatch(u -> u.getName().equals("AAA"));
        System.out.println(b2);


        // 对象列表中的对象是否全部符合条件
        boolean b3 = CollectionUtils.matchesAll(list, new Predicate<User>() {
            @Override
            public boolean evaluate(User u) {
                return u.getAge() == 20;
            }
        });
        System.out.println(b3);

        boolean b4 = list.stream().allMatch(u -> u.getAge() == 20);
        System.out.println(b4);


        int sum = list.stream().mapToInt(User::getAge).sum();
        System.out.println(sum);
        int max = list.stream().mapToInt(User::getAge).max().getAsInt();
        System.out.println(max);
        int min = list.stream().mapToInt(User::getAge).min().getAsInt();
        System.out.println(min);
        double average = list.stream().mapToInt(User::getAge).average().getAsDouble();
        System.out.println(average);
        List<User> sortList = list.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        System.out.println(sortList);

        Map<String,List<User>> map1 = list.stream().collect(Collectors.groupingBy(User::getSex));
        System.out.println(map1);
        Map<String,Integer> map2 = list.stream().collect(Collectors.groupingBy(User::getSex,Collectors.summingInt(User::getAge)));
        System.out.println(map2);
    }
}
