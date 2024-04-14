/*
 * Procesamiento de Formatos en Aplicaciones Telematicas
 * Practica 3 - Generacion de codigo
 *
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 *
 * ejem2.java
 */

import GeneratedCodeLib.*;
import java.util.Set;
import java.util.Vector;

public class ejem2 {
    public static void main(String args[]) {
        IntSet a, b, c, d;
        int a1, b1, c1, d1;
        int numElem, elem, i;

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
        numElem = c.card();
        i = 0;
        
        while (((c.card() > 0) && (i > ( -1)))) {
            elem = c.lowestElem();
            System.out.println("El valor de la variable i es: " + i);
            System.out.println("El valor de la variable elem es: " + elem);
            i = (i + 1);
            numElem = (numElem - 1);
            c = (IntSet) c.setDif(new IntSet(new Vector<>(Set.of(elem))));
            
            if (( !((numElem == c.card())))) {
                i = ( -1);
            }
        }
    }
}
