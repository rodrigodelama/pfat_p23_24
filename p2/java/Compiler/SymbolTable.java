/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * SymbolTable.java
 */

package Compiler;

import java.util.Vector;

import Errors.VarNotDefExc;
import Errors.VarDefTwiceExc;

public class SymbolTable {
    private static Vector<TableEntry> table = new Vector<TableEntry>();

    public static void newEntry(String name, int type) throws VarDefTwiceExc {
        TableEntry entry = search(name);

        if(entry == null) {
            entry = new TableEntry(name, type);
            table.add(entry);
        } else {
            throw new VarDefTwiceExc(name);
        }
    }

    public static int getType(String name) throws VarNotDefExc {
        TableEntry entry = search(name);

        if(entry == null) {
            throw new VarNotDefExc(name);
        }
        return(entry.getType());
    }

    private static TableEntry search(String name) {
        TableEntry entry = null;
        int i = 0;

        while(i < table.size()) {            
            entry = table.get(i);
            if(entry.getName().equals(name)) {
                break;
            }
            entry = null;
            i++;
        }
        return entry;
    }
}
