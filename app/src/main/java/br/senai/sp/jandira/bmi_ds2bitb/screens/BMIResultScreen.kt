package br.senai.sp.jandira.bmi_ds2bitb.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R

@Composable

fun BMIResultScreen(navController: NavHostController?){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFF143077),
                        Color(0xFF237D98),
                    )
                )
            ),
        contentAlignment = Alignment.BottomCenter
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier
                        .padding(start = 28.dp, top = 30.dp)
                        .weight(1f),
                    text = stringResource(R.string.bmi_result),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(730.dp),
                shape = RoundedCornerShape(
                    topStart = 32.dp,
                    topEnd = 32.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Card(
                        modifier = Modifier
                            .size(110.dp),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 5.dp,
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xFF143077),
                                    Color(0xFF237D98)
                                )
                            )
                        ),
                        colors = CardDefaults.cardColors(
                            Color.White
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = stringResource(R.string.result_example),
                                fontSize = 35.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = stringResource(R.string.result_text_example),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(90.dp),
                        colors = CardDefaults.cardColors(
                            Color(0xFF7888F5)
                        )
                    ) {
                        Row (verticalAlignment = Alignment.CenterVertically){
                            Column(
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(R.string.age),
                                    fontSize = 17.sp,
                                )
                                Text(
                                    text = stringResource(R.string.age_number),
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            VerticalDivider()
                            Column(
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(R.string.weight),
                                    fontSize = 17.sp,
                                )
                                Text(
                                    text = stringResource(R.string.weight_number),
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            VerticalDivider()
                            Column(
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(R.string.weight_number),
                                    fontSize = 17.sp,
                                )
                                Text(
                                    text = stringResource(R.string.high_number),
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                            .background(Color.Blue)
                    ){}
                    HorizontalDivider()
                    Button(
                        onClick = {
                            navController?.navigate("user_data")
                        },
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF354AD2)
                        )
                    ) {
                        Text(
                            text = stringResource(R.string.nem_calc),
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }
    }
}



@Preview(showSystemUi = true)
@Composable
private fun BMIResultScreenPreview() {
    BMIResultScreen(navController = null)
}