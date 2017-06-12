
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnagram {

  @Test
  public void testIfAnagramTrue() {
    Anagram anagram = new Anagram();
    assertEquals(anagram.ifAnagram("alma", "alam"), true);
  }

  @Test
  public void testIfAnagramFalse() {
    Anagram anagram = new Anagram();
    assertEquals(anagram.ifAnagram("alma", "körte"), false);
  }
}
