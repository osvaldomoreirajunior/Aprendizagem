from random import randint

lista1 = [randint(0, 5000000) for x in range(500)]
print(lista1)

lista2 = [randint(0, 5000000) for x in range(50000)]
print(lista2)

lista_final = [x for x in lista2 if x in lista1]
print(lista_final)