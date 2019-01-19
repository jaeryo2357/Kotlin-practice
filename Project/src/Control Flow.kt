import java.lang.Integer.parseInt

// if문이 값을 반환할 수 있음

fun main(args: Array<String>) {

    var a=2
    var b=3
    val max=if(a>b)a else b //if else가 하나의 식으로 표현됨 (반환값)반드시 else를 동반해야함

    val max2=if(a>b){  //각 브랜치들이 마지막에 있는 값이 반환값
        print("Choose a")
        a
    }else{
        print("Choose b")
        b
    }
    var c=4

    val max3=if(a>b)a else if(a<c) c else b

    println(max)
    println(max2)
    println(max3)

    //When 반환값을 적용할수있음

    var x=20

    var res=when(x){  //when이 식으로 사용되는 경우 else가 필수...but
        100-> "A"
        else -> "F"
    }

    //컴파일러가 else가 필요업다는 거를 증명하면 else안써도됨

    when(x)  // 함수도 조건문에 들어갈수있음
    {
        parseInt("20")-> {print(x)}
        else -> print(x)
    }

    when(x){ //범위 연산자를 이용해서 사용가능
        in 1..10 -> print(x)
        !in 1..10-> print (x)
    }

    //is 연산자 ,, if else 대체할 수있음



    // for(item in collection) iterator를 반환하는 모든 것을 반복 할 수 있음

    //iterator를 반환하고 있어야 하고  next와 hasNext를 가지고 있어야함   // 다시해보기

    val array= arrayOf("가","나","다")

    for(index in array.indices)
      println("$index:${array[index]}")

    for((index,value) in array.withIndex())
    {
        println("$index:$value")
    }

    do{
        var y:Int? =10
    }while(y!=null)
}
