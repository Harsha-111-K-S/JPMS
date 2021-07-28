package pack1;
import pack2.Test2;
import pack3.Test3;
public class Test{
   public static void main(String[] args){
      System.out.println("This is from moduleA and pack1");
      Test2 t2 = new Test2();
      Test3 t3 = new Test3();
      t2.print2();
      t3.print3();




   }





}