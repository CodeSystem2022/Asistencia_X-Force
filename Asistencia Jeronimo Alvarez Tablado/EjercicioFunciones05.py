# Ejercicio 5: Convertidor de temperaturas
# Realizar dos funciones para convertir de grados celsius a fahrenheit y viceversa
# Investigar formulas

def celsius_fahrenheit(celsius):
    return (celsius * 9 / 5) + 32


def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9


while True:
    print('\nConversor de temperatura: ')
    print('#1 - Convertir de Celsius a Fahrenheit')
    print('#2 - Convertir de Fahrenheit a Celsius')
    print('#3 - Salir')

    option = int(input('\nIngrese el numero correspondiente a la opción: '))
    grado = float(input('\nIngrese el valor: '))
    if option == 1:
        print(f'\n{grado} °C grados Celsius corresponde a {celsius_fahrenheit(grado):.2f} °F grados Fahrenheit')
    elif option == 2:
        print(f'\n{grado} °F grados Fahrenheit corresponde a {fahrenheit_celsius(grado):.2f} °C grados Celsius')
    else:
        print('\nOpción invalida - Numero ingresado incorrecto')
