import java.util.*
import kotlin.math.abs

fun main(args: Array<String>)
{
    val a:Int
    //val a:Int=5 error 상수로 최대 1번까지 값 대입
    a=10
    println(a)

    var b: Short=2
    var c:Double =b.toDouble() //명시적 변환

    //var d:Double=b error error 형이 맞지 않아
    println(b)
    println(c)

    var array1:Array<String> =arrayOf("0","1")
    var array2:Array<Int> = arrayOf(1,2,3,4)
    var array3:Array<String> = Array(5,{i -> i.toString() })

    println(array1.toString())
    println(array2.toString())
    println(Arrays.toString(array3))

    for(index in array3)
    {
        print(index)
    }

    var str1:String=" String test"

    var str2: String=""" String
        Test
    """
    println(str1)
    println(str2)
}