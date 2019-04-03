package constructors;

// Create a Main class
public class CreateConstructor {
  int x;

  // Create a class constructor for the Main class
  public CreateConstructor() {
    x = 5;
  }

  public static void main(String[] args) {
    CreateConstructor myObj = new CreateConstructor();
    System.out.println(myObj.x);
  }
}
