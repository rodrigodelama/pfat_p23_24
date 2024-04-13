package ejemplos.Ejem1;

//TODO: Redo with IntSet.java methods

//ChatGPT
import java.util.HashSet;
import java.util.Set;

public class Ejem1 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        Set<Integer> d = new HashSet<>();
        int a1, b1, c1, d1;

        a.add(0);
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);

        b.add(0);
        b.add(2);
        b.add(4);
        b.add(6);
        b.add(8);

        c.addAll(a);
        c.addAll(b);

        d.addAll(a);
        d.retainAll(b);

        a1 = a.size();
        System.out.println("Cardinal of a is: " + a1);

        b1 = b.size();
        System.out.println("Cardinal of b is: " + b1);

        c1 = c.size();
        System.out.println("Cardinal of c (a union b) is: " + c1);

        d1 = d.size();
        System.out.println("Cardinal of d (a intersection b) is: " + d1);
    }
}
