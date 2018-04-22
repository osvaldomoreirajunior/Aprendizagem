import string

a = list(string.ascii_lowercase)
b = list(range(1, 27))
c = list(string.ascii_uppercase)
d = list(range(27, 53))

palavra = str(input('Digite uma palavra: '))

def test(entrada):
    if palavra == palavra.lower():
        encontrado = [b[a.index(s)] for s in entrada]
    elif palavra == palavra.upper():
        encontrado = [d[c.index(s)] for s in entrada]
    return sum(encontrado)

resultado_palavra = test(palavra)
print(resultado_palavra)

if resultado_palavra % 2 ==1:
    print(f'A palavra {palavra} é PRIMA')
else:
    print(f'A palavra {palavra} NÃO é PRIMA')
