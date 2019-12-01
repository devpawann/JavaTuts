import java.util.*
fun main(args:Array<String>){
    val scanner=Scanner(System.`in`)
    println("1.Add \n 2.Subtract\n 3.Multiply\n 4.Division \n 5.Exit \n")
    val choice=scanner.nextInt()
    val num1=scanner.nextInt()
    val num2=scanner.nextInt()
    var calculator:Calculator=Calculator(num1,num2)
   when(choice){
       1 -> calculator.add()
       2 -> calculator.subt()
       3 -> calculator.mul()
       4 -> calculator.divide()
       else -> println("Enter a valid input")
   }

}
class Calculator constructor(var p:Int,var q:Int) {
    private var x=p
    private var y=q

    public fun add(){
        var sum=p+q
        println("Sum of $p and $q is = $sum")
    }
    public fun subt(){

    }
    public fun mul(){

    }
    public fun divide(){

    }

}