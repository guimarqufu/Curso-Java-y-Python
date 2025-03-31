numero = int(input("Introduce un numero para sumar, introduce 0 para parar: "))

res = 0
while numero != 0:
    res += numero
    print("Resultado:", res)
    numero = int(input("Introduce un numero para sumar, introduce 0 para parar: "))