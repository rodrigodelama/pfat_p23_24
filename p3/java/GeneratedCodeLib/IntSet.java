/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * IntSet.java
 */

package GeneratedCodeLib;

import java.util.Vector;
import Errors.*;

public class IntSet extends IntSetA {

    // Empty set
    public IntSet() {
        super();
    }

    // Set with elements
    public IntSet(Vector<Integer> v) {
        super(v);
    }

    // Check if element belongs to set
    @Override
    public boolean belongsTo(int i) {
        return super.belongsTo(i);
    }

    // Get set data
    @Override
    public Vector<Integer> getIntSetData() {
        return super.getIntSetData();
    }

    // Union of two sets
    @Override
    public IntSetA unionSet(IntSetA is) {
        Vector<Integer> thisSet = this.getIntSetData();
        Vector<Integer> otherSet = is.getIntSetData();

        Vector<Integer> result = new Vector<>(thisSet);
        for (Integer elem : otherSet) {
            if (!result.contains(elem)) {
                result.add(elem);
            }
        }

        return new IntSet(result);
    }

    // Equals two sets ??
    @Override
    public boolean equals(IntSetA is) {
        return super.equals(is);
    }

    // Intersection of two sets
    @Override
    public IntSetA intersectionSet(IntSetA is) {
        Vector<Integer> thisSet = this.getIntSetData();
        Vector<Integer> otherSet = is.getIntSetData();

        Vector<Integer> result = new Vector<>();
        for (Integer elem : thisSet) {
            if (otherSet.contains(elem)) {
                result.add(elem);
            }
        }

        return new IntSet(result);
    }

    // Cardinality of set
    @Override
    public int card() {
        return super.card();
    }

    // Lowest element of set
    @Override
    public int lowestElem() throws EmptySetException {
        return super.lowestElem();
    }

    // Difference of two sets
    @Override
    public IntSetA setDif(IntSetA is) {
        Vector<Integer> thisSet = this.getIntSetData();
        Vector<Integer> otherSet = is.getIntSetData();

        Vector<Integer> result = new Vector<>(thisSet);
        result.removeAll(otherSet);

        return new IntSet(result);
    }
}

