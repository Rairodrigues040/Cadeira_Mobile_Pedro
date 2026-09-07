fun main() {

    //para não ficar muita informação, retirei algumas instâncias da atv anterior.
    val manager = RaceManager()

    manager.registerAthlete(Athlete(59, "Rai", 21, 5))
    manager.registerAthlete(Athlete(58, "Pedro", 20, 10))
    manager.registerAthlete(Athlete(57, "Kauã", 21, 5))
    manager.registerAthlete(Athlete(56, "Harlan", 21, 10))

    println("At que vai correr 21km")
    val twentyOnekm = Athlete(55, "Marina", 26, 21)
    manager.registerAthlete(twentyOnekm)
    println(twentyOnekm)

    println()

    println("Atleta com corrida finalizada")
    val end = twentyOnekm.copy(55, "Marina", 26, 21, true)
    println(end)


    println()
    println("--------Filter for age and distance--------")
    val ageAndDistance = manager.getAdultHalfMarathoners()
    ageAndDistance.forEach {
        println("${it.name} vai correr ${it.distanceKm}")
    }

    println()
    println("--------null safety and Operator Elvis--------")
    val result = manager.checkRegistration(59)
    println(result)

    println()
    println("--------getRunnerNamesByDistance--------")
    val atheleteFilterForName = manager.getRunnerNamesByDistance(5)
    println(atheleteFilterForName)
}


data class Athlete(
    val registrationNumber: Int,
    val name: String,
    val age: Int,
    val distanceKm: Int,
    var hasFinished: Boolean = false
)

class RaceManager {
    private val athletes = mutableListOf<Athlete>()

    fun registerAthlete(athlete: Athlete){
        athletes.add(athlete)

        println("Sucess: ${athlete.name} is ready for the ${athlete.distanceKm}Km race!")
    }

    fun showAllAthletes(){
        println("--------Starting Lineup-------")
        athletes.forEach{println(it)}
    }

    fun getAthletesByDistance(targetDistance: Int): List<Athlete> {
        return athletes.filter{it.distanceKm == targetDistance}
    }

    fun calculateAverageAge(): Double {
        if (athletes.isEmpty()) return 0.0
        return athletes.map{it.age}.average()
    }

    fun findAthleteByName(searchName: String): String {
        val retorno = athletes.find{it.name == searchName }
        return retorno?.toString() ?: "Atleta não encontrado"
    }

    fun getAdultHalfMarathoners(): List<Athlete>{
        return athletes.filter { it.distanceKm == 21 && it.age >= 18 }
    }

    fun checkRegistration(number: Int): String {
        val athleteNumber = athletes.find { it.registrationNumber == number }
        return athleteNumber?.let { "Corredor confirmado: ${it.name}" } ?: "Inscrição inválida"
    }

    fun getRunnerNamesByDistance(targetDistance: Int) : List<String> {
        val athletFilter = athletes.filter { it.distanceKm == targetDistance }
        return athletFilter.map { it.name.uppercase()}

    }


}











