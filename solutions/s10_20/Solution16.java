package com.solutions.s10_20;


import java.util.*;

/**
 * 购物单
 */
public class Solution16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] v = new int[n+1];
        int[] p = new int[n+1];
        int[] q = new int[n+1];
        int groups = 0;
        for(int i = 1; i<=n; i++){
            v[i] = sc.nextInt();
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
            if(q[i] == 0) {
                groups++;
            }
        }

        //分组
        int[][] _v = new int[groups +1][4];
        int[][] _p = new int[groups +1][4];
        processData(q, v, p, _v, _p);

        int gc = _v.length;
        int[][] r = new int[gc][m+1];
        for(int i = 1; i< gc; i++){
            for(int j = 1; j<= m; j++){

                int max = r[i-1][j];
                for (int t = 1; t < _v[i].length; t++) {
                    int tempv = _v[i][t];
                    int tempp = _p[i][t];
                    if(tempv != 0 && tempv <= j) {
                        max = Math.max(max, r[i - 1][j - tempv] + tempp);
                    }
                }
                r[i][j] = max;
            }
        }
        System.out.println(r[gc -1][m]);
    }

    private static void processData(int[] m, int[] v, int[] p, int[][] _v, int[][] _p) {
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 1; i < m.length; i++) {
            if(m[i] == 0 ) {
                if(!groups.containsKey(i)) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    groups.put(i, temp);
                }

            }else {
                if (groups.containsKey(m[i])) {
                    List<Integer> list = groups.get(m[i]);
                    list.add(i);
                }else {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(m[i]);
                    temp.add(i);
                    groups.put(m[i], temp);
                }
            }
        }
        int index = 1;
        for(List<Integer> list : groups.values()) {
            int size = list.size();
            if(size == 1) {
                _v[index][1] = v[list.get(0)];
                _p[index][1] = p[list.get(0)] * v[list.get(0)];
            }else if (size == 2) {
                _v[index][1] = v[list.get(0)];
                _p[index][1] = p[list.get(0)] * v[list.get(0)];

                _v[index][2] = v[list.get(0)] + v[list.get(1)];
                _p[index][2] = p[list.get(0)] * v[list.get(0)] + p[list.get(1)] * v[list.get(1)];
            }else {
                _v[index][1] = v[list.get(0)];
                _p[index][1] = p[list.get(0)]* v[list.get(0)];

                _v[index][2] = v[list.get(0)] + v[list.get(1)];
                _p[index][2] = p[list.get(0)] * v[list.get(0)] + p[list.get(1)] * v[list.get(1)];

                _v[index][3] = v[list.get(0)] + v[list.get(1)] + v[list.get(2)];
                _p[index][3] = p[list.get(0)] * v[list.get(0)]  + p[list.get(1)]* v[list.get(1)] + p[list.get(2)]* v[list.get(2)];
            }
            index++;
        };
    }
}
