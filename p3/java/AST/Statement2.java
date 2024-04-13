/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Statement2.java
 */

package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import Compiler.SymbolTable;
import Compiler.Typ;
import Errors.CompilerExc;
import Errors.TypExc;

public class Statement2 implements Statement {
    public final String identifier;

    public Statement2(String identifier) {
        this.identifier = identifier;
    }

    public int computeStTyp() throws CompilerExc {
        int st1;
        st1 = SymbolTable.getType(identifier);
        
        if(st1 == Typ.t_int) {
            return Typ.t_void;
        } else {
            throw new TypExc("ERROR: en Statement2 (no es un entero)");
        } 
    }

    //TODO: print the value of the integer
    //PRINT_I PAREN IDENT:i TESIS {:RESULT=new Statement2(i); :}
    public void generateCode(BufferedWriter w, String indent) throws IOException {
        try {
            w.write("int = " + identifier);
            w.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // w.write("El valor de la variable x es: " + identifier);
    }
}
