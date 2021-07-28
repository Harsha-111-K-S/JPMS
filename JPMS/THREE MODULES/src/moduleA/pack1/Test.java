package pack1;
import pack2.Test2;

public class Test{
  public void print1(){
     System.out.println("This is from moduleA and pack1");
     Test2 t2 = new Test2();
     t2.print();
}


}