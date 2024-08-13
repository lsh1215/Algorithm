import time


v1, v2 = map(int,input().split())
start_time = time.time()  # 시작 시간 기록
print(v1+v2)
end_time = time.time()  # 종료 시간 기록
print(end_time - start_time)
