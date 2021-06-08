package com.henryxi.algorithm.string.generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesClient {
    public static void main(String[] args) {
        GenerateParenthesesClient client = new GenerateParenthesesClient();
        System.out.println(client.generateParenthesis(3));
    }

    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs("", n, 0, 0);
        return res;
    }

    private void dfs(String ans, int n, int leftCount, int rightCount) {
        if (rightCount > leftCount || leftCount > n) {
            return;
        }
        if (leftCount == rightCount && rightCount == n) {
            res.add(ans);
        }
        dfs(ans + "(", n, leftCount + 1, rightCount);
        dfs(ans + ")", n, leftCount, rightCount + 1);
    }
}
