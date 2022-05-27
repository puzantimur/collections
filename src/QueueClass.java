import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueClass {


  public Deque<String> patient = new LinkedList<>();
  public List<String> listOfPatient = new ArrayList<>();
  public Queue<Integer> integerQueue = new LinkedList<>();


  public void queueInHospital() {
    listOfPatient.add("Петров");
    listOfPatient.add("Сидоров");
    listOfPatient.add("Иванов");
    listOfPatient.add("Пупкин");
    listOfPatient.add("Петечкин");
    listOfPatient.add("Антонов");
    listOfPatient.add("Бонд");
    listOfPatient.add("Черный");
    patient.addAll(listOfPatient);
    System.out.println(patient);
    System.out.println("_________________");
    int a = patient.size();
    for (int i = 1; i < a; i++) {
      if (i % 3 != 0) {
        patient.removeFirst();
        System.out.println(patient);
      } else if (i % 3 == 0) {
        patient.removeLast();
        System.out.println(patient);
      }
    }
  }

  public void setIntegerQueue() {
    for (int i = 0; i < 10; i++) {
      integerQueue.add(((int) Math.ceil(i + ((Math.random() * 100)))));
    }
    int a = integerQueue.size();
    for (int i = 1; i < a; i++) {
      integerQueue.poll();
      System.out.println(integerQueue);
    }
  }
}


