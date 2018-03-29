package com.henryxi.algorithm.interview.spiralarray;

public class SpiralArray {
    public static void main(String[] args) {
        int sideLength = 4;
        int[][] spiralArray = generate(sideLength);
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print(spiralArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] generate(int length) {
        int[][] target = init(length);
        Item item = initFirstItem(length, target);
        int value = 0;
        do {
//            System.out.println(item.toString() + ":" + value);
            target[item.getX()][item.getY()] = value++;
            item = item.findNext();
            if (item == null) {
                break;
            }
            item.setCurrentArray(target);
        } while (true);
        return target;
    }

    private static int[][] init(int length) {
        int[][] target = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                target[i][j] = -1;
            }
        }
        return target;
    }

    private static Item initFirstItem(int sideLength, int[][] target) {
        Item first = new Item(0, 0);
        first.setCurrentArray(target);
        first.setSideLength(sideLength);
        return first;
    }
}
