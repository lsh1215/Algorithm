FBI = [] 
for i in range(5):
    word = input() 
    if "FBI" in word: 
        FBI.append(i+1)
        # list에 저장, 이때 list는 0부터 시작하지만 우리는 1부터 셈. 그래서 i+1
if FBI: 
    print(*FBI)
    # 언패킹 연산자, 여러 요소를 포함하는 자료형의 개별 요소들을 한번에 처리할 때 사용
else: 
    print("HE GOT AWAY!")