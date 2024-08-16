def find_median(data, n):
    if n % 2 == 1:
        return data[n // 2]  # 홀수 개일 때 중간 값 반환
    else:
        mid1 = data[n // 2 - 1]
        mid2 = data[n // 2]
        return (mid1 + mid2) / 2  # 짝수 개일 때 중간 두 값의 평균 반환

i = 1
while True:
    numbers = list(map(int, input().split()))  # 공백으로 구분하여 숫자로 변환

    if numbers[0] == 0:  # 첫 번째 값이 0이면 종료
        break

    n = numbers[0]  # 첫 번째 값은 데이터의 개수
    data = numbers[1:]  # 나머지 값들이 실제 데이터
    data.sort()

    median = find_median(data, n)  # 중앙값 구하기
    print(f"Case {i}: {median:.1f}")  # 소수점 1자리까지 출력
    i += 1
