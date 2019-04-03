package constructors;

//filename: Main.java
public class ConstructorParameters2 {
  int modelYear;
  String modelName;

  public ConstructorParameters2(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    ConstructorParameters2 myCar = new ConstructorParameters2(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
