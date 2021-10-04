package com.henryxi.algorithm.string.licensekeyformatting;

public class LicenseKeyFormattingClient {
    public static void main(String[] args) {
        LicenseKeyFormattingClient client = new LicenseKeyFormattingClient();
        System.out.println(client.licenseKeyFormatting("2-5g-3-J", 2));
    }

    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "");
        int first = s.length() % k;
        int group = s.length() / k;
        StringBuilder sb = new StringBuilder(s.toUpperCase());
        int addIndex=0;
        for (int i = 0; i < group; i++) {
            int offset = first + k * i+addIndex;
            if (offset > 0) {
                sb.insert(offset, '-');
                addIndex++;
            }
        }
        return sb.toString();
    }
}
