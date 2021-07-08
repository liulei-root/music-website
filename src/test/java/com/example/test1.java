package com.example;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        int num = 1132435;
        String result = String.valueOf(num);
        String reverse = new StringBuffer(result).reverse().toString();
        System.out.println(reverse);
        String[] split = reverse.split("");
        List<String> list = new ArrayList();
        for (int i = 0; i < split.length; i++) {
            if (!list.contains(split[i])){
                list.add(split[i]);
            }
        }
        for (String str: list) {
            System.out.println(str);
        }
    }
}
