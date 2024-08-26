A, I = map(int,input().split())


if (A * (I-1))+1 == A*I:
    print(A*I)
else:
    print((A * (I-1))+1)