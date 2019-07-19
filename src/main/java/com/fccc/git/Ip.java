package com.fccc.git;

/**
 * Created by fccc on 2019/5/23
 */
public class Ip {
    public static void main(String[] args) {
        String ip="115.233.221.202, 192.168.20.100";
        String newip = ip.split(",")[0];
        System.out.println(newip);
    }
}
