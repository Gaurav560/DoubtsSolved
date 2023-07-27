package StackOverFlowPackage;

public class StackOverFlow {
    public static  void  method1(){
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        int i=1154;
        System.out.println(i);
    }

    public static void main(String[] args) {
        method1();
    }
}