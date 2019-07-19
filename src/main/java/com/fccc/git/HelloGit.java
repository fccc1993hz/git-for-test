package com.fccc.git;

/**
 * Created by fccc on 2018/12/17
 */
public class HelloGit {
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        System.out.println("New Branch Test");
        System.out.println("New Branch Dev");
        System.out.println("Merge Dev To Test");

        System.out.println("aaaaaaaaaaaa");
        System.out.println("bbbbbbbbbbbb");


        final String str="abcd";
        Thread thread = new Thread(){
            @Override
            public void run(){
                System.out.println(str);
            }
        };
        thread.start();

        final User user = new User();
        user.setName("AAA");
        user.setSex("F");
        user.setAge(10);
        user.setPhone("15755556666");
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                System.out.println(user);
            }
        };

        thread1.start();
    }
}
