package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Carro(
    val identificador: String,
    private val motor: Motor
) : Ligavel {

    var posicao: Posicao = Posicao(0, 0)
    var ligado = false

    override fun ligar() {
        motor.ligar()
        ligado = true
    }

    override fun desligar() {
        motor.desligar()
        ligado = false
    }

    override fun estaLigado(): Boolean {
        return ligado
    }

//    override fun toString(): String {
//        return "Carro | $identificador | $motor, posicao=$posicao, ligado=$ligado)"
//    }


}
