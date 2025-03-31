def min_max_lista(*lista_numeros):
    dicc = {"minimo": [], "maximo": []}

    maximo = lista_numeros[0]
    minimo = lista_numeros[0]

    for numero in lista_numeros:
        if numero > maximo:
            maximo = numero
        if numero < minimo:
            minimo = numero

    dicc["maximo"].append(maximo)
    dicc["minimo"].append(minimo)
    return dicc

res = min_max_lista(5, 800, 1, 80, 9, 100)
print(res)
