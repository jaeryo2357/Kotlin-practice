fun main(args:Array<String>){
    var obj:Any= test()
    print(obj)

    var obj2=test2("kotlin")
    println(obj2)

    obj=obj2 // obj 자료형을 Any로 지정했기 때문에 어느 클래스든 들어갈 수 있다.
    //obj2=obj 위 문장이 실행되지 않고 이 문장이 실행되면 error obj2는 testr자료형

    var obj3=test3("kotlin")
    obj3.name="test"
    println(obj3.name)

    var obj4=test3()
}


class test()
class test2 constructor(name:String)
{
    init{
        println("name:$name")
    }
}
class test3(var name:String){

    constructor(name:String,age:Int):this(name){
        println("1")
    }

    constructor():this("kotlin",20){
        println(2)
    }
}