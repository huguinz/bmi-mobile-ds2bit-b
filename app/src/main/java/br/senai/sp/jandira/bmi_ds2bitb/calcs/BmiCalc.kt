package br.senai.sp.jandira.bmi_ds2bitb.calcs

import androidx.annotation.ColorRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import br.senai.sp.jandira.bmi.R
import br.senai.sp.jandira.bmi_ds2bitb.model.Bmi
import br.senai.sp.jandira.bmi_ds2bitb.model.BmiStatus
import kotlin.math.pow

@Composable
fun bmiCalculator(height: Double, weight: Int): Bmi{

    val bmi = weight / height.pow(2)

    when {
        bmi < 18.5 ->
            return  Bmi(
                bmi = Pair("", bmi),
                bmiStatus = BmiStatus.UNDERWEIGHT,
                color = colorResource(R.color.light_blue)
            )
        else ->
            return Bmi(
                bmi = Pair("", bmi),
                bmiStatus = BmiStatus.OBESITY3,
                color = colorResource(R.color.red)
            )
    }
}