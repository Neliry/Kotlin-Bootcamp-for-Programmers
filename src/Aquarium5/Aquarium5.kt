package Aquarium5

data class Fish (var name: String)

fun main (args: Array<String>){
    fishExample()
}

fun fishExample(){
    val fish = Fish("splashy")

    myWith (fish.name) {
    println(capitalize())
    }

    println(fish.run{name})

    println(fish.apply {  })

    val fish2:Fish = Fish(name= "splashy").apply{name = "Sharky"}
    println(fish2.name)

    println(fish.let { it.name.capitalize() }
            .let { it + "fish" }
            .let { it.length }
            .let {it + 31})
}

fun myWith(name: String, black:String.() -> Unit){
    name.black()
}