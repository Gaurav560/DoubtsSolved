package thisAndSuperKeywordAndConstrcutorCall;

// Java code to illustrate usage of super()

// Java code to illustrate usage of super()

class Parent1 {
    Parent1()
    {
        System.out.println("Parent class's No " +
                " arg constructor");
    }
}

class Child extends Parent1 {
    Child()
    {
        super();
        System.out.println("Flow comes back from " +
                "Parent class no arg const");
    }

    Child(int i){
        this();
        System.out.println("calling constructor within same class with this()");
    }
    public static void main(String[] args)
    {
      Child child=  new Child();
      Child child1=  new Child(7);
        System.out.println("Inside Main");
    }
}
