import humanClasses.Human;
import humanClasses.Man;
import humanClasses.Woman;

public class Main {

  /*Задача 1
Создайте класс "Человек", конструктор которого принимает имя.
При попытке вывести объект этого класса на экран должна выводиться строка "Человек по имени …".
Добавьте в класс "Человек" метод "приветствие", который будет выводить строку: "Я родился!"
Создайте классы "Мужчина" и "Женщина", которые будут наследниками класса "Человек".
Попытка вывести их на экран должна приводить к выводу строки "Мужчина по имени …" или "Женщина по имени …"
Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"*/
  public static void main(String[] args) {
    Human newHuman = new Human("Joseph");
    System.out.println(newHuman);
    newHuman.greet();

    System.out.println();
    Man newMan = new Man("Ralph");
    System.out.println(newMan);
    newMan.greet();
    System.out.println();

    Woman newWoman = new Woman("Britney");
    System.out.println(newWoman);
    newWoman.greet();
  }
}