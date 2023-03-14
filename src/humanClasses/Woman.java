package humanClasses;

public class Woman extends Human {
  public Woman(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return String.format("Женщина по имени %s", name);
  }

  @Override
  public void greet() {
    System.out.println("Я родилась!");
  }
}
