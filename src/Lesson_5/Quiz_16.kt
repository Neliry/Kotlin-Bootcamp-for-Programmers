package Lesson_5

fun main(args: Array<String>) {
    Building(Wood()).build()
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}