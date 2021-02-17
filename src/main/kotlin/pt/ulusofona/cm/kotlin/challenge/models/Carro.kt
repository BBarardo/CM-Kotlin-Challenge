package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Carro(
    override val identificador: String,
    private val motor: Motor
) : Veiculo(identificador), Ligavel {

    override var posicao: Posicao = Posicao(0, 0)
    var ligado = false

    override fun requerCarta(): Boolean {
        return true
    }

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
