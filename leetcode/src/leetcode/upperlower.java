package leetcode;

public class upperlower {
    public static void main(String[] args) {
        String a = "aAbBcCd";
        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            if (finalResult.length() > 0) {
                char lastCharInResult = finalResult.charAt(finalResult.length() - 1);
                int diff = Math.abs((int) currentChar - (int) lastCharInResult);
                if (diff == 32) {
                    finalResult.deleteCharAt(finalResult.length() - 1);
                    continue;
                }
            }
            finalResult.append(currentChar);
        }
        System.out.println("Final string is: " + finalResult.toString());
    }
}