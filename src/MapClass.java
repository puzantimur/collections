import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapClass {

  Scanner scanner = new Scanner(System.in);


  Map<String, String> stringMap = new HashMap<>();

  public MapClass(Map<String, String> stringMap) {
    this.stringMap = stringMap;
  }

  public void registry() {
    System.out.println("Введите ваш никнейм для регистрации.Количество символов не меньше 8."
        + " Можно использовать буквы нижнего и верхнего регистра,"
        + " а так же нижнее подчёркивание ”_” .");
    String nick = scanner.nextLine();
    System.out.println("Введите ваш пароль. Для вашей безопасности следует использовать "
        + "буквы верхнего и нижнего регистра, а так же цифры.");
    String pass = scanner.nextLine();
    if (stringMap.containsKey(nick)) {
      System.out.println("К сожалению пользователь с таким никнеймом уже есть");
    } else {
      if (pass.matches("^(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9]*)$")) {
        if (nick.matches("[A-Za-z_]+")) {
          stringMap.put(nick, pass);
        }
        System.out.println("Поздравляем с успешной регистрацией на порнХабе!");
      } else {
        System.out.println("Некорректно введены логин или пароль.");
      }
    }
    scanner.close();
  }

  public void deleteUser () {
    System.out.println("Введите ник пользователя, чтобы его удалить");
    String nickname = scanner.nextLine();
    stringMap.remove(nickname);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("MapClass{");
    sb.append("stringMap=").append(stringMap);
    sb.append('}');
    return sb.toString();
  }


}


