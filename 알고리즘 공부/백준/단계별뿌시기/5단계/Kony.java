
//## [10818 최소, 최대](https://www.acmicpc.net/problem/10818)
import java.util.Scanner;

class Kony {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int score[] = new int[input];
		int max, min;
		int ii = 0;
		for (int i = 0; i < score.length; i = i + 1) {
			score[i] = sc.nextInt();
			ii = i + 1;
		}

		max = score[0];
		min = score[0];

		for (int i = 0; i < score.length; i = i + 1) {
			if (max < score[i])
				max = score[i];

			if (min > score[i])
				min = score[i];
		}
		System.out.println("출력 : " + max + " " + min);
		sc.close();
	}
}

// ## [2562번 최댓값](https://www.acmicpc.net/problem/10818)
class Kony2 {
	public static void main(String[] args) {

		int[] score = { 3, 29, 38, 12, 4, 74, 6, 2, 14 };

		int max = score[0];
		int cnt = 0;
		for (int i = 0; i < score.length; i = i + 1) {
			if (max < score[i]) {
				max = score[i];
				cnt = i + 1;
			}
		}
		System.out.printf("최대값: " + max);
		System.out.printf("\n줄: " + cnt);
	}
}

// ## [2577번 숫자의 개수](https://www.acmicpc.net/problem/2577)

// ## [3052번 나머지](https://www.acmicpc.net/problem/3052)
// ## [1546번 평균](https://www.acmicpc.net/problem/1546)
// ## [8958번 OX퀴즈](https://www.acmicpc.net/problem/8958)
// ## [4344번 평균은 넘겠지](https://www.acmicpc.net/problem/4344)
