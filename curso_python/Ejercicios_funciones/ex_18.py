def sumar_valores(**dicc):
    result = 0
    for valor in dicc["numero"]:
        result += valor
    return result

dicc = {"numero": []}
dicc["numero"].append(2)
dicc["numero"].append(2)
dicc["numero"].append(20)
res = sumar_valores(**dicc)
print(res)