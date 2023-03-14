package Classes;

public class Human {
  public String name;

  public Human(String name) {
    this.name = name;
  }

  public void greetings() {
    System.out.println("Я родился!");
  }

  @Override
  public String toString() {
    return String.format("Человек по имени %s", name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
