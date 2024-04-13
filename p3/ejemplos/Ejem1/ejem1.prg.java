import GeneratedCodeLib.*;

public class ../ejemplos/Ejem1/ejem1.prg {
    public static void main(String args[]) {
        intset a = {}b = {}c = {}d = {};
,         int a1 = 0b1 = 0c1 = 0d1 = 0;
;
            a = ;
            b = ;
            c = unionSet(a, b);
            d = int[] array1 = a;
int[] array2 = b;
int maxSize = Math.min(array1.length, array2.length);
int[] intersection = new int[maxSize];
int intersectionIndex = 0;
for (int i = 0; i < array1.length; i++) {
   for (int j = 0; j < array2.length; j++) {
       if (array1[i] == array2[j]) {
           intersection[intersectionIndex++] = array1[i];
           break;
       }
   }
}
int[] trimmedArray = new int[intersectionIndex];
System.arraycopy(intersection, 0, trimmedArray, 0, intersectionIndex);
int[] interseccion = trimmedArray;;
            a1 = card(a);
            int = a1
            b1 = card(b);
            int = b1
            c1 = card(c);
            int = c1
            d1 = card(d);
            int = d1

    }

}
