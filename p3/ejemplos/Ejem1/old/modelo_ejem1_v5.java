import GeneratedCodeLib.*;
import java.util.Vector;

public class ejem1 {
    public static void main(String args[]) {
        IntSet a, b, c, d;
        int a1, b1, c1, d1;
        

        Vector<Integer> vector = new Vector<>();
        vector.add(0);
        vector.add(1);
        vector.add(3);
        vector.add(5);
        vector.add(7);
        vector.add(9);

        a = new IntSet(vector);

        

        a = {0, 1, 3, 5, 7, 9};
        b = {0, 2, 4, 6, 8};
        c = unionSet(a, b);
        d = intersectionSet(a, b);
        a1 = card(a);
        System.out.println("Cardinalidad de a: " + a1);
        b1 = card(b);
        int = b1
        c1 = card(c);
        int = c1
        d1 = card(d);
        int = d1;
    }
}
