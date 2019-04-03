package inner_classes;

class OuterClass2 {
  int x = 10;

  class InnerClass2 {
    int y = 5;
  }
}

public class InnerClassExample {
  public static void main(String[] args) {
    OuterClass2 myOuter = new OuterClass2();
    OuterClass2.InnerClass2 myInner = myOuter.new InnerClass2();
    System.out.println(myInner.y + myOuter.x);
  }
}
