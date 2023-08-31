package com.henryxi.algorithm.string.restoreipaddresses;

import java.util.ArrayList;

public class RestoreIpAddressesClient {
    public static void main(String[] args) {
        RestoreIpAddressesClient client = new RestoreIpAddressesClient();
        ArrayList<String> list = client.restoreIpAddresses("1231231231234");
        for (String ipStr : list) {
            System.out.println(ipStr);
        }
    }

    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> list = new ArrayList<>();
        int length = s.length();
        for (int i = 1; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k);
                    if (isValidate(a) && isValidate(b) && isValidate(c) && isValidate(d)) {
                        list.add(a + "." + b + "." + c + "." + d);
                    }
                }
            }
        }
        return list;
    }

    private boolean isValidate(String s) {
        if (s.length() < 1 || s.length()>3) {
            return false;
        }
        if (s.length() != 1 && s.startsWith("0")) {
            return false;
        }

        int val = Integer.parseInt(s);
        return val >= 0 && val <= 255;
    }
}
