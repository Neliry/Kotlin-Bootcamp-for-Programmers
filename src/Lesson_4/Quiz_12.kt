package Lesson_4

fun main(args: Array<String>) {

    val spiceCabinet = listOf(SpiceContainer(Spice("Yellow Curry", "mild")),
            SpiceContainer(Spice("Red Curry", "medium")),
            SpiceContainer(Spice("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}
