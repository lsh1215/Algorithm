L , P = map(int,input().split())

values = list(map(int,input().split()))

for i in range(5):
    print(f'{values[i] - (L * P)}', end=' ')