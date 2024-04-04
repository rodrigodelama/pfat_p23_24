/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 2
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * ConstanteEntera.java
 */

package AST;

import Compiler.Typ;
import Errors.CompilerExc;

public class ConstanteEntera implements Exp {
    public final int constanteEnteraDecimal;

    public ConstanteEntera(int constanteEnteraDecimal) {
        this.constanteEnteraDecimal = constanteEnteraDecimal;
    }

    public int computeTyp() throws CompilerExc {
        return Typ.t_int;
    }
}
