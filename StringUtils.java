// StringUtils

public class StringUtils {
  static public boolean containsChar(String word, char target) {
    for(int i = 0; i < word.length(); i++) {
      if (target == word.charAt(i)) return true;
    }

    return false;
  }

  static public String reverse(String word) {
    String reversedWord = "";

    for(int i = word.length() - 1; i >= 0 ; i--) {
      reversedWord += word.charAt(i);
    }

    return reversedWord;
  }

  static public String replaceAll(String word, char targetChar, char replacer) {
    String result = "";

    for(int i = 0; i < word.length(); i++) {
      result += word.charAt(i) == targetChar ? replacer : word.charAt(i);
    }

    return result;
  }
}