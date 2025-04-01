package br.senai.sp.jandira.bmi_ds2bitb.utils

import br.senai.sp.jandira.bmi_ds2bitb.model.BmiStatus
import java.util.Locale

fun numberFormat(number: Double) =
    String.format(
        Locale.getDefault(),
        "%.1f",
        number
    )

fun isFilled(userStatus: BmiStatus, status: BmiStatus): Boolean {
    if (userStatus == status) {
        return true
    } else {
        return false
    }
}