import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestGetIndex {

  private List<String> testList;
  private String testValue;
  private GetIndexClass index;

  @Before
  public void Before() {
    index = new GetIndexClass();
    testList = new ArrayList<>();
    testValue = "dojo";
  }


  @Test
  public void testGetIndex() {
    testList.add(testValue);
    assertEquals(index.getIndex(testList, testValue), 0);
  }

  @Test
  public void testGetIndex_Minus_One() {
    testList.add("Podi");
    testList.add("Zita");
    assertEquals(index.getIndex(testList,testValue), -1);
  }

}