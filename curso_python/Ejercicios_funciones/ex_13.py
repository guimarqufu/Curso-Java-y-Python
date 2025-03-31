def filtrar_pares_impares(*lista_numeros):
    result = {"par": [], "impar": []}
    for numero in lista_numeros:
        if numero % 2 == 0:
            result["par"].append(numero)
        else:
            result["impar"].append(numero)
    return result

res = filtrar_pares_impares(1, 2, 3, 4, 5)
print(res)