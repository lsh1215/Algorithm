N = int(input())

li = []

for i in range(N):
    M = input()
    li.append(M)

first= list(set(li))
second = sorted(first, key=lambda x: (len(x), x))
# 람다함수 표현 식 -> 입력 값 x일 때 최초 길이 이후 단어자체


for i in range(len(second)):
    print(second[i])

