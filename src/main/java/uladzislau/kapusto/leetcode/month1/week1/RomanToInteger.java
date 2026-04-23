package uladzislau.kapusto.leetcode.month1.week1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i));
            } else {
                sum -= map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();

        System.out.println(rti.romanToInt("III"));      // 3
        System.out.println(rti.romanToInt("IV"));       // 4
        System.out.println(rti.romanToInt("IX"));       // 9
        System.out.println(rti.romanToInt("LVIII"));    // 58
        System.out.println(rti.romanToInt("MCMXCIV"));  // 1994
    }
}
