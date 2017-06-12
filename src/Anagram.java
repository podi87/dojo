import java.util.Arrays;

public class Anagram {

  public boolean ifAnagram(String input1, String input2) {
    char[] char1 = input1.toLowerCase().toCharArray();
    char[] char2 = input2.toLowerCase().toCharArray();

    if (char1.length == char2.length) {
      Arrays.sort(char1);
      Arrays.sort(char2);
      String sortedChar1 = new String(char1);
      String sortedChar2 = new String(char2);
      if (sortedChar1.equals(sortedChar2)) {
        return true;
      }
    }
    return false;
  }
}
