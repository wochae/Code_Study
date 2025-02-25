#dna
n, m = map(int, input().split())
dnas = []

for q in range(n) :
    dna = input()
    dnas.append(dna)

res = ''
res_cnt = 0

for i in range(m) :
    a, t, g, c = 0, 0, 0, 0
    
    for j in range(n) :
        if 'A' == dnas[j][i] :
            a += 1
        elif 'T' == dnas[j][i] :
            t += 1
        elif 'G' == dnas[j][i] :
            g += 1
        else :
            c += 1

    dna_select = {'A':a, 'C':c, 'G':g, 'T':t }
    min_dna = max(dna_select, key=dna_select.get)

    res += min_dna
    res_cnt += n - max(list(dna_select.values()))



print(res)
print(res_cnt)