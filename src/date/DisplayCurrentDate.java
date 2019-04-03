package date;
import java.time.LocalDate;  // import the LocalDate class

public class Main {
  public static void DisplayCurrentDate(String[] args) {
    LocalDate myObj = LocalDate.now();  // Create a date object
    System.out.println(myObj);  // Display the current date
  }
}
