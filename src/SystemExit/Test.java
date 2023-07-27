package SystemExit;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println("only try block upto this line of code get executed");
            System.exit(0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally block wil never get executed as jvm will shut down .");
        }
    }
}

