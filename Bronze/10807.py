import sys

N = int(input())
N_list = input()

if len(N_list.split()) == N :
    number_list = list(map(int, N_list.split()))
# 처음 입력값과 이후 입력값들의 갯수가 동일하지 않으면 프로그램 종료

else:
    sys.exit(-1)


v = int(input())

print(number_list.count(v))