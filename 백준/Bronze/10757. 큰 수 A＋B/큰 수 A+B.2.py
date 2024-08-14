import time

A, B = input().split()
start_time = time.time()  # 시작 시간 기록

stack_A = [a for a in A] # A를 스택에 저장
stack_B = [b for b in B] # B를 스택에 저장
flag = 0 # carry flag
ans = ""
while True:
    if len(stack_A) == 0 and len(stack_B) == 0:
        if flag != 0: # 남아있는 carry flag 있다면
            ans = str(flag) + ans
        print(ans)
        break
    elif len(stack_A) == 0: # stack_A가 빈 스택이라면
        stack_A.append(0)
    elif len(stack_B) == 0: # stack_B가 빈 스택이라면
        stack_B.append(0)

    a = int(stack_A.pop())
    b = int(stack_B.pop())

    sumAB = flag + a + b
    ans = str(sumAB % 10) + ans
    flag = sumAB // 10 # 새로운 carry flag 저장

end_time = time.time()  # 종료 시간 기록
print(end_time - start_time)