package Lesson_4

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

abstract class Spice2(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry1(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : Spice2(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder1 {
    fun grind()
}

interface SpiceColor1 {
    val color: Color
}

object YellowSpiceColor1 : SpiceColor1 {
    override val color = Color.YELLOW
}