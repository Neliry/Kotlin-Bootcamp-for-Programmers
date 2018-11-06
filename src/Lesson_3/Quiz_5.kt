package Lesson_3

import java.util.*

fun main(args: Array<String>) {
    println("${if ( Calendar.getInstance().get(Calendar.HOUR_OF_DAY)< 12) "Good Morning Kotlin" else "Good Night Kotlin"}")
}