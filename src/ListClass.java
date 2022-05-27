import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {

  List<Integer> integerList = new ArrayList<>();
  List<String> stringList = new LinkedList<>();


  public ListClass() {
  }

  public void setIntegerList() {
    for (int i = 0; i < 10; i++) {
      integerList.add(((int) Math.ceil(i + ((Math.random() * 100)))));
    }
    System.out.println(integerList);
  }

  public void addAndRemoveIntegerList() {
    integerList.add(23);
    System.out.println(integerList);
    integerList.add(0, 1);
    System.out.println(integerList);
    integerList.remove(0);
    System.out.println(integerList);
    integerList.remove(integerList.size()-1);
    System.out.println(integerList);
    }

    public void jenga () {
      for (int i = 0; i < 20; i++) {
        stringList.add("Firest");
        System.out.println(stringList);
      }
      for (int i = 0; i < 20; i++) {
        stringList.remove("Firest");
        System.out.println(stringList);
      }
    }



}
