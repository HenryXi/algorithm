# Red packet algorithm
This is an interview question. Not fully understood yet. ;(

* The red envelope algorithm, given a total amount of red envelopes and the number of dividend payers, outputs the number of red envelopes randomly grabbed by each person.
* Claim:
* Everyone must grab the red envelope, and the amount is random
* The amount of money each person grabs is not less than 1
* The amount of money each person grabs does not exceed 30% of the total amount
* For example, the total amount is 100, the number of people is 10, and the output is [19 20 15 1 25 14 2 2 1 1]
```
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
```
Find the random range is the key of this problem. 

EOF
