package StackOverFlowPackage;

public class PrintNumberStackOverFLowError {

    static int count=0;
    public static void printNumber(){
        if (count<100000){
            System.out.println("Gaurav is great..");
            count++;
            printNumber();
        }
    }

    public static void main(String[] args) {
        PrintNumberStackOverFLowError.printNumber();
    }
}
