package JavaBasic.Demo4Class;

public class Phone {
   String color="black";
   int price=3999;
   String brand="HuaWei";

   public void call(long PhoneNumber){
       System.out.println("call for "+PhoneNumber);
   }

   public void SendMessage(long PhoneNumber, String message){
       System.out.println("send "+message+" to "+PhoneNumber);
   }
}
