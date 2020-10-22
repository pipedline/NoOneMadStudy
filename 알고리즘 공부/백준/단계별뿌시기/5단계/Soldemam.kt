// ## [10818번 최소, 최대](https://www.acmicpc.net/problem/10818)
fun main() {
    val T = readLine()!!.toInt()
    val str = readLine()!!.split(" ")
    var intArr: Array<Int> = Array<Int>(T) {
        str[it].toInt()
    }
    solve1(intArr)
}
// 시작할때 min과 max를 첫번째 값을 넣어놓고 큰지, 작은지를 함께 비교
// 조건에 부합할 경우 각각의 index를 기록
fun solve1(intArr: Array<Int>) {
    var min = intArr[0]
    var max = intArr[0]
    var minIndex = 0
    var maxIndex = 0
    for (i in 0 until intArr.size) {
        if (intArr[i] <= min) {
            min = intArr[i]
            minIndex = i
        }
        if (intArr[i] >= max) {
            max = intArr[i]
            maxIndex = i
        }
    }
    print("${intArr[minIndex]} ${intArr[maxIndex]}")
}

// with(System.`in`.bufferedReader()) {
//     readLine()
//     readLine()!!.split(" ").map{it.toInt()}.run{
//         println("${min()} ${max()}")
//     }
// }

// ## [2562번 최댓값](https://www.acmicpc.net/problem/10818)
fun main() {
    val intArr = Array<Int>(9) {
        readLine()!!.toInt()
    }
    // Q1의 solve1과 동일. 기준이 되는 max값보다 큰 값이 있다면 index를 기록
    var maxIndex = 0
    var max = intArr[0]
    for (i in 1 until intArr.size) {
        if (intArr[i] > max) {
            maxIndex = i
            max = intArr[i]
        }
    }
    println(max)
    println(maxIndex + 1)
    val a = intArr.maxOrNull()
    println("===")
    println(intArr.maxOrNull())
    println(intArr.indexOf(a) + 1)
}
// ## [2577번 숫자의 개수](https://www.acmicpc.net/problem/2577)
fun main() {
    // 숫자 개수 세기
    var num = 1 // 곱해야하므로 1 선언
    for (i in 0..2) {
        // 입력 받는 3개의 값을 바로바로 num에 곱해줌
        num *= readLine()!!.toInt()
    }
    // 글자를 1개씩 떼어낸 후 Char 배열로 
    val charArr = num.toString().toCharArray()
    val resultArr = Array<Int>(10) {
        // 10칸짜리 Int 배열을 만든 후 각각 0을 넣어줌.
        0
    }
    // Char를 Int로 변환하면 아스키코드가 되므로 48을 빼줌
    for (i in charArr) {
        resultArr[i.toInt() - 48]++
    }
    // 결과를 각각 출력
    for (i in resultArr) {
        println(i)
    }
}
// ## [3052번 나머지](https://www.acmicpc.net/problem/3052)
import java.util.HashSet
fun main() {
    val set = HashSet<Int>()
    for(i in 0..9) {
        set.add(readLine()!!.toInt()%42)
    }
    println(set.size)
}
// ## [1546번 평균](https://www.acmicpc.net/problem/1546)
fun main() {
    val T = readLine()!!.toInt()
    val strArr = readLine()!!.split(" ")
    val floatArr = Array<Float>(T) {
        strArr[it].toFloat()
    }
    val max = floatArr.max()!!
    var total = 0f
    for(i in floatArr.indices) {
        floatArr[i] /= max
        total += floatArr[i]
    }
    println(total/T*100)
}
// ## [8958번 OX퀴즈](https://www.acmicpc.net/problem/8958)
fun main() {
    val T = readLine()!!.toInt()
    val strArr = Array<String>(T) {
        readLine()!!
    }
    // O (였던것)
    var wasO = false
    var total = 0
    var count = 0
    for (i in strArr) {
        i.forEach {
            if (it=='O') {  // O라면 wasO를 true로, count를 1 올림
                wasO = true
                count++
            } else if (wasO && it =='X') { // wasO가 O임과 동시에 X인 경우
                wasO = false
                total += sum(count)  //count만큼 sum해줌
                count = 0
            }
        }
        if (wasO) total += sum(count)
        println(total)
        total = 0
        wasO = false
        count = 0
    }
}
fun sum(num: Int):Int {
    var total = 0
    for(i in 1..num) {
        total += i
    }
    return total
}
// ## [4344번 평균은 넘겠지](https://www.acmicpc.net/problem/4344)
fun main() {
    val T = readLine()!!.toInt()
    for (i in 0 until T) {
        val strArr = readLine()!!.split(" ")
        // 학생수에 맞게끔 Int 배열 만들어줌
        val intArr = Array<Int>(strArr.size-1) {
            strArr[it+1].toInt()
        }
        // 총점
        var total: Float = 0f
        intArr.forEach{
            total += it
        }
        // 평균
        val avg = total / strArr[0].toInt()
        // 학생 수
        var count = 0
        //평균이상인 학생수를 count
        intArr.forEach {
            if (it > avg) {
                count++
            }
        }
        val result = String.format("%2.3f",count/(strArr[0].toFloat())*100)
        println("$result%")
    }
}
