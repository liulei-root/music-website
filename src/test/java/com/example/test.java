package com.example;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String s = "sdfghjklasdfggasd";
        String[] split = s.split("");
        int count = 0;
        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
            if (split[i].equalsIgnoreCase("a")){
                split[i]="b";
                count++;
            }
            System.out.print(split[i]);
        }
        System.out.println(count);
    }
}
