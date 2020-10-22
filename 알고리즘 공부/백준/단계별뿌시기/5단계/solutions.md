# 1차원 배열

## [10818 최소, 최대](https://www.acmicpc.net/problem/10818)

문제 요약 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

- 😎Python3
  > ```Python
  > N = int(input())
  > number = list(map(int, input().split()))
  > print(min(number), max(number))
  > ```
