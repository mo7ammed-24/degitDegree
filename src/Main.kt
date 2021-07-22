fun main() {
    print(digitDegree(100))
}

fun digitDegree(n: Int): Int {static.count=0 ;return myfunction(n)}

fun myfunction(n:Int):Int{if(n.toString().length==1)
    return 0
else{
    var myString=n.toString()
    var sum=0
    for(i in 0 until myString.length)
        sum+=myString[i].toString().toInt()
    static.count++
    myfunction(sum)
}
    return static.count}

object static {var count=0 }
