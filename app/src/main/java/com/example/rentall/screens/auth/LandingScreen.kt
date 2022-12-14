package com.example.rentall.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rentall.R
import com.example.rentall.component.ButtonType
import com.example.rentall.component.CircleBlur
import com.example.rentall.component.DefaultButton
import com.example.rentall.screens.auth.navigation.AuthRoute
import com.example.rentall.ui.theme.*

@Composable
fun LandingScreen(navController: NavHostController) {
    val circleSize = 450.dp
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Picton200)
    ){
        Box(modifier = Modifier
            .align(Alignment.BottomStart)
            .offset(y = 180.dp, x = (-150).dp)){
            CircleBlur(
                contentScale = ContentScale.FillBounds,
                width = circleSize,
                height = circleSize
            )
        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                ,
            painter = painterResource(id = R.drawable.ic_half_circle),
            contentDescription = "half circle",
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = GridMargin.value.margin, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(100.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.vec_car_money),
                modifier = Modifier.size(260.dp),
                contentDescription = "car and money",
                contentScale = ContentScale.Fit
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(18.dp)
            ){
                Text(
                    text = "Rental dan sewa mobil tanpa ribet dan cepat",
                    style = MaterialTheme.typography.h3,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Dengan RentAll Anda bisa menjangkau penyewa lebih luas dan lebih mudah",
                    style = MaterialTheme.typography.h5,
                    textAlign = TextAlign.Center,
                )
            }
        }
        Box(
            Modifier
                .padding(
                    bottom = 50.dp,
                    start = GridMargin.value.margin,
                    end = GridMargin.value.margin
                )
                .align(Alignment.BottomCenter)){
            DefaultButton(
                text = "Mulai",
                ButtonType.TEXT,
                buttonColor = Color.White,
                modifier = Modifier.fillMaxWidth(),
                iconRight = R.drawable.ic_baseline_chevron_right_24,
                iconSizeInput = 18.dp,
                onClick = {
                    navController.navigate(AuthRoute.Register.route)
                }
            )
        }
    }
}

@Preview
@Composable
fun LandingPrev() {
    val navController = rememberNavController()
    RentAllTheme {
        LandingScreen(navController = navController)
    }
}
