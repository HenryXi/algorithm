package com.henryxi.algorithm.interview.redpacket;

/**
 * 红包算法，给定一个红包总金额和分红包的人数，输出每个人随机抢到的红包数量。
 * 要求：
 * 每个人都要抢到红包，并且金额随机
 * 每个人抢到的金额数不小于1
 * 每个人抢到的金额数不超过总金额的30%
 * 例如总金额100，人数10，输出【19 20 15 1 25 14 2 2 1 1】
 */
public class RedPacketClient {
    private static final int min = 1;
    private static final double percentMax = 0.3;

    public static void main(String[] args) {
        int money = 100;
        int people = 10;
        int maxMoney = (int) (percentMax * money);
        allocateMoney(money, people, maxMoney);
    }

    private static void allocateMoney(int money, int peopleNum, int maxMoney) {
        int minMoney = min;
        int shareMoney = 0;
        int sum = 0;
        for (int i = 0; i < peopleNum; i++) {
            minMoney = minMoney > money - maxMoney * (peopleNum - i - 1) ? minMoney : (money - maxMoney * (peopleNum - i - 1));
            maxMoney = maxMoney < money - minMoney * (peopleNum - i - 1) ? maxMoney : (money - minMoney * (peopleNum - i - 1));
            shareMoney = (int) Math.floor((maxMoney - minMoney) * Math.random() + minMoney);
            money = money - shareMoney;
            sum += shareMoney;
            System.out.println("people num " + (i + 1) + " gets :" + shareMoney);
        }
        System.out.println("sum money:" + sum);
    }
}
