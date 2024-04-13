/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * IntSetA.java
 */

package GeneratedCodeLib;

import java.util.*;
import Errors.*;

public abstract class IntSetA {
    private final Vector<Integer> intSetData;

    public IntSetA() {
		intSetData = new Vector<Integer>();
    }

    public IntSetA(Vector<Integer> v) {
		int i;
		Object[] b = v.toArray();
		int[] a = new int[b.length];

		for(i = 0; i < b.length; i++) {
			a[i] = ((Integer)b[i]).intValue();
		}

		Arrays.sort(a);
		intSetData = new Vector();

		for(i = 0; i < a.length; i++) {
			if ((i > 0) && (a[i] == a[i-1]))
				continue;
			intSetData.add(a[i]);
		}
    }

    public boolean belongsTo(int i) {
		return intSetData.contains(i);
    }

    public Vector<Integer> getIntSetData() {
		return intSetData;
    }

    public abstract IntSetA unionSet(IntSetA is);

    public boolean equals(IntSetA is) {
		Vector<Integer> isV = is.getIntSetData();

		int isSz = isV.size();
		int i;

		if (intSetData.size() != isSz)
			return false;

		i = 0;

		while(i < isSz) {
			if (isV.get(i) != intSetData.get(i))
				return false;
			i++;
		}
		return true;
	}

    public abstract IntSetA intersectionSet(IntSetA is);

    public int card() {
		return intSetData.size();
    }

    public int lowestElem() throws EmptySetException {
		if (intSetData.size() == 0) {
			throw new EmptySetException();
		}
		return intSetData.get(0).intValue();
    }

    public abstract IntSetA setDif(IntSetA is);
}
