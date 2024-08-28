N = int(input())
A = []
for _ in range(N):
    A.append(int(input()))
A = sorted(A)

for i in range(N):
    print(A[i])