package Compiler;

import java.util.Vector;

import Errors.DoublyDefinedExc;
import Errors.VarNotDefinedExc;

public class SymbolTable {
    private static Vector<TableEntry> table = new Vector<TableEntry>();

    public static void newEntry(String name, int type) throws DoublyDefinedExc {
        TableEntry e = search(name);
        if(e == null) {
            e = new TableEntry(name, type);
            table.add(e);
        } else {
            throw new DoublyDefinedExc(name);
        }
    }

    public static int getType (String name) throws VarNotDefinedExc {
        TableEntry e = search(name);
        
        if(e == null) {
            throw new VarNotDefinedExc(name);
        }
        return(e.getType());
    }

    private static TableEntry search (String name) {
        TableEntry e = null;
        int i = 0;
        while(i < table.size()) {            
            e = table.get(i);
            if(e.getName().equals(name)) {
                break;
            }
            e = null;
            i++;
        }
        return e;
    }
}
