def elementos_comunes(lista1, lista2):
    lista = []
    for elemento in lista1:
        lista.append(elemento)
    for elemento in lista2:
        lista.append(elemento)
    return lista

lista1 = [1, 2, "hola"]
lista2 = [3, "adios", 4]
lista = elementos_comunes(lista1, lista2)
print(lista)