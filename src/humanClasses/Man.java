package humanClasses;

public class Man extends Human {
  public Man(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return String.format("Мужчина по имени %s", name);
  }
}
