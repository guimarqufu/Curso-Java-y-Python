lista = ["hola", "que", "tal", "hola", "que", "hola"]
palabra = input("Introduce la palabra para buscarla: ")

repeticiones = 0
for elemento in lista:
    if elemento == palabra:
        repeticiones += 1


print("La palabra buscada aparece:", repeticiones, "veces")