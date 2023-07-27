package BlockInJava;

public class StaticBlock {
    static {
        System.out.println("static blocked is executed once  while loading the class file .and it is executed before main method also.");
    }

    {
        System.out.println("instance block is executed after static block");
    }
    StaticBlock(){
        System.out.println("constructor is called after static block .");
    }
    public static int divide(int a,int b){
        return a/b;
    }

    public static void main(String[] args)throws ArithmeticException {
        try {
            StaticBlock staticBlock=new StaticBlock();
            System.out.println(divide(4,0));

        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("finally block is used to close all the resources .");
        }
    }

}
