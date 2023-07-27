package Interface;

public interface Test1 {
    public int sum(int a, int b) ;
default int mul(int a,int b){
    return a*b;
}

}
