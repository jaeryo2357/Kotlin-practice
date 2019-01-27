fun main(args: Array<String>) {

}


open class AA

class BB:AA(){}

open class A constructor(){

    constructor(x:Int,s:String) : this() {

    }
}

 class B: A {

     constructor():super(){}

     constructor(x:Int):this(){}

     constructor(t:Int,s:String):super(t,s){}
 }

open class A2{

    open fun f(){  print("A")}

    fun ff(){ print("AA")}
}

class B2:A2(){
    override fun f(){ print("B")}

    //override fun f(){print("BB")} error


}

open class A3{
    open val A:Int = 2
}

class B3:A3(){
    override val A:Int=1
}