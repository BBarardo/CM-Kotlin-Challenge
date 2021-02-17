package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Posicao
import pt.ulusofona.cm.kotlin.challenge.models.Veiculo
import java.time.LocalDate
import java.time.Period
import java.time.ZoneId
import java.util.*

fun main() {

    var data = Date()

    var rigthNow: Calendar = Calendar.getInstance()

    println("${rigthNow.get(Calendar.DATE)}-${rigthNow.get(Calendar.MONTH) + 1}-${rigthNow.get(Calendar.YEAR)}")
    println(data)

    var pos = Posicao(1, 1)
    try {
        pos.alterarPosicaoPara(1, 1)

    } catch (e: Exception) {
        println(e)
    }

    var vei = Veiculo("adasd")

    println(vei)

    var date2: Date = GregorianCalendar(1997, 0, 3).time
    println(date2)

    var anos = Period.between(date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()).years
    println("anos = ${anos}")

}
