def check_bad_good(K, L):
    for i in range(2, L):
        if K % i == 0:
            print("BAD " + str(i))
            return  # 함수 종료

    print("GOOD")

K, L = map(int, input().split())
check_bad_good(K, L)