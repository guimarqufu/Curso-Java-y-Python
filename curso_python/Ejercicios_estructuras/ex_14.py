tupla = ("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

dia = input("Introduce el dia para buscarlo: ")

res = False
for dia2 in tupla:
    if dia2 == dia:
        res = True

if res:
    print("El dia si se encuentra en la lista")
else:
    print("No se encuentra el dia en la lista") 