def modificar_lista(*lista):
    lista = list(lista)
    lista.append(5)
    print(lista)

lista = [1, 4, 8, 7]
print(lista)
modificar_lista(*lista)