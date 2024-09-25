public class UniqueCharacterChecker {
    public static boolean hasAllUniqueCharacters(String s) {
        if (s.length() > 26) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
    }

    return true;
}