package dz7_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfPupils {
  private List<Pupils> pupilList = new ArrayList<>();
  PupilMarkComparator pupilMarkComparator = new PupilMarkComparator();
  PupilAgeComparator pupilAgeComparator = new PupilAgeComparator();

  public ListOfPupils() {
  }

  public void addAndSort (Pupils pupils) {
    pupilList.add(pupils);
    Collections.sort(pupilList);
  }

  public void sortByMark (Pupils pupils) {
    Collections.sort(pupilList, pupilMarkComparator);
  }

  public void sortByAge (Pupils pupils) {
    Collections.sort(pupilList, pupilAgeComparator);
  }


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ListOfPupils{");
    sb.append("pupilList=").append(pupilList);
    sb.append('}');
    return sb.toString();
  }

  public List<Pupils> getPupilList() {
    return pupilList;
  }

  public void setPupilList(List<Pupils> pupilList) {
    this.pupilList = pupilList;
  }


}
