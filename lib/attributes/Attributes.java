package lib.attributes;

import lib.symbolTable.Symbol;
import java.util.ArrayList;

public class Attributes implements Cloneable {
    public Symbol.Types type;
    public Symbol.ParameterClass parClass;
    public ArrayList<Symbol> parList;

    public Attributes() {
        type = Symbol.Types.UNDEFINED;
        parClass = Symbol.ParameterClass.VAL;
        parList = null;
        // esArray o es componente de vector?
        // const?
        // exps?
        // esVar?
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