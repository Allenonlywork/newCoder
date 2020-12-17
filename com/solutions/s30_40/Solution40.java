package com.solutions.s30_40;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 输入一行字符，分别统计
 * 英文字符、空格、数字、其他字符的个数
 */
public class Solution40 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = br.readLine())!=null)
        {
            int EnglishCharCount=0;
            int BlankCharCount=0;
            int NumberCharCount=0;
            int OtherCharCount=0;

            char[] chs = line.toCharArray();
            for(int i=0;i<chs.length;++i){
                if((chs[i]>='a'&&chs[i]<='z')||(chs[i]>='A'&&chs[i]<='Z')){
                    ++EnglishCharCount;
                    continue;
                }
                else if(chs[i]==' '){
                    ++BlankCharCount;
                    continue;
                }
                else if(chs[i]>='0'&&chs[i]<='9'){
                    ++NumberCharCount;
                    continue;
                }
                else
                    ++OtherCharCount;
            }

            System.out.println(EnglishCharCount);
            System.out.println(BlankCharCount);
            System.out.println(NumberCharCount);
            System.out.println(OtherCharCount);
        }
    }
}
