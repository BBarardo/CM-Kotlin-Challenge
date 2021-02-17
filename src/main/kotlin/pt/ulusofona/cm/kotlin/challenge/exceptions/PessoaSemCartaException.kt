package pt.ulusofona.cm.kotlin.challenge.exceptions

class PessoaSemCartaException : Exception() {
    override val message = "Nome da Pessoa não tem carta para conduzir o veículo indicado"
}
