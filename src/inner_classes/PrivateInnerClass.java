package inner_classes;

class OuterClass3 {
  int x = 10;

  private class InnerClass3 {
    int y = 5;
  }
}

public class PrivateInnerClass {
  public static void main(String[] args) {
    OuterClass3 myOuter = new OuterClass3();
    OuterClass3.InnerClass3 myInner = myOuter.new InnerClass3();
    System.out.println(myInner.y + myOuter.x);
  }
}
