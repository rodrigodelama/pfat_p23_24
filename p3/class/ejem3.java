/*
 * Procesamiento de Formatos en Aplicaciones Telematicas
 * Practica 3 - Generacion de codigo
 *
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 *
 * ejem3.java
 */

import GeneratedCodeLib.*;
import java.util.Vector;

public class ejem3 {
    public static void main(String args[]) {
        IntSet a, b, c, d;
        int a1, b1, c1, d1;
        int numElem, elem, i;
        boolean control1;

        a = ;
        b = ;
        c = unionSet(a, b);
        d = intersectionSet(a, b);
        a1 = card(a);
        System.out.println("El valor de la variable " + a1 + " es: " + (value of identifier));
        b1 = card(b);
        System.out.println("El valor de la variable " + b1 + " es: " + (value of identifier));
        c1 = card(c);
        System.out.println("El valor de la variable " + c1 + " es: " + (value of identifier));
        d1 = card(d);
        System.out.println("El valor de la variable " + d1 + " es: " + (value of identifier));
        numElem = card(c);
        i = 0;
        control1 = true;
        
        while (((card(c) > 0) && control1)) {
            elem = lowestElem(c);
            System.out.println("El valor de la variable " + i + " es: " + (value of identifier));
            System.out.println("El valor de la variable " + elem + " es: " + (value of identifier));
            System.out.println("El valor de la variable " + control1 + " es: " + (value of identifier));
            i = (i + 1);
            numElem = (numElem - 1)setDiff(numElem, 1);
            c = (c - )setDiff(c, );

            
            if (( !(numElem = card(c)))) {

                control1 = false;
            }

        }

        control1 = false;

        System.out.println("El valor de la variable " + control1 + " es: " + (value of identifier));
    }
}
