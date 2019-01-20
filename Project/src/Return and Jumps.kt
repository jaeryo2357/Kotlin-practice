fun main(args: Array<String>) {

    loop@for(i in 1..10)
    {
        for(j in 1..10)
        {
            if(j==4) continue@loop
            println("$i x $j=${i*j}")
        }
    }

    var list=listOf(0,1,2,3)


    var max=list.map{
        if(it==0)return@map "zero"
        "number$it"
    }

    list.forEach(loop@{
        if (it == 1) return@loop
        print("$it")
    }
    )

    println(max)

}