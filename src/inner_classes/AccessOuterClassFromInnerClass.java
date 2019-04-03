package inner_classes;

class OuterClass1 {
  int x = 10;

  class InnerClass1 {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class AccessOuterClassFromInnerClass {
  public static void main(String[] args) {
    OuterClass1 myOuter = new OuterClass1();
    OuterClass1.InnerClass1 myInner = myOuter.new InnerClass1();
    System.out.println(myInner.myInnerMethod());
  }
}
