package inheritance;

final class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class FinalKeyword extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    FinalKeyword myFastCar = new FinalKeyword();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
