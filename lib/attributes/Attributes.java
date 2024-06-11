package lib.attributes;

import lib.symbolTable.Symbol;
import java.util.ArrayList;
import lib.tools.codeGeneration.*;

public class Attributes implements Cloneable {
    public Symbol.Types type;
    public String const_value;
    public Symbol.ParameterClass parClass;
    public ArrayList<Symbol> parList;
    public ArrayList<Integer> intList;
    public Boolean isArray, isVar, isVecComp, isConst;
    public String name;
    public CodeBlock code;

    public Attributes() {
        type = Symbol.Types.UNDEFINED;
        parClass = Symbol.ParameterClass.NONE;
        parList = new ArrayList<Symbol>();
        intList = new ArrayList<Integer>();
        isArray = false;
        isVar = false;
        isVecComp = false;
        isConst = false;
        name = "";
        const_value = ""; // En caso de que sea char, string, int, nos guardamos su valor como t.image
        code = new CodeBlock();
        // Completar y añadirlos al toString
    }

    public Attributes clone() {
        try {
            return (Attributes) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String toString() {
        return "type = " + type + "\n" +
                "parClass = " + parClass + "\n"; // Igual hay que añadir más
    }
}