package Aquarium.Decorations

fun main(args: Array<String>){
    makeDecorations()
}

fun makeDecorations() {

    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d1)

    val d3 = Decorations("slate")
    println(d1)

    println(d1.equals(d2))
    println(d3.equals(d2))

    var d4: Decorations = d3.copy()
    println(d3)
    println(d4)

    val d5= Decorations2("crystal", "wood", "diver")
    println(d5)

    val (rock: String, wood: String, diver: String)=d5
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations(val rocks: String){}

data class Decorations2(val rock: String, val wood: String, val diver: String){}
