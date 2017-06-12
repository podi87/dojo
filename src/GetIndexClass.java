import java.util.List;

public class GetIndexClass {

  public int getIndex(List<String> testList, String value) {
    int index = -1;
    for (int i = 0; i < testList.size(); i++) {
      if (testList.get(i).equals(value)) {
        index = i;
      }
    }
    return index;
  }
}
