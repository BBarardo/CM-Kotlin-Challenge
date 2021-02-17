package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*
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


    println("----BICICLETA----")
    var bicicleta = Bicicleta("bike")
    println(bicicleta)
    println("carta? " + bicicleta.requerCarta())
    bicicleta.moverPara(1, 1)
    println(bicicleta.toString())
    try {
        bicicleta.moverPara(1, 1)
    } catch (e: Exception) {
        println(e)
    }
    println(bicicleta)

    var pessoa: Pessoa = Pessoa("José Amaro", date2)
    pessoa.tirarCarta()
    pessoa.comprarVeiculo(bicicleta)
    println(pessoa.temCarta())
    println(pessoa.pesquisarVeiculo("bike"))

    var pessoa2 = Pessoa("barnabé", Date())
    try {
        pessoa2.tirarCarta()
    } catch (e: Exception) {
        println(e)
    }
    println(pessoa2.temCarta())



    println("----CARRO----")
    var carro = Carro("car", Motor(100, 1700))
    println(carro)
    println(carro.estaLigado())
    println("DESLIGAR CARRO (ERRO)")
    try {
        carro.desligar()
    } catch (e: Exception) {
        println(e)
    }

    println("LIGAR CARRO")
    try {
        carro.ligar()
    } catch (e: Exception) {
        println(e)
    }
    println(carro.estaLigado())
    println("LIGAR CARRO (ERRO)")
    try {
        carro.ligar()
    } catch (e: Exception) {
        println(e)
    }

    println("----MOTOR----")
    println(carro.motor)

    println("----PESSOA MOVER VEICULO----")
    try {
        pessoa.moverVeiculoPara("bike",1,1)
    }catch (e:Exception){
        println(e)
    }
}
