import java.util.Iterator;
import java.util.TreeSet;

public class SetCargo {

  public final int WEIGHT_POUNDS = 32000;
  public final int ONE_POUND_COST = 3;
  public final int PERCENT_FOR_OVERWEIGHT = 30;


  TreeSet<Integer> weightOfCargos = new TreeSet<>();


  public void cargos() {
    int sumCargos = 0;
    weightOfCargos.add(1670);
    weightOfCargos.add(23000);
    weightOfCargos.add(5411);
    weightOfCargos.add(932);
    weightOfCargos.add(112);
    weightOfCargos.add(890);
    Iterator <Integer> iterator = weightOfCargos.iterator();
    while (iterator.hasNext()) {
      sumCargos += (int) iterator.next();
    }
    if (sumCargos < WEIGHT_POUNDS) {
      System.out.println("Всё впорядке, Сэр. Ваши грузы отправлены, с вас " +
          sumCargos * ONE_POUND_COST + ". Евро, сэр");
    } else {
      System.out.println("У вас превышение массы груза, сэр! Превышение составляет " +
          (sumCargos - WEIGHT_POUNDS) + " фунтов. Вы можете доплатить нам за перегруз: " +
          ((sumCargos - WEIGHT_POUNDS) * (ONE_POUND_COST +
              (ONE_POUND_COST * PERCENT_FOR_OVERWEIGHT) / 100) + " евро. Или "
              + "же снимаем груз с наименьшей массой? Если ваш ответ да. "));
      int minWeightCargo = weightOfCargos.ceiling(sumCargos - WEIGHT_POUNDS);
      System.out.println("Это груз с массой " + minWeightCargo + " фунтов.");
      weightOfCargos.remove(minWeightCargo);
      sumCargos -= minWeightCargo;
      System.out.println("Итоговая масса груза будет составлять: " + sumCargos + " фунтов. "
          + "А список грузов будет таковым: " + weightOfCargos);
      System.out.println("В таком случае ваша оплата составит:" + (sumCargos * ONE_POUND_COST) +
          ". Евро, сэр");
      System.out.println("Спустя некоторое время.............");
      System.out.println(
          "Добро пожаловать в Бразилию! В течении часа мы разгрузим ваши контейнеры.");
    }
    System.out.println(weightOfCargos);
    Iterator <Integer> iterator1 = weightOfCargos.iterator();
    int a = weightOfCargos.size();
    for (int i = 1; i < weightOfCargos.size() ; i++) {
      iterator1.remove();
      System.out.println(weightOfCargos);
    }


    }



  }




