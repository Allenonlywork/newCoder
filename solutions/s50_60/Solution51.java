package com.solutions.s50_60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输出单向链表中倒数第k个节点
 */
public class Solution51 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfd=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bfd.readLine())!=null){
            int num=Integer.parseInt(str);
            String[] strs=bfd.readLine().split(" ");
            String slen=bfd.readLine();
            int len=Integer.parseInt(slen);
            if(len>0 && num-len>=0){
                System.out.println(strs[num-len]);
            }else{
                System.out.println(0);
            }
        }
    }
}
