def invertir_diccionario(**dicc):
    dicc_invertido = {}
    for clave, valor in dicc.items():
        dicc_invertido[valor] = clave
    return dicc_invertido


dicc = {"manuel": 6, "antonio": 5, "paco": 9, "jose": 4}
dicc2 = invertir_diccionario(**dicc)
print(dicc2)