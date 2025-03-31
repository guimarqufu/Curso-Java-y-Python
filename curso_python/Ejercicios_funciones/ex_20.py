def es_palindromo(palabra):
    count = 0
    count2 = len(palabra) - 1
    while (count < count2):
        if (palabra[count] != palabra[count2]):
            return False
        count += 1
        count2 -=1
    return True

res = es_palindromo("solos")
print(res)