/*
 * Procesamiento de Formatos en Aplicaciones Telemáticas
 * Práctica 1
 * 
 * Rodrigo De Lama Fernández - 100451775
 * Isabel Schweim - 100460211
 * 
 * Main.java
 */

import Parser.*;
import Lexer.*;
import java.io.*;

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
          sroot = p.parse();
          System.out.println("Analisis lexico y sintactico correctos");
      } catch(IOException e) {
          System.out.println("Error abriendo fichero: " + args[0]);
          error= true;
      }
    }
  }
}
