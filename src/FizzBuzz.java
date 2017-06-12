import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public List<String> printNumbers(List<Integer> numberList) {
    List<String> fizzBuzz = new ArrayList<>();
    for (Integer number : numberList) {
      if (number % 3 == 0 && number % 5 == 0) {
        fizzBuzz.add("FizzBuzz");
      } else if (number % 3 == 0) {
        fizzBuzz.add("Fizz");
      } else if (number % 5 == 0) {
        fizzBuzz.add("Buzz");
      } else {
        fizzBuzz.add(number.toString());
      }
    }
    return fizzBuzz;
  }
}
