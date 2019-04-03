package encapsulation;

public class EncapsulationErrorMain {
  public static void main(String[] args) {
    EncapsulationErrorPerson myObj = new EncapsulationErrorPerson();
    myObj.name = "John";
    System.out.println(myObj.name);
  }
}