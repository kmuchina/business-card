package com.example.businesscard

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF3ddc84),

                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun Profile(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(start = 5.dp, top = 50.dp, end = 5.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .background(color = Color.Black)
                .size(150.dp)
        )

        Text(
            text = "KENNEDY MUCHINA",
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp,
            modifier  = Modifier.padding(top = 10.dp)
        )

        Text(
            text = "Associate Android Developer",
            fontWeight = FontWeight.Bold,
            fontSize = 21.sp,
            color = Color(0xFF004D40)
        )
    }
}

@Composable
fun Contact(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(
                start = 5.dp,
                top = 50.dp,
                bottom = 20.dp,
                end = 5.dp
            )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 53.dp, bottom = 10.dp)
        ) {
            Icon(
                Icons.Outlined.Call,
                contentDescription = "Call",
                tint = Color(0xFF004D40),
                modifier = Modifier
                    .padding(end = 15.dp)
                    .size(16.dp)
            )

            Text(
                text = "+254 703 537 578",
                fontSize = 12.sp,
                textAlign = TextAlign.Start
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp, bottom = 10.dp)
        ) {
            Icon(
                Icons.Outlined.Email,
                contentDescription = "Email",
                tint = Color(0xFF004D40),
                modifier = Modifier
                    .padding(end = 15.dp)
                    .size(16.dp)
            )

            Text(
                text = "kmuchina22@gmail.com",
                fontSize = 12.sp
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            Icon(
                Icons.Outlined.LocationOn,
                contentDescription = "Location",
                tint = Color(0xFF004D40),
                modifier = Modifier
                    .padding(end = 15.dp)
                    .size(16.dp)
            )

            Text(
                text = "Juja, Kiambu County, Kenya",
                fontSize = 12.sp
            )
        }


    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
      Column (
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally,

      ) {
          Profile(modifier = modifier)
          Contact(modifier = modifier)
      }
}

@Preview(
    name = "Business Car",
    showBackground = false

)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Surface(
            color = Color(0xFF3ddc84),
            modifier = Modifier.fillMaxSize()

        ) {
            BusinessCard()
        }

    }
}