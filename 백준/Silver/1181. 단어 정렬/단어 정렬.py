N = int(input())

li = []

for i in range(N):
    M = input()
    li.append(M)

first= list(set(li))
second = sorted(first, key=lambda x: (len(x), x))


for i in range(len(second)):
    print(second[i])

