package com.henryxi.algorithm.interview.spiralarray;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private int x;
    private int y;
    private int sideLength;
    private int[][] currentArray;
    private boolean xDirection = true;

    public Item(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isxDirection() {
        return xDirection;
    }

    public void setxDirection(boolean xDirection) {
        this.xDirection = xDirection;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int[][] getCurrentArray() {
        return currentArray;
    }

    public void setCurrentArray(int[][] currentArray) {
        this.currentArray = currentArray;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private Item left() {
        Item item = new Item(x, y - 1);
        item.setSideLength(sideLength);
        item.setxDirection(xDirection);
        return item;
    }

    private Item right() {
        Item item = new Item(x, y + 1);
        item.setSideLength(sideLength);
        item.setxDirection(xDirection);
        return item;
    }

    private Item up() {
        Item item = new Item(x - 1, y);
        item.setSideLength(sideLength);
        item.setxDirection(xDirection);
        return item;
    }

    private Item down() {
        Item item = new Item(x + 1, y);
        item.setSideLength(sideLength);
        item.setxDirection(xDirection);
        return item;
    }

    public Item findNext() {
        Item left = left();
        Item right = right();
        Item up = up();
        Item down = down();
        List<Item> availableItems = new ArrayList<>();
        if (available(right)) {
            availableItems.add(right);
        }
        if (available(down)) {
            availableItems.add(down);
        }
        if (available(left)) {
            availableItems.add(left);
        }
        if (available(up)) {
            availableItems.add(up);
        }
        if (availableItems.size() == 0) {
            return null;
        }
        if (availableItems.size() == 1) {
            Item item = availableItems.get(0);
            if (item.getY() == this.getY()) {
                item.setxDirection(false);
            } else {
                item.setxDirection(true);
            }
            return item;
        }
        boolean xDirection = this.xDirection;
        Item xNeightbor;
        Item yNeightbor;
        if (this.getX() == availableItems.get(0).getX()) {
            xNeightbor = availableItems.get(0);
            yNeightbor = availableItems.get(1);
        } else {
            yNeightbor = availableItems.get(0);
            xNeightbor = availableItems.get(1);
        }
        if (xDirection) {
            return xNeightbor;
        } else {
            return yNeightbor;
        }
    }

    public boolean available(Item neighbor) {
        if (neighbor.getX() < 0) {
            return false;
        }
        if (neighbor.getY() < 0) {
            return false;
        }
        if (neighbor.getX() >= sideLength) {
            return false;
        }
        if (neighbor.getY() >= sideLength) {
            return false;
        }
        int i = currentArray[neighbor.getX()][neighbor.getY()];
        if (i == -1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Item{" +
                "x=" + x +
                ", y=" + y +
                ", xDirection=" + xDirection +
                '}';
    }
}
