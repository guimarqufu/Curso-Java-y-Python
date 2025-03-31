palabra = input("Introduces una palabra: ")

contador_letras = {}

for letra in palabra:
    if letra in contador_letras:
        contador_letras[letra] += 1
    else:
        contador_letras[letra] = 1

print("Conteo de letras:", contador_letras)