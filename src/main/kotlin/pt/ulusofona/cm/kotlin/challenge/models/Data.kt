package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Data() {
    var _data: Calendar = Calendar.getInstance()

    constructor(data: Calendar) : this() {
        _data = data
    }

    override fun toString(): String {
        return "${_data.get(Calendar.DATE)}-" +
                "${_data.get(Calendar.MONTH) + 1}-" +
                "${_data.get(Calendar.YEAR)}"
    }
}
