M = int(input())

## 변수 설정해서 초기화(최초에 1번 컵이기 때문에 1로)
t = 1

## M번 반복
for i in range (1,M+1) :
    ## 값 두개를 받아 둘 중 하나가 t와 같으면(컵을 바꿔야 하면), 다른 하나와 값을 바꾸도록
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


