package lib.errores;

import lib.symbolTable.exceptions.AlreadyDefinedSymbolException;
import lib.symbolTable.exceptions.SymbolNotFoundException;

//  Puede recibir un Token, mensaje de excepción, un atributo etc...
public class ErrorSemantico {
    /**
     * Función deteccion que imprime un mensaje de error.
     *
     * @param mensaje String que se imprimirá como mensaje de error.
     */
    public static void deteccion(String mensaje) {
        System.err.println(mensaje);
    }

    /**
     * Función deteccion que imprime una excepción junto con un mensaje de error.
     *
     * @param excepcion Excepción que se imprimirá.
     * @param token     Token que causa la excepción.
     */
    public static void deteccion(Exception excepcion, String token) {
        if (excepcion instanceof AlreadyDefinedSymbolException) {
            System.err.println("Simbolo ya definido: " + token);
        } else if (excepcion instanceof SymbolNotFoundException) {
            System.err.println("Simbolo no encontrado: " + token);
        }
    }
}
