package Lesson_6

fun main(args: Array<String>) {

    val game = Game_1()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }

    println(game.path)
}

enum class Direction_1 {
    NORTH, EAST, WEST, SOUTH, START, END
}

class Game_1 {
    var path = mutableListOf<Direction_1>(Direction_1.START)
    val north = { path.add(Direction_1.NORTH) }
    val south = { path.add(Direction_1.SOUTH) }
    val east = { path.add(Direction_1.EAST) }
    val west = { path.add(Direction_1.WEST) }
    val end = { path.add(Direction_1.END); println("Game Over: $path"); path.clear(); false }

    fun move(where: () -> Boolean ) {
        where.invoke()
    }

    fun makeMove(command:String?) {
        if (command.equals("n")) move(north)
        else if (command.equals("s")) move(south)
        else if (command.equals("e")) move(east)
        else if (command.equals("w")) move(west)
        else move(end)
    }
}


