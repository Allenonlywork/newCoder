package com.solutions.s90_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 自动售货系统
 */
public class Solution98 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = br.readLine()) != null) {
            //初始化
            //商品名：数量
            HashMap<String, Integer> goods = new HashMap<>();
            //钱盒里钱的面值：数量
            HashMap<Integer, Integer> moneybox = new HashMap<>();
            //长度为6的数组，分别存A1,A2,A3,A4,A5,A6的价格。
            int[] prices = { 2, 3, 4, 5, 8, 6 };
            String[] command = s.split(";");
            String[] initial = command[0].split(" ");
            String[] inigoods = initial[1].split("-");
            for (int i = 0; i < 6; i++) {
                goods.put("A" + String.valueOf(i + 1), Integer.valueOf(inigoods[i]));
            }
            String[] inimoney = initial[2].split("-");
            moneybox.put(1, Integer.valueOf(inimoney[0]));
            moneybox.put(2, Integer.valueOf(inimoney[1]));
            moneybox.put(5, Integer.valueOf(inimoney[2]));
            moneybox.put(10, Integer.valueOf(inimoney[3]));
            System.out.println("S001:Initialization is successful");
            int balance = 0;
            for (int i = 1; i < command.length; i++) {
                if(command[i].split(" ").length!=2&&!"c".equals(command[i])) {
                    //结果没换行
                    System.out.print("E010:Parameter error");
                    continue;
                }
                //命令名称
                String com = command[i].split(" ")[0];
                //p 存钱
                if ("p".equals(com)) {
                    //存钱数量
                    int num = Integer.valueOf(command[i].split(" ")[1]);
                    if (!moneybox.containsKey(num)) {
                        System.out.println("E002:Denomination error");
                        continue;
                    } else if ((num == 5 || num == 10)
                            && num > (moneybox.get(1) + moneybox.get(2) * 2)) {
                        System.out.println("E003:Change is not enough, pay fail");
                        continue;
                    }
                    //题目写的投币余额
                    //else if(balance+num>10) {
                    else if (num > 10) {
                        System.out.println("E004:Pay the balance is beyond the scope biggest");
                        continue;
                    } else if ((goods.get("A1") + goods.get("A2") + goods.get("A3") +
                            goods.get("A4") + goods.get("A5") + goods.get("A6")) == 0) {
                        System.out.println("E005:All the goods sold out");
                        continue;
                    }
                    balance += num;
                    moneybox.put(num, moneybox.get(num) + 1);
                    System.out.println("S002:Pay success,balance=" + balance);
                    continue;
                }
                //b 购买
                if ("b".equals(com)) {
                    //商品名称
                    String name = command[i].split(" ")[1];
                    if (name.length() != 2 || name.charAt(0) != 'A' || name.charAt(1) < '1'
                            || name.charAt(1) > '6') {
                        System.out.println("E006:Goods does not exist");
                        continue;
                    }
                    if (goods.get(name) == 0) {
                        System.out.println("E007:The goods sold out");
                        continue;
                    }
                    if (prices[name.charAt(1) - '0' - 1] > balance) {
                        System.out.println("E008:Lack of balance");
                        continue;
                    }
                    balance -= prices[name.charAt(1) - '0' - 1];
                    goods.put(name, goods.get(name) - 1);
                    System.out.println("S003:Buy success,balance=" + balance);
                }
                //c 退币
                if ("c".equals(com)) {
                    if (balance == 0) {
                        //结果没换行
                        System.out.print("E009:Work failure");
                        continue;
                    }
                    int one = 0, two = 0, five = 0, ten = 0;
                    //投币余额不能大于10，10块钱还能退？
                    while (balance >= 10 && moneybox.get(10) > 0) {
                        balance -= 10;
                        moneybox.put(10, moneybox.get(10) - 1);
                        ten++;
                    }
                    while (balance >= 5 && moneybox.get(5) > 0) {
                        balance -= 5;
                        moneybox.put(5, moneybox.get(5) - 1);
                        five++;
                    }
                    while (balance >= 2 && moneybox.get(2) > 0) {
                        balance -= 2;
                        moneybox.put(2, moneybox.get(2) - 1);
                        two++;
                    }
                    while (balance >= 1 && moneybox.get(1) > 0) {
                        balance -= 1;
                        moneybox.put(1, moneybox.get(1) - 1);
                        one++;
                    }
                    System.out.println("1 yuan coin number=" + one);
                    System.out.println("2 yuan coin number=" + two);
                    System.out.println("5 yuan coin number=" + five);
                    System.out.println("10 yuan coin number=" + ten);
                }
                if ("q".equals(com)) {
                    //查询参数
                    int num = Integer.valueOf(command[i].split(" ")[1]);
                    if (num == 0) {
                        //按照剩余商品数量排序
                        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(goods.entrySet());
                        list.sort(new Comparator<Map.Entry<String, Integer>>() {
                            @Override
                            public int compare(Map.Entry<String, Integer> o1,
                                               Map.Entry<String, Integer> o2) {
                                return o2.getValue() - o1.getValue();
                            }
                        });
                        for (Map.Entry<String, Integer> entry : list) {
                            String name = entry.getKey();
                            System.out.println(name + " " + prices[name.charAt(1) - '0' - 1]
                                    + " " + entry.getValue());
                        }
                    }
                    if (num == 1) {
                        System.out.println("1 yuan coin number=" + moneybox.get(1));
                        System.out.println("2 yuan coin number=" + moneybox.get(2));
                        System.out.println("5 yuan coin number=" + moneybox.get(5));
                        System.out.println("10 yuan coin number=" + moneybox.get(10));
                    } else {
                        System.out.println("E010:Parameter error");
                        continue;
                    }
                }
            }
        }
    }
}
