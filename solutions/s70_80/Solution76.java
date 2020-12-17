package com.solutions.s70_80;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 尼彻斯特定理
 */
public class Solution76 {
    public static String GetSequeOddNum(int m)
    {
        int[] nums=new int [m];
        nums[0]=m*m-m+1;
        if(m==1){
            return String.valueOf(nums[0]);
        }else{
            for(int i=1;i<m;i++){
                nums[i]=nums[i-1]+2;
            }
            StringBuffer str=  new StringBuffer();
            str.append(nums[0]);
            for(int i=1;i<m;i++){
                str.append("+");
                str.append(nums[i]);
            }
            return str.toString();
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str=null;

        while((str=bfr.readLine())!=null){
            int num=Integer.parseInt(str);

            System.out.println( GetSequeOddNum(num));

        }

    }
}
