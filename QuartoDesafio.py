import string

a = list(string.ascii_lowercase)
b = list(range(1, 27))
c = list(string.ascii_uppercase)
d = list(range(27, 52))

palavra = str(input('Digite uma palavra: '))

def test(entrada):
    encontrado = [b[a.index(s)] for s in entrada]
    return sum(encontrado)
def test2 (entrada2):
    encontrado = [d[c.index(x)] for x in entrada2]
    return sum(encontrado)

if palavra == palavra.lower():
     resultado_palavra = test(palavra)
elif palavra == palavra.upper():
    resultado_palavra = test2(palavra)
print(resultado_palavra)
if resultado_palavra % 2 ==1:
    print(f'A palavra {palavra} é PRIMA')
else:
    print(f'A palavra {palavra} NÃO é PRIMA')