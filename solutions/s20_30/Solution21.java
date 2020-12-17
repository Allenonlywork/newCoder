package com.solutions.s20_30;

import java.util.Scanner;

/**
 * 简单密码
 * 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,
 * 就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
 *
 * 声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，
 * 如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a
 */
public class Solution21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String ss="";
            int i=0;
            for(i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch>='0'&&ch<='9')
                    ss=ss+ch;
                if(ch>='a'&&ch<='z'){
                    if(ch>='a'&&ch<='c')
                        ss=ss+"2";
                    if(ch>='d'&&ch<='f')
                        ss=ss+"3";
                    if(ch>='g'&&ch<='i')
                        ss=ss+"4";
                    if(ch>='j'&&ch<='l')
                        ss=ss+"5";
                    if(ch>='m'&&ch<='o')
                        ss=ss+"6";
                    if(ch>='p'&&ch<='s')
                        ss=ss+"7";
                    if(ch>='t'&&ch<='v')
                        ss=ss+"8";
                    if(ch>='w'&&ch<='z')
                        ss=ss+"9";
                    if(ch=='1')
                        ss=ss+"1";
                    if(ch=='0')
                        ss=ss+"0";
                }
                if(ch>='A'&&ch<='Z'){
                    char cc=Character.toLowerCase(ch);
                    if(cc=='z')
                        ss=ss+"a";
                    else
                    {
                        ss=ss+(char)(Integer.valueOf(cc)+1);
                    }
                }
            }
            System.out.println(ss);
        }
        sc.close();
    }
}
