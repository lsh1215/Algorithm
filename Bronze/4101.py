while True :
    v1, v2  = map(int,input().split())
    if v1 ==0 and v2 ==0:
        break
    elif v1 > v2:
        print("Yes")
    else :
        print("No")