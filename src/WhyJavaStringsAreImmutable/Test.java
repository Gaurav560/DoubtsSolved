package WhyJavaStringsAreImmutable;

public class Test {
static String name="Gaurav";
static String anotherName="Gaurav";
static String thirdName="Gauri";

//what thief can do is that ,he can wait for the validation to be done on
    //gaurav and then after validation is complete ,he can write the code to change the name
    //just before adding the money to account .

    //String are also thread safe
public void addMoneyToAccount(String name,Integer Value){

    //validation code to check if the account with name exist in db

    //add code
}
    public static void main(String[] args) {
        System.out.println((thirdName==anotherName));
    }
}
