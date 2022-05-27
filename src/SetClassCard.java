import java.util.HashSet;
import java.util.Set;

public class SetClassCard {

  Set <Integer> creditCard = new HashSet<>();

  private int numberOfCreditCard;


  public void addCreditCard () {
    for (int i = 0; i < 10; i++) {
      creditCard.add(232454131+(i*((int) Math.ceil(i + ((Math.random() * 10))))));
      numberOfCreditCard=i+1;
      System.out.println("Карт в хранилеще "  + numberOfCreditCard + ", с номерами: " + creditCard);
    }
  }

  public Set<Integer> getCreditCard() {
    return creditCard;
  }

  public int getNumberOfCreditCard() {
    return numberOfCreditCard;
  }

  public void setCreditCard(Set<Integer> creditCard) {
    this.creditCard = creditCard;
  }
}
