package com.solutions.s40_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 线性插值
 */
public class Solution47 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
        String line ;
        while((line=br.readLine())!=null){
            //lines[0].split("\\s+")分割后数组专为[a] [b] [c] [d]
            //lines[0].split("\\s+")[2] -->取得属分割后的第三个元素c
            int total = Integer.parseInt(line.split("\\s+")[0]);
            if(total>0){
                StringBuilder sb = new StringBuilder();
                String thisLine = br.readLine();
                String[] elements = thisLine.split("\\s+");
                int num = Integer.parseInt(elements[0]);
                int value =Integer.parseInt(elements[1]);
                int preNum = num;
                int preValue = value;
                sb.append(thisLine+"\r\n");
                for(int i =1;i<total;i++){
                    thisLine = br.readLine();
                    elements = thisLine.split("\\s+");
                    num = Integer.parseInt(elements[0]);
                    value =Integer.parseInt(elements[1]);
                    if(num==preNum){
                        continue;
                    }
                    for(int  j =preNum+1;j<num;j++){
                        sb.append(j+" "+(preValue + (value - preValue) / (num - preNum) * (j - preNum)) + "\r\n");
                    }
                    preNum = num;
                    preValue = value;
                    sb.append(thisLine + "\r\n");
                }
                System.out.print(sb.toString());
            }
        }
    }
}
