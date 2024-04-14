import GeneratedCodeLib.*;
import java.util.Vector;

public class Ejem1 {
    public static void main(String[] args) {
        // Declaration
        IntSet a, b, c, d;
        int a1, b1, c1, d1;

        // Initialization
        a = new IntSet(new Vector<>(Set.of(0, 1, 3, 5, 7, 9)));
        b = new IntSet(new Vector<>(Set.of(0, 2, 4, 6, 8)));

        // Union of sets a and b
        c = (IntSet) a.unionSet(b);

        // Intersection of sets a and b
        d = (IntSet) a.intersectionSet(b);

        // Cardinality of sets
        a1 = a.card();
        b1 = b.card();
        c1 = c.card();
        d1 = d.card();

        // Printing cardinalities
        System.out.println("Cardinality of set a: " + a1);
        System.out.println("Cardinality of set b: " + b1);
        System.out.println("Cardinality of set c (union of a and b): " + c1);
        System.out.println("Cardinality of set d (intersection of a and b): " + d1);
    }
}
