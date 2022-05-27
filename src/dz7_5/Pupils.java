package dz7_5;

import java.util.Objects;

public class Pupils implements Comparable<Pupils> {

  private String name;
  private int mark;
  private int age;

  public Pupils() {
  }

  public Pupils(String name, int mark, int age) {
    this.name = name;
    this.mark = mark;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMark() {
    return mark;
  }

  public void setMark(int mark) {
    this.mark = mark;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public int compareTo(Pupils o) {
    return this.name.compareTo(o.name);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Pupils{");
    sb.append("name='").append(name).append('\'');
    sb.append(", mark=").append(mark);
    sb.append(", age=").append(age);
    sb.append('}');
    return sb.toString();
  }
}
