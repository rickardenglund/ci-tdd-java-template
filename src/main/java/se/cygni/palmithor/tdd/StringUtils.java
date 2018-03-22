package se.cygni.palmithor.tdd;

public class StringUtils {


    public boolean isPalindrome(final String str) {
        if (str == null) return false;
        String backwards = "";
        for (char c : str.toCharArray()) {
            backwards = c + backwards;
        }
        return backwards.equals(str);
    }


    /**
     * Checks if a String is empty (""), null or whitespace only.
     * @param str the string to check
     *
     * @return true if str is null, empty or whitespace only, otherwise false
     */
    public boolean isBlank(final String str) {
        if (str == null) return true;
        return str.trim().isEmpty();
    }
}
