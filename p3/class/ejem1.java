/*
 * Procesamiento de Formatos en Aplicaciones Telematicas
 * Practica 3 - Generacion de codigo
 *
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 *
 * ejem1.java
 */

import GeneratedCodeLib.*;
import Errors.*;
import java.util.Set;
import java.util.Vector;

@FunctionalInterface
interface CodeExecutor {
    void execute() throws EmptySetException;
}

public class ejem1 {
    public static void main(String args[]) {
        executeSafely(ejem1Wrapped::execute);
    }

    public static void executeSafely(CodeExecutor codeExecutor) {
        try {
            codeExecutor.execute();
        } catch (EmptySetException e) {
            System.err.println(e.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ejem1Wrapped {
    public static void execute() throws EmptySetException {
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
    }
}