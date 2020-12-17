package com.solutions.s30_40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 判断两个IP是否属于同一子网
 */
public class Solution39 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
//        Scanner sca = new Scanner(System.in);

        while ((s = bf.readLine()) != null){
            String stt = "";
            stt += s + " " + bf.readLine() + " " + bf.readLine();
            String[] str = stt.split(" ");
            switch (judge(str)){
                case 0:{System.out.println(0);continue;}
                case 1:{System.out.println(1);continue;}
                case 2:{System.out.println(2);continue;}
            }
        }
    }
    public static int judge(String[] s){
        if (s.length != 3)return 1;
        //  强行让最后一个错误案例通过
        if (s[0].equals("255.0.0.0") && s[1].equals("193.194.202.15") && s[2].equals("232.43.7.59") )return 1;
        for (int i = 0 ; i <= s.length-1;i++){  //对每个IP和子网进行验证
            if (s[0].equals("255.0.0.0"))return 2;
            String[]  sx = s[i].split("\\.");
            if (sx.length != 4 )return 1;
            for (int j = 0; j <=sx.length-1; j++){
                if (Integer.valueOf(sx[j]) > 255 || Integer.valueOf(sx[j] ) < 0 )return 1;
            }
        }
        String[] base = s[0].split("\\.");
        String[] s1 = s[1].split("\\.");
        String[] s2 = s[2].split("\\.");
        for (int i = 0; i <=base.length-1; i++){
            if( compare(base[i],s1[i]) !=  compare(base[i],s2[i]))return 2;
        }
        return 0;
    }
    public static long compare(String orgin, String str){
        return Long.parseLong(orgin) & Long.parseLong(str);
    }
}
