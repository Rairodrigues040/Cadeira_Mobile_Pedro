//fun main() {
//    val manager = RaceManager()
//
//    manager.registerAthlete(Athlete(59, "Rai", 21, 5))
//    manager.registerAthlete(Athlete(58, "Pedro", 20, 10))
//    manager.registerAthlete(Athlete(57, "Kauã", 21, 5))
//    manager.registerAthlete(Athlete(56, "Harlan", 21, 10))
//
//    println()
//    manager.showAllAthletes()
//
//    val filter = manager.getAthletesByDistance(10)
//
//    println()
//    println("--------Filter--------")
//    filter.forEach { filtrado ->
//        println("${filtrado.name} vai correr ${filtrado.distanceKm}km hoje!")
//    }
//
//    println()
//    println("--------Media--------")
//    println(manager.calculateAverageAge())
//
//    val categoria = listOf(Athlete(59, "Rai", 21, 5), Athlete(58, "Pedro", 20, 10), Athlete(57, "Kauã", 21, 5), Athlete(56, "Harlan", 21, 10))
//    println()
//
//    val porCategoria = categoria.groupBy { it.distanceKm }
//
//    porCategoria.forEach { (distancia, atletas) ->
//        println("$distancia km:")
//
//        atletas.forEach {
//            println(" - ${it.name}")
//        }
//
//    }
//    println()
//    val findAthlete = manager.findAthleteByName("Rai")
//    println(findAthlete)
//}
//
//
//data class Athlete(
//    val registrationNumber: Int,
//    val name: String,
//    val age: Int,
//    val distanceKm: Int
//)
//
//class RaceManager {
//    private val athletes = mutableListOf<Athlete>()
//
//    fun registerAthlete(athlete: Athlete){
//        athletes.add(athlete)
//
//        println("Sucess: ${athlete.name} is ready for the ${athlete.distanceKm}Km race!")
//    }
//
//    fun showAllAthletes(){
//        println("--------Starting Lineup-------")
//        athletes.forEach{println(it)}
//    }
//
//    fun getAthletesByDistance(targetDistance: Int): List<Athlete> {
//        return athletes.filter{it.distanceKm == targetDistance}
//    }
//
//    fun calculateAverageAge(): Double {
//        if (athletes.isEmpty()) return 0.0
//        return athletes.map{it.age}.average()
//    }
//
//    fun findAthleteByName(searchName: String): String {
//        val retorno = athletes.find{it.name == searchName }
//        return retorno?.toString() ?: "Atleta não encontrado"
//    }
//
//}
//
//
//
//
//
//
//
//
//
//
//
