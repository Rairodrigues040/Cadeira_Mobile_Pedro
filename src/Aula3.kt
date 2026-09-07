fun main() {
    println("--------- EXERCÍCIO 01 ---------")
    executarExercicio01()

    println("\n--------- EXERCÍCIO 02 ---------")
    executarExercicio02()

    println("\n--------- EXERCÍCIO 03 ---------")
    executarExercicio03()

    println("\n--------- EXERCÍCIO 04 ---------")
    executarExercicio04()

    println("\n--------- EXERCÍCIO 05 ---------")
    executarExercicio05()
}

// --- EXERCÍCIO 01 ---
fun executarExercicio01() {
    val reservaInicial = LabReservation(labName = "Laboratório 01", studentId = 20, isConfirmed = false)
    val reservaConfirmada = reservaInicial.copy(isConfirmed = true)

    println("Reserva Inicial: '${reservaInicial.labName}' '${reservaInicial.studentId}' '${reservaInicial.isConfirmed}'")
    println("Reserva Confirmada: '${reservaConfirmada.labName}' '${reservaConfirmada.studentId}' '${reservaConfirmada.isConfirmed}'")
}

data class LabReservation (
    val labName: String,
    val studentId: Int,
    val isConfirmed: Boolean
)


// --- EXERCÍCIO 02 ---
fun executarExercicio02() {
    val idsAlunosBrutos = listOf(101, 102, 102, 103, 101, 104)
    val idsAlunosUnicos = idsAlunosBrutos.toMutableSet()

    idsAlunosUnicos.add(105)

    println("Registro de Presença: $idsAlunosUnicos")
}


// --- EXERCÍCIO 03 ---
fun executarExercicio03() {
    val pecasHardware = mapOf (
        "Processador" to 850.50,
        "RAM 16GB" to 320.00
    )

    val precoGpu = pecasHardware["GPU"] ?: 0.0

    println(precoGpu)
}


// --- EXERCÍCIO 04 ---
fun executarExercicio04() {
    val usuarios = listOf(
        AppUser("alice_dev", 22, true),
        AppUser("bob_99", 17, true),
        AppUser("charlie_x", 35, false),
        AppUser("diana_ux", 19, true)
    )

    usuarios.filter { it.isActive }
        .filter { it.age >= 18 }
        .map { it.username.uppercase() }
        .forEach { println("Acesso concedido para: $it") }
}

data class AppUser (
    val username: String,
    val age: Int,
    val isActive: Boolean
)


// --- EXERCÍCIO 05 ---
fun executarExercicio05() {
    val notas = listOf(
        Grade("Pedro", "Mobile", 9.5),
        Grade("Maria", "Mobile", 8.0),
        Grade("Pedro", "Web", 7.5),
        Grade("João", "Web", 9.0)
    )

    val notasPorDisciplina = notas.groupBy { it.subject }

    println(notasPorDisciplina)

    for ((disciplina, listaNotas) in notasPorDisciplina) {
        val maiorNota = listaNotas.maxByOrNull { it.score }
        if (maiorNota != null) {
            println("Disciplina: $disciplina --> Maior Nota: ${maiorNota.score} --> Aluno: ${maiorNota.studentName}")
        }
    }
}

data class Grade (
    val studentName: String,
    val subject: String,
    val score: Double
)