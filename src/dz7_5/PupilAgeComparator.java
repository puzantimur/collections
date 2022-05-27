package dz7_5;

import java.util.Comparator;

public class PupilAgeComparator implements Comparator<Pupils> {

  @Override
  public int compare(Pupils o1, Pupils o2) {
    if (o1.getAge() == o2.getAge()) {
      return 0;
    }
    if (o1.getAge() > o2.getAge()) {
      return 1;
    }
    return -1;
  }
}
