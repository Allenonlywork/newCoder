package com.solutions.s10_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 字符排序
 */
public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.valueOf(s);
        ArrayList<String> set = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            set.add(str);
        }
        Collections.sort(set);
        for(String string : set){
            System.out.println(string);
        }
    }
}
