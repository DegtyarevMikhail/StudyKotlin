package com.example.studykotlin

class KotlinLoop {
    /** To replace the most common use cases of such loopsKotlin uses the concepts of ranges.
     *  Displaying a range produces a readable format
     *  A range is essentially just an interval between two values, usually numbers: a start and an end.
     */
    fun main(args:Array<String>) {
// prints the number in reverse order.
        for (i in 6 downTo 1) {
            print(i)
        }
// prints the number jumps 4 steps using step operator
        for (k in 1..10 step 4) {
            print(k)
        }
//prints the number from start number to end number using dot operator.
        for (y in 1..5) {
            print(y)
        }
//prints the number using characters.
        for (ch in 'a'..'z') {
            print(ch)
        }
        //displaying a range value using rangeto operator.
        for( u in 1.rangeTo(30)){
            print(u)
        }
        //prints the number using integers.
        var range: IntRange = 1..10
        for (item: Int in range) {
            print(item)
        }
        //displaying a value using int progression
        var stepProgression:IntProgression=1..100 step 10
        for(k:Int in stepProgression){
            print(k)
        }
        //displaying a value using char progression
        var reverseRange:CharProgression= 'z' downTo 'a'
        for(range: Char in reverseRange){
            print(range)
        }

        //displaying the min ,max and average values using kotlin ranges.
        var r =(1..10)
      //  println(r.min())
       // println(r.max())
        println(r.sum())
        println(r.average())

    }


}