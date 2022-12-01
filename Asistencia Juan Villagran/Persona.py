class Persona:  # clase creada
    def __init__(self, nombre, apellido, edad):  # metodo init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalles(self):
        print(f'persona:{self.nombre} {self.apellido} {self.edad}')

persona1 = Persona('Juan', 'Villagran', 25)
print(f'El objeto 1  de la clase persona;  nombre: {persona1.nombre}  apellido: {persona1.apellido} edad: {persona1.edad}')

persona2 = Persona('Andres','Pio', 20)
print(f'El objeto 2  de la clase persona;  nombre: {persona2.nombre}  apellido: {persona2.apellido} edad: {persona2.edad}')

# Modificar un objeto

persona1.nombre = 'Rocio'
persona1.apellido = 'Villagran'
persona1.edad = '24'

print(f'El objeto 1 modificado de la clase persona;  nombre: {persona1.nombre}  apellido: {persona1.apellido} edad: {persona1.edad}')
# Los atributos son caracteristicas
# Los metodos son el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalles()
persona2.mostrar_detalles()