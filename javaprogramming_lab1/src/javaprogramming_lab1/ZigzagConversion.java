package javaprogramming_lab1;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s; // No need for zigzag if numRows is 1 or less
        }

        List<StringBuilder> rows = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int row = 0, direction = 1;

        for (char c : s.toCharArray()) {
            rows.get(row).append(c);
            row += direction;

            if (row == numRows - 1 || row == 0) {
                direction *= -1; // Efficiently toggle direction
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder ro : rows) {
            result.append(row);
        }
 
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        int numRows = 3;

        String result = convert(s, numRows);
        System.out.println("Zigzag Conversion: " + result);
    }
}