# 1차원 배열

## [10818 최소, 최대](https://www.acmicpc.net/problem/10818)

문제 요약 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

- 😎Python3

  > ```Python
  > N = int(input())
  > number = list(map(int, input().split()))
  > print(min(number), max(number))
  > ```

- 😝Java
  > ```Java
  >  import java.util.Scanner;
  >  class Main{
  >  public static void main(String args[]){
  >  int max = -1000000;
  >  int min = 1000000;
  >  Scanner sc = new Scanner(System.in);
  >  int n = sc.nextInt();
  >  int arr[] = new int[n];
  >  for(int i=0;i<n;i++){
  >  arr[i] = sc.nextInt();
  >  int t = arr[i];
  >  if(t > max) max = t;
  >  if(t < min) min = t;
  >  }
  >  sc.close();
  >  System.out.println(min + " " + max);
  >  }
  >  }
  > ```
