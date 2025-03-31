año = int(input("Introduce un año para comprobar si es bisiesto: "))

if (año % 4 == 0):
    if (año % 100 == 0):
        if (año % 400 == 0):
            res = True
        else:
            res = False
    else:
        res = True
else:
    res = False

if res:
    print("El año", año, "es bisiesto")
else:
    print("El año", año, "no es bisiesto")