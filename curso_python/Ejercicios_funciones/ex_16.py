def numeros_primos(numero):
    count = 2
    lista_primos = []

    while count < numero:
        count2 = 2
        while count % count2 != 0 and count2 < count:
            count2 += 1
            if count == count2:
                lista_primos.append(count)
        count += 1
    return lista_primos

lista = numeros_primos(50)
print(lista)
