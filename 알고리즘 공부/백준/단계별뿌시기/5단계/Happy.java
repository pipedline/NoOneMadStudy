//## [10818 최소, 최대](https://www.acmicpc.net/problem/10818)
import java.util.Scanner;
class Happy {
     
    public static void main(String args[]) {
        int max = -1000000;
        int min = 1000000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int t = arr[i];
            if (t > max)
                max = t;
            if (t < min)
                min = t;
        }
        sc.close();
        System.out.println(min + " " + max);
    }
} 
import java.util.Scanner;
class Happy2{
    public static void main(String args[]){
        //최대값을 넣을 변수를 가장작은 수인 0으로 초기화시켜놓음
        int max = 0;
        int n = 0; //몇번째인지
        int t = 0; //입력받은 자연수
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<10;i++){
            t = sc.nextInt();
            //최대값보다 입력받은 값이 클경우 최대값에 넣어줌
            if(t > max){
                max = t;
                n = i;
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(n);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Happy3{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과담을 배열
        int[] arr = new int[10];
        //입력받아 곱한값
        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String str = String.valueOf(val);
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'0']++;
        }
        for(int j=0;j<10;j++){
            System.out.println(arr[j]);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Happy4{
    public static void main(String[] args) throws IOException{
        //디폴트값 false, 나머지는 0부터 41까지 될 수 있기 때문에 42
        boolean[] arr = new boolean[42];
        //속도빠르게 하려고 BufferedReader썼습니당
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            //나머지가 있는 인덱스의 값을 true로
            arr[Integer.parseInt(br.readLine())%42] = true;
        }
        int count = 0;
        for(int j=0;j<42;j++){
            //0~41중 나머지가 있을때만 count세기
            if(arr[j]) count++;
        }
        System.out.println(count);
    }
}

import java.util.Scanner;
class Happy5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //점수 담을 배열
        double[] score = new double[n];
        //최대값 담을 변수에 최소값으로 초기화해놓기
        double m = 0;
        for(int i=0;i<n;i++){
            //점수 입력받고 첫번째엔 0보다 큰 수가 m이 되고, 그뒤부턴 그 값보다 클경우 m에 대입
            score[i] = sc.nextDouble();
            if(score[i]>m) m = score[i];
        }
        sc.close();
        double sum = 0;
        for(int i=0;i<n;i++){
            sum += (score[i]/m*100);
        }
        System.out.println(sum/n);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Happy6{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //OX담을 배열
        String[] arr = new String[Integer.parseInt(br.readLine())];
        //입력
        for(int i=0;i<arr.length;i++){
            arr[i] = br.readLine();
        }
        for(int i=0;i<arr.length;i++){
            int count = 0;
            int sum = 0;
            for(int j=0;j<arr[i].length();j++){
                //O일 경우 count세기
                if(arr[i].charAt(j)=='O')
                    count ++;
                //X일경우 0으로 초기화
                else
                    count = 0;
                sum += count;
            }
            System.out.println(sum);
        }
    }
}

import java.util.Scanner;
class Happy7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //테스트케이스 담는 배열
        int[] cArr = new int[sc.nextInt()];
        for(int i=0;i<cArr.length;i++){
            //학생수
            int n = sc.nextInt();
            //점수담는 배열
            int[] score = new int[n];
            double sum = 0;
            double avg = 0;
            double cnt = 0;
            for(int j=0;j<n;j++){
                score[j] = sc.nextInt();
                sum += score[j];
            }
            avg = sum / n;
            for(int j=0;j<n;j++){
                if(score[j]>avg) cnt ++;
            }
            //printf함수로 출력포맷 정하기
            System.out.printf("%.3f%%\n",(cnt/n)*100);
        }
        sc.close();
    }
}
