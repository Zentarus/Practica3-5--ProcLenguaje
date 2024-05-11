package lib.errores;

import lib.symbolTable.exceptions.AlreadyDefinedSymbolException;
import lib.symbolTable.exceptions.SymbolNotFoundException;

//  Puede recibir un Token, mensaje de excepción, un atributo etc...
public class ErrorSemantico {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[31m";

    public static Boolean ERR_SEMANTICO = false;

    /**
     * Función deteccion que imprime un mensaje de error.
     *
     * @param mensaje String que se imprimirá como mensaje de error.
     */
    public static void deteccion(String mensaje) {
        // Indicamos al compilador que ha habido un error semántico:
        ERR_SEMANTICO = true;
        // Mostramos mensaje
        System.err.println(ANSI_RED + mensaje + ANSI_RESET);
    }

    /**
     * Función deteccion que imprime una excepción junto con un mensaje de error.
     *
     * @param excepcion Excepción que se imprimirá.
     * @param token     Token que causa la excepción.
     */
    public static void deteccion(Exception excepcion, String token) {
        // Indicamos al compilador que ha habido un error semántico:
        ERR_SEMANTICO = true;
        // Mostramos mensaje de error.
        if (excepcion instanceof AlreadyDefinedSymbolException) {
            System.err.println(ANSI_RED + "Simbolo ya definido: " + token + ANSI_RESET);
        } else if (excepcion instanceof SymbolNotFoundException) {
            System.err.println(ANSI_RED + "Simbolo no encontrado: " + token + ANSI_RESET);
        }
    }
}
