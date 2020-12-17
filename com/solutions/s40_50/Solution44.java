package com.solutions.s40_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 数独
 */
public class Solution44 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null && str.length()>0){
            int[][] sudoku=new int[9][9];
            String[] data=str.split(" ");
            for(int i=0;i<9;i++){
                sudoku[0][i]=Integer.parseInt(data[i]);
            }
            for(int i=1;i<9;i++){
                str=br.readLine();
                data=str.split(" ");
                for(int j=0;j<9;j++){
                    sudoku[i][j]=Integer.parseInt(data[j]);
                }
            }


            find(sudoku,0);
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    System.out.print(sudoku[i][j]);
                    if(j<8){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }

    //深度遍历
    public static boolean find(int[][] matrix,int count){
        int x=count/9;
        int y=count%9;
        if(count>80){  //到达终点，遍历完成
            return true;
        }
        if(matrix[x][y] != 0){
            return find(matrix,count+1);
        }else{
            ArrayList<Integer> list=jie(matrix,x,y);
            while(!list.isEmpty()){
                matrix[x][y]=list.remove(0);
                if(find(matrix,count+1)){
                    return true;
                }else{
                    matrix[x][y]=0;
                }
            }
        }

        return false;
    }


    //判断某个位置可以放那些值
    public static ArrayList<Integer> jie(int[][] matrix,int x,int y){
        ArrayList<Integer> list= new ArrayList<Integer>();

        List<Integer> list1=new ArrayList<Integer>(); //行元素
        List<Integer> list2=new ArrayList<Integer>(); //列元素
        List<Integer> list3=new ArrayList<Integer>(); //粗线宫元素

        for(int i=0;i<9;i++){
            list1.add(matrix[x][i]);
            list2.add(matrix[i][y]);
        }
        int m=x/3;
        int n=y/3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list3.add(matrix[m*3+i][n*3+j]);
            }
        }

        for(int i=1;i<=9;i++){
            if(!(list1.contains(i) || list2.contains(i) || list3.contains(i))){
                list.add(i);
            }
        }

        return list;
    }
}
