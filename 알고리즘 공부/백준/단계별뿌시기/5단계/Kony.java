import java.util.Scanner;

public class Kony {
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
// ## [2577번 숫자의 개수](https://www.acmicpc.net/problem/2577)
// ## [3052번 나머지](https://www.acmicpc.net/problem/3052)
// ## [1546번 평균](https://www.acmicpc.net/problem/1546)
// ## [8958번 OX퀴즈](https://www.acmicpc.net/problem/8958)
// ## [4344번 평균은 넘겠지](https://www.acmicpc.net/problem/4344)
