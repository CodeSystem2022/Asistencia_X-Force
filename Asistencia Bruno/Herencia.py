

class Vehiculo():
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas
    
    def __str__(self):
        return "Color: " + self.color + "\n" + "Ruedas: " + str(self.ruedas)


class Auto (Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__()+ "\n" + "Velocidad (km/h): " + self.velocidad


class Bicicleta (Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo
    
    def __str__(self):
        return super().__str__()+ "\n" + "Tipo: "+ self.tipo


vehiculo1 = Vehiculo ("negro", 4)

vehiculo2 = Vehiculo ("beige", 4)

auto1 = Auto ("rojo", 4, "60 km/h")

auto2 = Auto ("verde", 4, "30 km/h")

bici1 = Bicicleta ("azul", 2, "playera")

bici2 = Bicicleta ("Blanco", 2, "De montaña")

print(vehiculo1)
print (auto2)
print (bici1)