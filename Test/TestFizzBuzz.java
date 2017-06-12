import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {

  private List<Integer> numberList;

  @Before
  public void before() {
    numberList = new ArrayList<>();
    for (int i = 1; i < 101; i++) {
      numberList.add(i);
    }
  }

  @Test
  public void testPrintNumbers(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    System.out.println(fizzBuzz.printNumbers(numberList));
    assertEquals(fizzBuzz.printNumbers(numberList).get(2), "Fizz");
    assertEquals(fizzBuzz.printNumbers(numberList).get(4), "Buzz");
    assertEquals(fizzBuzz.printNumbers(numberList).get(14), "FizzBuzz");
    assertEquals(fizzBuzz.printNumbers(numberList).get(97), "98");
  }
}
