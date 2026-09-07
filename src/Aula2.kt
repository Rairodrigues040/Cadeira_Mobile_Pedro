package org.example


fun main() {
    println("=== FICHA DO HERÓI ===")
    val nome = "Raí legendary"
    val classe = "Mago do Kotlin"

    var nivel = 1
    var armaEspecial: String? = null

    var armaEquipada = armaEspecial ?: "Mãos nuas (Coragem!)"

    var danoBase = armaEspecial?.length ?: 5

    println("Nome: $nome")
    println("Classe: $classe")
    println("Nivel de $nome: $nivel")
    println("Arma Equipada: $armaEquipada")
    println("Dano de Ataque: $danoBase")
    println("=============================")

    // Desafio Bônus

    println()
    println("Desafio Bônus")

    armaEspecial = "Teclado Mecânico RGB"
    armaEquipada = armaEspecial ?: "Mãos nuas (Coragem!)"
    danoBase = armaEspecial?.length ?: 5

    println("Arma Equipada: $armaEquipada")
    println("Dano de Ataque: $danoBase")

}