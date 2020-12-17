package com.solutions.s20_30;

import java.util.Scanner;

/**
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。
 * 输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序
 */
public class Solution23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextLine()){
            String str=scan.nextLine();
            if(str.length()>20){
                continue;
            }
            int []max=new int[26];
            char[]ch=str.toCharArray();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<ch.length;i++){
                max[ch[i]-'a']++;
                min=min>max[ch[i]-'a']?max[ch[i]-'a']:min;
            }


            for(int i=0;i<max.length;i++){
                if(max[i]==min){

                    str=str.replaceAll(String.valueOf((char)(i+97)), "");
                }
            }
            System.out.println(str);
        }
        scan.close();
    }
}
