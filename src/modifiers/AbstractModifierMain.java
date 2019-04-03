package modifiers;

// abstract class
abstract class Main {
  public String fname = "John";
  public String lname = "Doe";
  public String email = "john@doe.com";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Person)
class AbstractModifierMain extends Main {
  public int graduationYear = 2018;
  public void study() {
    System.out.println("Studying all day long");
  }
}
