class Rectangulo:

    """ Crear una clase llamada rectangulo, debe tgener 2 atributos: altura y base
    el nombre del método sera calcular area utilizando la fórmula:
    area = base * altura. Pero la base y la altura debern ser ingresados por
    el usuario y losobjetos deben ser tres.
    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.base * self.altura

base = int(input("Digite el número para la base del rectáangulo: "))
altura = int(input("Ingrese el número para la altura del rectángulo"))
rectangulo1 = Rectangulo(base, altura)
print(f"El area dek rectangulo es: {rectangulo1.calcular_area()}")
