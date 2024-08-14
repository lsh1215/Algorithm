import sys

N = int(input())
N_list = input()

if len(N_list.split()) == N :
    number_list = list(map(int, N_list.split()))
else:
    sys.exit(-1)

v = int(input())

print(number_list.count(v))