package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable

fun HomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ){
        Column (
            modifier = Modifier
                .padding(24.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 28.dp)
                    .height(200.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column (
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "",

                    modifier = Modifier
                        .height(180.dp)
                        .fillMaxWidth()
                )
                }
                Column (
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = stringResource(R.string.lion_school),
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(R.color.light_blue)
                    )
                }
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 46.dp)
                    .height(200.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Text(
                    text = stringResource(R.string.find_favorite),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.light_blue)
                )
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 30.dp)
                        .width(50.dp)
                        .height(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(R.color.light_yellow)
                        )
                ){}
                Text(
                    modifier = Modifier,
                    text = stringResource(R.string.long_text),
                    fontSize = 20.sp,
                    color = Color.Gray,

                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp)
                        .height(48.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(R.color.light_yellow)
                    ),
                    border = BorderStroke(
                        width = 2.dp,
                        color = colorResource(R.color.light_blue)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.get_started),
                        color = colorResource(R.color.light_blue),
                        fontSize = 18.sp
                    )
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column (
                    modifier = Modifier
                        .weight(1f)
                ){
                    Image(
                        painter = painterResource(R.drawable.lion_youtube),
                        contentDescription = "",
                        modifier = Modifier
                            .height(45.dp)
                            .fillMaxWidth()
                    )
                }
                Column (
                    modifier = Modifier
                        .weight(1f)
                ){
                    Image(
                        painter = painterResource(R.drawable.lion_twitter),
                        contentDescription = "",
                        modifier = Modifier
                            .height(45.dp)
                            .fillMaxWidth()
                    )
                }
                Column (
                    modifier = Modifier
                        .weight(1f)
                ){
                    Image(
                        painter = painterResource(R.drawable.lion_instagram),
                        contentDescription = "",
                        modifier = Modifier
                            .height(45.dp)
                            .fillMaxWidth()
                    )
                }
                Column (
                    modifier = Modifier
                        .weight(1f)
                ){
                    Image(
                        painter = painterResource(R.drawable.lion_facebook),
                        contentDescription = "",
                        modifier = Modifier
                            .height(45.dp)
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}