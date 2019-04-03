package inheritance;

class Vehicle1 {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class InheritanceExample extends Vehicle1 {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    InheritanceExample myFastCar = new InheritanceExample();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
