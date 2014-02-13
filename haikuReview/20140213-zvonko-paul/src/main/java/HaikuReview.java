public class HaikuReview {

    private static final String INPUT_ONE = "happy purple frog/eating bugs in the marshes/get indigestion";
    private static final String INPUT_TWO = "computer programs/the bugs try to eat my code/i will not let them";

    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static int getNumberOfSyllables(String input) {
        int count = 0;
        boolean vowelFound = false;
        for (char c : input.toCharArray()) {
            if (!vowelFound && isVowel(String.valueOf(c))) {
                count++;
                vowelFound = true;
            } else {
                vowelFound = false;
            }
        }

        return count;
    }

    public static boolean isSyllable(String input) {
        if (input.length() < 3) {
            return true;
        }
        return false;
    }

    public static boolean isVowel(String s) {
        for (char c : s.toCharArray()) {
            for (char v : VOWELS) {
                if (c == v) {
                    return true;
                }
            }
        }
        return false;
    }
}
