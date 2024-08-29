N = int(input())

A = list(map(int, input().split()))
count = 0

for i in range(N):
    if A[i] > 1:  # 1은 소수가 아니므로 2 이상의 수에 대해서만 검사
        for j in range(2, int(A[i]**0.5) + 1):
            if A[i] % j == 0:
                break
        else:  # 소수일 경우 이 else 블록이 실행됨
            count += 1

print(count)