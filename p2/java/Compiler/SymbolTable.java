package Compiler;

import java.util.Vector;

import Errors.VarDefTwiceExc;
import Errors.VarNotDefExc;

public class SymbolTable {
    private static Vector<TableEntry> table = new Vector<TableEntry>();

    public static void newEntry(String name, int type) throws VarDefTwiceExc {
        TableEntry e = search(name);
        if(e == null) {
            e = new TableEntry(name, type);
            table.add(e);
        } else {
            throw new VarDefTwiceExc(name);
        }
    }

    public static int getType (String name) throws VarNotDefExc {
        TableEntry e = search(name);
        
        if(e == null) {
            throw new VarNotDefExc(name);
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
