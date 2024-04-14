package lib.attributes;

import lib.symbolTable.Symbol;
import java.util.ArrayList;

public class Attributes implements Cloneable {
    public Symbol.Types type;
    public Symbol.ParameterClass parClass;
    public ArrayList<Symbol> parList;
    public ArrayList<Integer> intList;
    public Boolean isArray, isVar, isVecComp, isConst;
    public String name;

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
        // exps?
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