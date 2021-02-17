package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel


class Veiculo(
    open val identificador: String,
) : Movimentavel {
    open var posicao: Posicao = Posicao()
    var dataDeAquisicao: Data = Data()
//    val requerCarta: Boolean = false

    fun requerCarta(): Boolean{
        return false
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }

    override fun toString(): String {
        "$identificador | $dataDeAquisicao | $posicao"
        return "${this::class} | $identificador | $dataDeAquisicao | $posicao"
    }


}
