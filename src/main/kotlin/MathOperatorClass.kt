import java.util.*

class MathOperatorClass {

    private var numForRecursion = 100

    fun usg(num1:Int,num2:Int):Int{
        if(num2 == 0)return num1
        else return usg(num2,num1%num2)
    }

    fun usj(num1:Int,num2:Int):Int{
        return num1*num2/usg(num1,num2)
    }

    fun isThereDollar(word:String):Boolean{
        word.forEach {
            if(it == '$')return true
        }
        return false
    }

    fun recursionHundredSum():Int{
        var num =numForRecursion
        numForRecursion--
        if(numForRecursion==0){
            numForRecursion=100
            return 1
        }
        return num+recursionHundredSum()
    }

    fun rotateNum(num:Int):Int{
        var num1 = num
        var arr :Array<Int> = arrayOf(0)
        while(num1>0){
            arr += num1%10
            num1/=10
        }
        var sumOfNums = 0
        val l = arr.size
        var ten = 1
        for(i in l-1 downTo 0){
            sumOfNums+=arr[i]*ten
            ten*=10
        }
        return sumOfNums
    }

    fun isPolindrome(word:String):Boolean{
        var myStack =  Stack<Char>();
        val l = word.length
        for(i in 0..l-1){
            var b = false
            if(!myStack.isEmpty()){
                if(myStack.peek()==word[i]){
                    myStack.pop()
                    b=true
                }
            }
            if(!b)myStack.push(word[i])
            if(l%2==1&&i==l/2&&!b)myStack.pop()
        }
        if(myStack.isEmpty())return true
        else return false
    }
}