#!/bin/bash

# Comprobar si se proporcionó un nombre de archivo como argumento
if [ $# -eq 0 ]; then
    echo "Debe proporcionar un nombre de archivo como argumento."
    exit 1
fi

# Compilar el programa
g++ traductor_pcode_char.cc -o traductor_pcode_char

# Comprobar si la compilación fue exitosa
if [ $? -ne 0 ]; then
    echo "Error al compilar el programa."
    exit 1
fi

# Ejecutar el programa con el nombre de archivo proporcionado
./traductor_pcode_char $1

# Comprobar si la ejecución fue exitosa
if [ $? -ne 0 ]; then
    echo "Error al ejecutar el programa."
    exit 1
fi

exit 0
