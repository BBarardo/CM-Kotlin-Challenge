package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Data
import pt.ulusofona.cm.kotlin.challenge.models.Posicao
import java.util.*

fun main() {

    var data = Data()

    var rigthNow: Calendar = Calendar.getInstance()

    println("${rigthNow.get(Calendar.DATE)}-${rigthNow.get(Calendar.MONTH) + 1}-${rigthNow.get(Calendar.YEAR)}")
    println(data)

    var pos = Posicao(1, 1)
    try {
        pos.alterarPosicaoPara(1, 1)

    } catch (e: Exception) {
        println(e)
    }
}
