package br.senai.sp.jandira.lionschool.screens.components

import android.media.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable

fun SchoolLevels(
    textTop: String = "Sigla",
    textTitle: String = "Título",
    textDesc: String = "Descrição",
    textDuration: String = "Duração",
    logo: Painter = painterResource(R.drawable.ic_launcher_foreground)
){
    Card (
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth(),
                border = BorderStroke(
                width = 1.dp,
                brush = Brush.horizontalGradient(
            listOf(
                Color(0xFFFFEB3B),
                Color(0xFF8A7408)
            )
        )
    )
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFF3247AF),
                            Color(0xFFD3D3D3)
                        )
                    )
                )
        ){
            Row (
                modifier = Modifier
                    .height(110.dp)
                    .padding(start = 8.dp, top = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically

            ){
                Image(
                    painter = logo,
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(110.dp)
                )
                Text(
                    text = textTop,
                    modifier = Modifier,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 80.sp,
                    color = colorResource(R.color.light_yellow)
                )
            }
            Column (
                modifier = Modifier
                    .padding(start = 20.dp, top = 6.dp)
                    .fillMaxWidth()
                    .height(60.dp)
            ){
                Text(
                    text = textTitle,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Text(
                    text = textDesc,
                    modifier = Modifier
                        .padding(top = 2.dp),
                    fontSize = 13.sp,
                    color = Color.White
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.watch),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(start = 16.dp)
                )
                Text(
                    text = textDuration,
                    modifier = Modifier
                        .padding(start = 6.dp),
                    color = Color.White
                )
            }
        }
    }
}

@Preview
@Composable

private fun SchoolLevelPreview(){
    SchoolLevels()
}