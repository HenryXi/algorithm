package com.henryxi.algorithm.array.pascalstriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleClient {
    public static void main(String[] args) {
        PascalsTriangleClient client = new PascalsTriangleClient();
        System.out.println(client.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(0, Arrays.asList(1));
        for (int i = 1; i <= numRows; i++) {
            res.add(i, getNext(res.get(i - 1)));
        }
        return res;
    }

    private List<Integer> getNext(List<Integer> cur) {
        List<Integer> res = new ArrayList<>();
        res.add(0, cur.get(0));
        for (int i = 1; i < cur.size() + 1; i++) {
            if (i == cur.size()) {
                res.add(i, cur.get(i - 1));
            } else {
                res.add(i, cur.get(i - 1) + cur.get(i));
            }
        }
        return res;
    }
}
