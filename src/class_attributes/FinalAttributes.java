package class_attributes;

public class FinalAttributes {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error
    System.out.println(myObj.x);
  }
}
