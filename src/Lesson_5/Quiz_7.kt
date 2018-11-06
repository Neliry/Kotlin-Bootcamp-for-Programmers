package Lesson_5

const val MAX_NUMBER_BOOKS = 20

class Book1(val title: String,  val author: String) {

    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    object Constants {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    fun printUrl() {
        println(Constants.BASE_URL + title + ".html")
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }
}

