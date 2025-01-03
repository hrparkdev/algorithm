import math
import sys

input = sys.stdin.readline
m, n = map(int, input().rstrip().split())

is_prime = [True for _ in range(n + 1)] #0과 1은 소수가 아님
is_prime[0] = is_prime[1] = False

for i in range(2, int(math.sqrt(n)) + 1): #2부터 n의 제곱근까지 확인
    if is_prime[i]:
        for j in range(i * i, n + 1, i): #i의 배수 제거
            is_prime[j] = False

for i in range(m, n + 1):
    if is_prime[i]:
        print(i)