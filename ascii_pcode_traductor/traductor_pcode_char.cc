#include <iostream>
#include <fstream>

using namespace std;


/**
 * @brief 
 * 
 * Pre: El contenido del fichero debe ser un programa en p-code.
 *      En p-code, el formato de escritura es STC <ascii> y WRT 0.
 *      Ignoraremos cualquier otra instrucción.
 * 
 * Post: Devuelve un nuevo fichero con la cadena de caracteres que 
 *       se ha ido formando con las instrucciones STC y WRT a lo 
 *       largo del fichero de entrada. Se omitiran las instrucciones
 *       que no sean STC o WRT. 
 * 
 *       Tabmién debe indicar, por cada cadena de caracteres hasta que termine
 *       en un salto de linea, el número de linea de comienzo y la de final del
 *       fichero original en el que se comenzo a leer dicha cadena.
 * 
 *       Por ejemplo, si recibimos:
 * 
 *             STC 72
 *             WRT 0
 *             STC 101
 *             WRT 0
 *             STC 108
 *             WRT 0
 *             STC 108
 *             WRT 0
 *             STC 111
 *             WRT 0
 * 
 *      El fichero de salida contendrá: "Hello"
 * 
 * @param nombreFichero 
 */
void traducirPcodeAChar(const string &nombreFichero) {
    ifstream fichero;
    fichero.open(nombreFichero);
    if (fichero.is_open()) {
        ofstream ficheroSalida;
        ficheroSalida.open("traduccion.txt");
        if (ficheroSalida.is_open()) {
            char instruccion;
            int ascii;
            while (!fichero.eof()) {
                fichero >> instruccion;
                if (instruccion == 'S') {
                    fichero >> instruccion;
                    if (instruccion == 'T') {
                        fichero >> instruccion;
                        if (instruccion == 'C') {
                            fichero >> ascii;
                            ficheroSalida << (char)ascii;
                        }
                    }
                }
            }
            ficheroSalida.close();
        } else {
            cout << "Error al abrir el fichero de salida." << endl;
        }
        fichero.close();
    } else {
        cout << "Error al abrir el fichero de entrada." << endl;
    }
}

// el usuario debe pasar como parametro el nombre del fichero que contiene el programa en p-code.
int main(int argc, char *argv[]) {
    if (argc != 2) {
        cout << "Error en los argumentos." << endl;
        cout << "Uso: " << argv[0] << " <nombre_fichero>" << endl;
        return 1;
    }
    traducirPcodeAChar(argv[1]);
    return 0;
}