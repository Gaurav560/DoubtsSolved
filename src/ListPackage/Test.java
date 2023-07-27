package ListPackage;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> l1=new ArrayList<Integer>(5);

        l1.add(555);
        l1.add(555);
        l1.add(555);
        l1.add(555);
        l1.add(555);
        l1.add(555);
        l1.add(555);
        l1.add(555);
l1.ensureCapacity(500);
        System.out.println(l1.size());

    }

}
