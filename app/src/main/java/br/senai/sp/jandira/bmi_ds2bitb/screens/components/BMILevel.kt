package br.senai.sp.jandira.bmi_ds2bitb.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BmiLevel(
    markColor: Color = Color.Red,
    text1: String = "",
    text2: String = "",
    isFilled: Boolean = false
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(
                top = 4.dp
            )
            .fillMaxWidth()
    ) {
        Card(
            modifier = Modifier
                .size(17.dp),
            shape = CircleShape,
            colors = CardDefaults.cardColors(
                containerColor = markColor
            )
        ) {  }
        Spacer(
            modifier = Modifier.width(20.dp)
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = if (isFilled) markColor else Color.Transparent
            )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = text1,
                    modifier = Modifier
                        .padding(start = 8.dp)
                )
                Text(
                    text = text2,
                    modifier = Modifier
                        .padding(end = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun BmiLevelPreview() {
    BmiLevel()
}