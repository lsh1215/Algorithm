while True:
    text = input().strip()  # 입력받기 (양쪽 공백 제거)

    if text == "END":  # "END"를 만나면 종료
        break

    print(text[::-1])  # 문자열을 뒤집어서 출력