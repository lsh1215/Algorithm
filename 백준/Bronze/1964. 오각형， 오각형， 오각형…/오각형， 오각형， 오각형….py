N = int(input())

sum = 1

for i in range(1,N+1):
    sum += (i+1)*3 -2

print(sum%45678)