package com.example.studykotlin

class LoopClass (forLoops: Any?){
fun forLoops() {
    val someList: List<String> = arrayListOf()
    for (listElement in someList) {
        print(listElement)
    }

    someList.forEach { print(it) }

    for (i in 1..10) {
        print("Hello World!")
    }

    for (i in 10 downTo 1 step 2) {
        print("Hello Kotlin!")
    }

    for (i in someList.indices) {
        print(someList[i])
    }

    for (i in 0 until someList.size) {
        print(someList[i])
    }
  }
}