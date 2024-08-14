M = int(input())

t = 1

for i in range (1,M+1) :
    v1, v2 = map(int,input().split())
    if v1 == t:
        t ^= v2
        v2 ^= t
        t ^= v2
    elif v2 ==t:
        t ^= v1
        v1 ^= t
        t ^= v1

print(t)
