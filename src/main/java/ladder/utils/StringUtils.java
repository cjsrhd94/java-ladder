package ladder.utils;

import java.util.Objects;

public class StringUtils {

    public static final String COMMA = ",";
    public static final String BLANK = " ";

    private StringUtils() {
        throw new AssertionError("Unauthorized instance creation.");
    }

    public static void validate(String input) {
        if (isEmpty(input)) {
            throw new IllegalArgumentException("There is no input. Please check your input.");
        }
    }

    private static boolean isEmpty(String input) {
        return Objects.isNull(input) || input.isEmpty();
    }

    public static String[] splitByComma(String input) {
        return removeBlank(input).split(COMMA);
    }

    public static String removeBlank(String input) {
        return input.trim().replaceAll(BLANK, "");
    }
}