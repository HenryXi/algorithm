package com.henryxi.algorithm.string.replacespace;

public class ReplaceSpaceClient {
    public static void main(String[] args) {
        ReplaceSpaceClient client = new ReplaceSpaceClient();
        System.out.println(client.replaceSpace("We are happy."));
    }

    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }
}
