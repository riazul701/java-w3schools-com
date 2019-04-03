package inner_classes;

class OuterClass4 {
  int x = 10;

  static class InnerClass4 {
    int y = 5;
  }
}

public class StaticInnerClass {
  public static void main(String[] args) {
    OuterClass4.InnerClass4 myInner = new OuterClass4.InnerClass4();
    System.out.println(myInner.y);
  }
}
