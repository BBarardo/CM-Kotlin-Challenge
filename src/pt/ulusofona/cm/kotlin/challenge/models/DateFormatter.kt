package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

object DateFormatter {

    fun formatter(date: Date): String {
        var data: Calendar = Calendar.getInstance()
        data.time = date
        return "${data.get(Calendar.DATE)}-" +
                "${data.get(Calendar.MONTH) + 1}-" +
                "${data.get(Calendar.YEAR)}"
    }

//    override fun toString(): String {
//        return "${_data.get(Calendar.DATE)}-" +
//                "${_data.get(Calendar.MONTH) + 1}-" +
//                "${_data.get(Calendar.YEAR)}"
//    }
}
