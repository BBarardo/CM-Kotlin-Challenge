package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period

class Pessoa(
    val nome: String,
    val dataDeNascimento: Data
) : Movimentavel {

    var veiculos: ArrayList<Veiculo> = ArrayList()
    lateinit var carta: Carta
    var posicao: Posicao = Posicao()


    fun comprarVeiculo(veiculo: Veiculo) {
        veiculos.add(veiculo)

        veiculo.dataDeAquisicao = Data()
    }

    fun pesquisarVeiculo(identificador: String): Veiculo {
        return veiculos.filter { veiculo: Veiculo -> veiculo.identificador == identificador }[0]
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa) {

        val veiculo = pesquisarVeiculo(identificador)

        veiculos.remove(veiculo)

        comprador.comprarVeiculo(veiculo)
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int) {
        pesquisarVeiculo(identificador).moverPara(x, y)
    }

    fun temCarta(): Boolean {
        return this::carta.isInitialized
    }

    fun tirarCarta(){
        var birthLocalDate: LocalDate = LocalDateTime.ofInstant(dataDeNascimento._data.toInstant(),dataDeNascimento._data.timeZone.toZoneId()).toLocalDate()
        if(Period.between(birthLocalDate, LocalDate.now()).years <= 17){
            throw MenorDeIdadeException()
        }

        carta = Carta()
    }
    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }

    override fun toString(): String {
        return "${this::class} | $nome | $dataDeNascimento | $posicao"
    }


}
