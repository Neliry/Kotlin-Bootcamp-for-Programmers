package Lesson_5

import java.util.*

fun main (args: Array<String>){
    val puppy = Puppy()
    val book = Book2("Dune", "Frank Herbert",  653)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Sad puppy, no more pages in ${book.title}. ")
}

class Book2(val title: String,  val author: String, var pages: Int) {

    fun weight() : Double { return (pages * 1.5) }

    fun tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

}

class Puppy() {
    fun playWithBook(book: Book2) {
        book.tornPages(Random().nextInt(12))
    }
}