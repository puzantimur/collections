package dz7_5;

import java.util.Comparator;

public class PupilMarkComparator implements Comparator<Pupils> {

  @Override
  public int compare(Pupils o1, Pupils o2) {
    if (o1.getMark() == o2.getMark()) {
      return 0;
    }
    if (o1.getMark() > o2.getMark()) {
      return 1;
    }
      return -1;
    }
  }


