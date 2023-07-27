package AccessSpecifiers.Package;

public class Honda {
    public static void main(String[] args) {
        Engine engine=new Engine();
        //protected method accessed inside the same package within different class
        engine.engineDesc();
    }
}
