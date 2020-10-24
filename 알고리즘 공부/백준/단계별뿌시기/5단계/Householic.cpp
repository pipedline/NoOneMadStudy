// ## [10818번 최소, 최대](https://www.acmicpc.net/problem/10818)
// asdfasdf
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    // arrayLength: 원소의 갯수
    int arrayLength = 0;
    // arrayLength의 값 입력
    cin >> arrayLength;
    // 원소의 갯수에 따른 배열 생성
    int *inputArray = new int[arrayLength]{
        0,
    };
    // 원소의 갯수대로 숫자입력
    for (int i = 0; i < arrayLength; i++)
    {
        cin >> inputArray[i];
    }
    // 배열의 오름차순으로 정렬
    sort(inputArray, inputArray + arrayLength);

    // 정렬된 배열의 첫번째 값(제일 작은 값), 마지막 값(제일 큰 값) 출력
    cout << inputArray[0] << " " << inputArray[arrayLength - 1] << endl;
    // Pointer 해제
    delete[] inputArray;

    return 0;
}
// ## [2562번 최댓값](https://www.acmicpc.net/problem/10818)
#include <iostream>
using namespace std;
int main()
{
    // 사용자의 입력을 받은 값을 저장하는 배열
    int numberArray[9];
    // 배열의 길이를 구하는 변수(For문을 돌기 위해서 구함)
    int numberArrayLength = sizeof(numberArray) / sizeof(int);
    // 최대수를 저장하는 변수
    int maxNumber = 0;
    // 최대수가 배열의 몇번째 요소인지 저장하는 변수
    int maxNumberOrder = 0;
    for (int i = 0; i < numberArrayLength; i++)
    {
        // Array의 요소들을 입력받음
        cin >> numberArray[i];
        // 입력받은 값이 maxNumber보다 클 때
        if (numberArray[i] > maxNumber)
        {
            // 최대 수를 maxNumber 변수에 대입
            maxNumber = numberArray[i];
            // 최대 수가 배열의 몇번째 요소인지 구한 후에 maxNumberOrder에 대입
            maxNumberOrder = i + 1;
        }
    }
    cout << maxNumber << endl;
    cout << maxNumberOrder << endl;
    return 0;
}
// ## [2577번 숫자의 개수](https://www.acmicpc.net/problem/2577)
#include <iostream>
using namespace std;
int main()
{
    // InputNumber: 사용자 입력을 받을 변수 선언
    int inputNumber[3];
    // CalculatedNumber: 입력 받은 숫자를 계산할 변수
    int calculatedNumber = 0;
    // ResultArray: 0~9까지 몇번 쓰였는지 계산하는 변수
    // 0번째 배열: 0 숫자의 사용 횟수
    int result[10] = {
        0,
    };
    // 숫자 3개 입력
    cin >> inputNumber[0] >> inputNumber[1] >> inputNumber[2];
    // 입력 받은 숫자 계산
    // 계산식 = A * B * C
    calculatedNumber = inputNumber[0] * inputNumber[1] * inputNumber[2];
    // 계산값이 0이 아닐 때
    while (calculatedNumber != 0)
    {
        // calculatedNumber % 10 == 해당 자리의 숫자가 몇인지
        // Ex) 1501 일 때 calculatedNumber % 10 == 1
        result[calculatedNumber % 10] += 1;
        // 계산된 값은 나누기 처리
        calculatedNumber /= 10;
    }
    for (int i = 0; i < 10; i++)
    {
        cout << result[i] << endl;
    }
    return 0;
}
// ## [3052번 나머지](https://www.acmicpc.net/problem/3052)
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{
    // 입력 받을 백터 생성
    vector<int> inputVector;
    int input = 0;
    for (int i = 0; i < 10; i++)
    {
        // 숫자 입력
        cin >> input;

        // 백터에 PUSH
        inputVector.push_back(input % 42);
    }
    // 입력받은 데이터를 오름차순으로 정렬
    sort(inputVector.begin(), inputVector.end());

    // 입력받은 데이터 중에서 중복된 값이 있는 경우 삭제
    inputVector.erase(unique(inputVector.begin(), inputVector.end()), inputVector.end());
    cout << inputVector.size() << endl;
    return 0;
}
// ## [1546번 평균](https://www.acmicpc.net/problem/1546)
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    int arrayLength = 0;
    int maxScore = 0;
    double sumScore = 0;
    cout << fixed;
    cout.precision(2);
    cin >> arrayLength;
    double *scoreArray = new double[arrayLength];
    for (int i = 0; i < arrayLength; i++)
    {
        cin >> scoreArray[i];
        sumScore += scoreArray[i];
    }
    sort(scoreArray, scoreArray + arrayLength);
    maxScore = scoreArray[arrayLength - 1];
    sumScore = sumScore / maxScore * 100 / arrayLength;
    cout << sumScore << endl;

    return 0;
}
// ## [8958번 OX퀴즈](https://www.acmicpc.net/problem/8958)
#include <iostream>
using namespace std;
int main()
{
    int arrayLength = 0;
    int bonusScore = 0;
    cin >> arrayLength;
    string *problem = new string[arrayLength];
    int *totalScore = new int[arrayLength]{
        0,
    };
    for (int i = 0; i < arrayLength; i++)
    {
        cin >> problem[i];
    }
    for (int i = 0; i < arrayLength; i++)
    {
        bonusScore = 0;
        for (int j = 0; j < problem[i].size(); j++)
        {
            if (problem[i].at(j) == 'O')
            {
                bonusScore++;
                totalScore[i] += bonusScore;
            }
            else
            {
                bonusScore = 0;
                totalScore[i] += bonusScore;
            }
        }
    }
    for (int i = 0; i < arrayLength; i++)
    {
        cout << totalScore[i] << endl;
    }
    return 0;
}
// ## [4344번 평균은 넘겠지](https://www.acmicpc.net/problem/4344)
#include <iostream>
#include <vector>
using namespace std;
int main()
{
    // firstAmount: 시도 횟수
    int firstAmount = 0;
    cin >> firstAmount;
    // 소수점 세자리로 고정
    cout << fixed;
    cout.precision(3);
    for (int i = 0; i < firstAmount; i++)
    {
        // sum: 합계
        // secondAmount: 점수 갯수
        // count: 평균보다 높은 점수의 갯수
        // average: 평균
        int sum = 0;
        int secondAmount = 0;
        int count = 0;
        double average = 0;
        // 점수 갯수 입력
        cin >> secondAmount;
        int *array = new int[secondAmount]{
            0,
        };
        for (int j = 0; j < secondAmount; j++)
        {
            cin >> array[j];
            sum += array[j];
        }
        average = sum / secondAmount;
        for (int j = 0; j < secondAmount; j++)
        {
            if (array[j] > average)
            {
                count++;
            }
        }
        cout << (double)count / secondAmount * 100 << "%" << endl;
    }
    return 0;
}