import dz7_5.ListOfPupils;
import dz7_5.Pupils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    /*  //#1
      QueueClass queueClass = new QueueClass();
      queueClass.queueInHospital();
      queueClass.setIntegerQueue();
*/
     /* #2
        ListClass listClass = new ListClass();
      listClass.addAndRemoveIntegerList();
      listClass.jenga();
*/

      //#3
      /*SetClassCard card = new SetClassCard();
      card.addCreditCard();
      SetCargo carogos = new SetCargo();
      carogos.cargos();*/

      //#4
       /*Map<String, String> usersOfNet = new HashMap<>();
        usersOfNet.put("Barme", "StoneHande12");
        usersOfNet.put("Barmen", "StoneHande123");
        usersOfNet.put("Barmeene", "StoneHande124");

        MapClass socialNet  = new MapClass(usersOfNet);
        socialNet.registry();
        System.out.println(socialNet);
        socialNet.deleteUser();
      System.out.println(socialNet);*/

        //#5.1
      /*  Pupils pupil1 = new Pupils();
        Pupils pupil2 = new Pupils();
        Pupils pupil3 = new Pupils();
        Pupils pupil4 = new Pupils();
        pupil1.setName("Puzan Tsimur");
        pupil2.setName("Vander Van");
        pupil3.setName("Pert Goil");
        pupil4.setName("Annavol Petr");
        ListOfPupils listOfClassroom = new ListOfPupils();
        listOfClassroom.addAndSort(pupil1);
        listOfClassroom.addAndSort(pupil2);
        listOfClassroom.addAndSort(pupil3);
        System.out.println(listOfClassroom);
        listOfClassroom.addAndSort(pupil4);
        System.out.println(listOfClassroom);*/

        //#5.2
        Pupils pupil5 = new Pupils("Tabula Ivan", 3, 17);
        Pupils pupil6 = new Pupils("Ivanov Ivan", 4, 16);
        Pupils pupil7 = new Pupils("Sidorov Vadim", 8, 18);
        ListOfPupils listOfClassroom1 = new ListOfPupils();
        listOfClassroom1.addAndSort(pupil5);
        listOfClassroom1.addAndSort(pupil6);
        listOfClassroom1.addAndSort(pupil7);
        System.out.println(listOfClassroom1);
        listOfClassroom1.sortByMark(pupil5);
        listOfClassroom1.sortByMark(pupil6);
        listOfClassroom1.sortByMark(pupil7);
        System.out.println(listOfClassroom1);
        listOfClassroom1.sortByAge(pupil5);
        listOfClassroom1.sortByAge(pupil6);
        listOfClassroom1.sortByAge(pupil7);
        System.out.println(listOfClassroom1);
























    }
}
