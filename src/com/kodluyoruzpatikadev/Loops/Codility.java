
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public static void main(String args[]) {
        System.out.println(Solution.solution2("aba"));;
    }
}

class Solution {
    public static int solution(String S) {
        int sum = 0;
        for (int i = 0; i < S.length(); ++i) {
            sum += S.charAt(i) - 48;
        }
        int count = 0;
        for (int i = 0; i < S.length(); ++i) {
            int remaining_sum = sum - (S.charAt(i) - 48);
            for (int j = 0; j <= 9; ++j) {
                if ((remaining_sum + j) % 3 == 0 && j != S.charAt(i) - 48) {
                    ++count;
                }
            }
        }
        return count;
    }

    public static String solution2(String S) {
        List<String> list = Arrays.asList(S.split(""));
        for (String s : list) {
            int a = Collections.frequency(list, s);
            if (a > 1) {
                return s;
            }
        }

        return null;
    }
}
