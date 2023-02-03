import java.util.List;

import static java.util.stream.Collectors.joining;

public class LC0006_ZIGZAG {
    public static String convert(String s, int numRows) {

        if (numRows == 1)
            return s;

        var rows = s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(StringBuilder::new)
                .limit(numRows)
                .toList();

        int ptr = numRows;
        while (ptr < s.length()) {

            for (int i = numRows - 2; i >= 0; i--)
                if (ptr < s.length())
                    rows.get(i).append(s.charAt(ptr++));

            for (int i = 1; i <= numRows - 1; i++)
                if (ptr < s.length())
                    rows.get(i).append(s.charAt(ptr++));
        }

        return String.join("", rows);
    }
}
