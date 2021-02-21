abstract class Animal(val age: Int, val name: String, val weight: Double)

class Dog(age: Int, name: String, weight: Double) : Animal(age, name, weight)

class Cat(age: Int, name: String, weight: Double) : Animal(age, name, weight)

val animalsInShelter = listOf(
    Dog(6, "Bobby", 10.2),
    Dog(2, "Doug", 3.7),
    Cat(2, "Cutie", 2.3),
    Dog(5, "Hugo", 3.1),
    Dog(1, "Bark", 1.4),
    Cat(4, "Cuddly Paws", 5.0),
    Dog(2, "The Count", 1.2),
    Cat(3, "Black Eyes", 1.8),
    Cat(2, "Meow", 3.2),
    Cat(8, "Cloudy", 4.1),
)

fun main() {
    // You can write some code here to test if below functions work
}

fun allDogs(): List<Dog> = animalsInShelter.filterIsInstance<Dog>()

fun allCats(): List<Cat> = animalsInShelter.filterIsInstance<Cat>()

fun allDogsInSortedInAlphabeticalOrder(): List<Dog> = allDogs().sortedBy { it.name }

fun allCatsInSortedInReverseAlphabeticalOrder(): List<Cat> =allCats().sortedBy { it.name }

fun animalsWhoWeighsLessThanFour(): List<Animal> = animalsInShelter.sortedBy { it.weight<4 }

fun catsSortedByTheirAgesInAscendingOrder(): List<Cat> =allCats().sortedBy { it.age }

fun dogSortedByTheirAgesInDescendingOrder(): List<Dog> = allDogs().sortedBy { it.age }

fun animalsWhoHasSpaceCharacterInTheirName(): List<Animal> = animalsInShelter.filter { it.name.contains(" ") }

fun numberOfAnimalsWhichAreOlderThanThree(): Int = animalsInShelter.filter { it.age>3 }.count()

fun sumOfWeightsOfAllCats(): Double =allCats().sumOf { it.weight }

fun catWithMaximumAge(): Cat = allCats().maxByOrNull { it.age }!!

fun dogWithLongestName(): Dog =allDogs().maxByOrNull { it.name.length }!!

fun animalsWhoAreYoungerThanFourAndHeavierThanTwo(): List<Animal> = animalsInShelter.filter {it.weight>2&&it.weight<4}

fun areAllCatsHeavierThanAllDogs(): Boolean =allCats().sumByDouble { it.weight }>allDogs().sumByDouble { it.weight }

fun areThereMoreCatsThanTheDogs(): Boolean =  allCats().size>allDogs().size

fun isThereAnyAnimalWhichHasLetterCInTheirName(): Boolean = animalsInShelter.filter{it.name.contains("C")}.isNotEmpty()

fun findTheAnimalWithNameHugo(): Animal =animalsInShelter.find { it.name == "Hugo" }!!

