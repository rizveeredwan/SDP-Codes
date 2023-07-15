
abstract class Duck{ // it has abstract method, so make the class abstract
  void quack(){}
  void swim(){}
  abstract void display();
}

class MallardDuck extends Duck { // need to implement the abstract method
  void display(){
    System.out.println("A mallard duck");
  }
}

class RedHeadDuck extends Duck {
  void display(){
    System.out.println("A red head duck");
  }
}

// only one public class in a file
public class IntroPattern{
  public static void main(String args[]) {
      //System.out.println("hello world");
  }
}
