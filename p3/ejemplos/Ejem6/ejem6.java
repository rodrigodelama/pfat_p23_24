/*
 * Procesamiento de Formatos en Aplicaciones Telematicas
 * Practica 3 - Generacion de codigo
 *
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 *
 * ejem6.java
 */

import GeneratedCodeLib.*;
import Errors.*;
import java.util.*;

public class ejem6 {
    public static void main(String args[]) {
        IntSet a, b, c, d, e;
        int a1, b1, c1, d1, e1;
        int i, sig;

        a = new IntSet(new Vector<>(Arrays.asList(0, 1, 3, 5, ( -2), 7, 9, 4)));
        b = new IntSet(new Vector<>(Arrays.asList(0, ( -2), 4, ( -6), 8, 10)));
        c = (IntSet) a.unionSet(b);
        d = (IntSet) a.intersectionSet(b);
        e = (IntSet) a.setDif(b);
        a1 = a.card();
        System.out.println("El valor de la variable a1 es: " + a1);
        b1 = b.card();
        System.out.println("El valor de la variable b1 es: " + b1);
        c1 = c.card();
        System.out.println("El valor de la variable c1 es: " + c1);
        d1 = d.card();
        System.out.println("El valor de la variable d1 es: " + d1);
        e1 = e.card();
        System.out.println("El valor de la variable e1 es: " + e1);
        i = 0;
        
        while (( !((e == new IntSet(new Vector<>()))))) {
            sig = e.lowestElem();
            System.out.println("El valor de la variable i es: " + i);
            System.out.println("El valor de la variable sig es: " + sig);
            i = (i + 1);
            e = (IntSet) e.setDif(new IntSet(new Vector<>(Arrays.asList(sig))));
        }
    }
}
