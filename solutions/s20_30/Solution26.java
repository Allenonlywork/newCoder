package com.solutions.s20_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 将输入字符串中的字符按如下规则排序
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 */
public class Solution26 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str = br.readLine())!=null){
            StringBuffer sbr = new StringBuffer();
            char[] cs = str.toCharArray();
            for(int i = 0;i < 26;i++){
                char c = (char)(i + 'A');
                for(int j = 0;j < cs.length;j++){
                    if(cs[j] == c || cs[j] == c + 32){
                        sbr.append(cs[j]);
                    }
                }
            }
            for(int i = 0;i < cs.length;i++){
                if((cs[i]>='a'&&cs[i]<='z')||(cs[i]>='A'&&cs[i]<='Z')){
                    continue;
                }
                sbr.insert(i,cs[i]);
            }
            System.out.println(sbr.toString());
        }
        br.close();
    }
}
