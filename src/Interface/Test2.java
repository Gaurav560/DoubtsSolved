package Interface;

public class Test2  implements Test1{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Test2 test2=new Test2();
        System.out.println(test2.sum(4,6));
        System.out.println(test2.mul(5,7));
    }
}
