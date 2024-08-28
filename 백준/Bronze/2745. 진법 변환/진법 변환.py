num = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

N, B = input().split()

sum = 0;
N = N[::-1]

for i in range(0,len(N)):
    sum += num.index(N[i])*(int(B)**i)

print(sum)