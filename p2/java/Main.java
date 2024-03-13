import Parser.*;
import Lexer.*;
import java.io.*;

import AST.Prog;

public class Main
{
  public static void main(String args[]) throws Exception{
    java.io.BufferedReader in;
    Yylex sc;
    parser p;
    java_cup.runtime.Symbol sroot;
    boolean error=false;

    //El primer parametro es el nombre del fichero con el programa
    if (args.length < 1) {
      System.out.println(
        "Uso: java Main <nombre_fichero>");
      error=true;
    }

    //Analisis lexico y sintactico

    if (!error) {  
      try {
          in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
          sc = new Yylex(in);
          p = new parser(sc); 
          sroot = p.parse(); //p.parser realiza el analisis sintactico
          System.out.println("Analisis lexico y sintactico correctos");
          
          // Added new code for p2
          Prog raiz = (Prog) sroot.value;
          raiz.computeAH1();
          raiz.compruebaTipos();
          System.out.println("Analisis Semantico correcto");
          // End of new code for p2
          
      } catch(IOException e) {
          System.out.println("Error abriendo fichero: " + args[0]);
          error= true;
      }
    }
  }
}
