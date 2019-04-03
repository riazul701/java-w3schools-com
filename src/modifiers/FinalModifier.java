package modifiers;

final class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class FinalModifier extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    FinalModifier myFastCar = new FinalModifier();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
