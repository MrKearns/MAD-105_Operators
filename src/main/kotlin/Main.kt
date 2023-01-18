fun main(args: Array<String>) {

    var a = 10
    var b = 3
    var c = 11
    var d = 100

    var ans1 = a + b
    println("$a + $b = $ans1")

    var ans2 = b >= c
    println("$b is greater than or equal to $c = $ans2")

    var ans3 = ++ans1 * 2
    println("$ans1($a + $b incremented by 1) and multiplied by 2 = $ans3")

    var ans4 = ans3/b
    println("$ans3 / $b = $ans4")

    var ans5 = a+b+c < d
    println("$a + $b + $c is less than $d = $ans5")

    var ans6 = d % c
    var ans7 = d /c
    println("$d / $c = $ans7 with a remainder of $ans6")

    //println("Program arguments: ${args.joinToString()}")
}