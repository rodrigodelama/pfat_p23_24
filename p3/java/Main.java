/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 3
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Main.java
 */

import Parser.*;
import Lexer.*;
import java.io.*;

import AST.Prog;

public class Main {
    public static void main(String args[]) throws Exception {
        java.io.BufferedReader in;
        Yylex sc;
        parser p;
        java_cup.runtime.Symbol sroot;
        boolean error = false;

        // p2 - Analisis semantico
        Prog programa = null;

        // El primer parametro es el nombre del fichero con el programa
        if (args.length < 1) {
            System.out.println("Uso: java Main <nombre_fichero>");
            error = true;
        }

        // Analisis lexico y sintactico
        if (!error) {  
            try {
                in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
                sc = new Yylex(in);
                p = new parser(sc);

                // p1 - Analisis lexico y sintactico
                sroot = p.parse();
                System.out.println("Analisis lexico y sintactico correctos");

                // p2 - Analisis semantico
                programa = (Prog) sroot.value;
                programa.computeAH1();
                programa.computeTyp();
                System.out.println("Analisis Semantico correcto");
            } catch(IOException e) {
                System.out.println("Error abriendo fichero: " + args[0]);
                error = true;
            }
        }

        // p3 - Generacion de código
        if (!error) {
            try {
                String nombreFicheroJava = args[0] + ".java";
                BufferedWriter w = new BufferedWriter(new FileWriter(nombreFicheroJava));
                w.write("import GeneratedCodeLib.*;");
                w.newLine();
                w.newLine();
                w.write("public class " + args[0] + " {");
                w.newLine();
                programa.generateCode(w, "    ");
                w.newLine();
                w.write("}");
                w.newLine();
                w.close();
                System.out.println("Codigo generado en fichero " + nombreFicheroJava);
            } catch(IOException e) {
                System.out.println("Error abriendo fichero: " + args[0] + ".java");
                error = true;
            }
        }
    }
}
