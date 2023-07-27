package thisAndSuperKeywordAndConstrcutorCall;

class Parent{
   static String string="Gaurav";
}


public class thisAnsSuperKeyword extends Parent {

   static String string="Gaurav shweta";

   public  void m1(){
       System.out.println(string);
       System.out.println(this.string);
       System.out.println(super.string);
   }


}
class Test{

    public static void main(String[] args) {
        thisAnsSuperKeyword thisAnsSuperKeyword=new thisAnsSuperKeyword();
        thisAnsSuperKeyword.m1();
    }
}
