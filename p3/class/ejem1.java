import GeneratedCodeLib.*;
import Errors.*;
import java.util.Set;
import java.util.Vector;

public class ejem1 {
    public static void main(String args[]) {
        try {
            ejem1.execute();
        } catch (EmptySetException e) {
            System.out.println("ERROR: Conjunto vacío");
        }
    }

    public static void execute() {
        try {
            // Generated code
            IntSet a, b, c, d;
            int a1, b1, c1, d1;

            a = new IntSet(new Vector<>(Set.of(0, 1, 3, 5, 7, 9)));
            b = new IntSet(new Vector<>(Set.of(0, 2, 4, 6, 8)));
            c = (IntSet) a.unionSet(b);
            d = (IntSet) a.intersectionSet(b);
            a1 = a.card();
            System.out.println("El valor de la variable a1 es: " + a1);
            b1 = b.card();
            System.out.println("El valor de la variable b1 es: " + b1);
            c1 = c.card();
            System.out.println("El valor de la variable c1 es: " + c1);
            d1 = d.card();
            System.out.println("El valor de la variable d1 es: " + d1);
        } catch (Exception e) {
            // No-operation (NOP) block
        }
    }
}
