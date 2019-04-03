package class_attributes;

public class OverrideExistingAttributes {
  int x = 10;

  public static void main(String[] args) {
    OverrideExistingAttributes myObj = new OverrideExistingAttributes();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
